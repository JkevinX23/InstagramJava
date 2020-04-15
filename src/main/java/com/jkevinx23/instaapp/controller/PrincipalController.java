/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.models.User;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
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
public class PrincipalController {

    Connection con = new Connection();
    String token = Keys.BearerToken;

    public User getUser() {
        User user = new User();

        //String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZTg2N2JlZGExZDM3NjNlNzIyOGZmODUiLCJpYXQiOjE1ODY0ODYwMTMsImV4cCI6MTU4NzA5MDgxM30.rkUK4V6xCW4lYAW68N3E-ZShxjJLpjGGrWS5KsvQqUg";
        String responseString = con.GET_AUTH("/user", token);
        JSONObject jsonObject = new JSONObject(responseString);

        user.setBio(jsonObject.getString("bio"));
        user.setName(jsonObject.getString("name"));
        user.setUsername(jsonObject.getString("username"));
        user.setProfilePhoto(jsonObject.getString("profilePhoto"));
        return user;
    }

    public Image getProfilePhoto() {
        Image png = null;
        String responseString = con.GET_AUTH("/user/photo", token);
        JSONObject jsonObject = new JSONObject(responseString);
        String path = jsonObject.getString("fileUrl");
        BufferedImage image = null;
        try {
            URL url = new URL(path);
            png = ImageIO.read(url);
            return png;

        } catch (MalformedURLException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
