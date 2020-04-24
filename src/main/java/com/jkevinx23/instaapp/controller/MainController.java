/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.models.Publication;
import com.jkevinx23.instaapp.models.User;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.json.JSONObject;

/**
 *
 * @author jkevi
 */
public class MainController {

    Connection con = new Connection();
    String token = Keys.BearerToken;

    public User getUser() {
        User user = new User();       
        String responseString = con.GET_AUTH("/user", token);
        JSONObject jsonObject = new JSONObject(responseString);

        user.setBio(jsonObject.getString("bio"));
        user.setName(jsonObject.getString("name"));
        user.setUsername(jsonObject.getString("username"));
        user.setProfilePhoto(jsonObject.getString("profilephoto"));
        return user;
    }

    public User getUserFromID(String iduser){
        User user = new User();
        
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("iduser", iduser);   
        String responseString = con.POST_JSON_AUTH2("/public/profile/user",jsonObject ,token); 
        
        
        JSONObject response = new JSONObject(responseString);
        user.setId(response.getString("_id"));
        user.setName(response.getString("name"));
        user.setUsername(response.getString("username"));
        //user.setBio(response.getString("bio"));  
        user.setProfilePhoto(response.getString("profilephoto"));

        
        return user;
    
    }

    public Publication getPublic(JSONObject publics){
        Publication pb = new Publication();
        
        pb.setId(publics.get("_id").toString());
        pb.setPath(publics.get("path").toString());
        //pb.setDescription(publics.get("description").toString());
        
        return pb;
    }
    
    public Image getPublicationPhoto(JSONObject pb){
        Image png;
        String response = con.POST_JSON_AUTH2("/public/pic", pb, token);
        JSONObject jsonObject = new JSONObject(response);
        String path = jsonObject.getString("fileUrl");
          try {
            URL url = new URL(path);
            png = ImageIO.read(url);
            return png;

        } catch (MalformedURLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Image getProfilePhoto() {
        Image png;
        String responseString = con.GET_AUTH("/user/photo", token);
        JSONObject jsonObject = new JSONObject(responseString);
        String path = jsonObject.getString("fileUrl");
        try {
            URL url = new URL(path);
            png = ImageIO.read(url);
            return png;

        } catch (MalformedURLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Image getUserPhoto(User user){
        
        Image png;
        JSONObject id = new JSONObject();
        id.put("_id", user.getId());
        String response = con.POST_JSON_AUTH2("/public/profile", id, token);
        JSONObject jsonObject = new JSONObject(response);
        System.out.println(response);
        String path = jsonObject.getString("fileUrl");
          try {
            URL url = new URL(path);
            png = ImageIO.read(url);
            return png;

        } catch (MalformedURLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String getFeed(){
        return con.GET_AUTH("/feed", token);
    }

}
