/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller.SwingWorkers;

import com.jkevinx23.instaapp.Feed;
import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.models.User;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;
import org.json.JSONObject;

/**
 *
 * @author jkevi
 */
public class AsyncGetUserID extends SwingWorker<User, Void> {

    String iduser;
    Feed feed;
    String token = Keys.BearerToken;
    
    public AsyncGetUserID(String iduser, Feed feed){
        this.feed = feed;
        this.iduser = iduser;
    }
    
    
    @Override
    protected User doInBackground() throws Exception {
        Connection con = new Connection();
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

    @Override
    protected void done() {
        try {
            super.done();
            User user;
            user = get();
            feed.getUsername().setText(user.getName());
            
            if(!user.getProfilePhoto().isEmpty()){
                AsyncGetUserPhoto asyncGetUserPhoto = new AsyncGetUserPhoto(user.getId(), feed.getProfilePhoto());
                asyncGetUserPhoto.execute();                                
            }
   
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(AsyncGetUserID.class.getName()).log(Level.SEVERE, null, ex);
        }   
    } 
}
    



