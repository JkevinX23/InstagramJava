/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.models.User;
import org.json.JSONObject;

/**
 *
 * @author jkevi
 */
public class PrincipalController {
     Connection con = new Connection();

    public User getUser() {
        User user = new User();
        
        //String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1ZTg2N2JlZGExZDM3NjNlNzIyOGZmODUiLCJpYXQiOjE1ODY0ODYwMTMsImV4cCI6MTU4NzA5MDgxM30.rkUK4V6xCW4lYAW68N3E-ZShxjJLpjGGrWS5KsvQqUg";
        String token = Keys.BearerToken;
        String responseString = con.GET_AUTH("/user", token);
        JSONObject jsonObject = new JSONObject(responseString);
   
        user.setBio(jsonObject.getString("bio"));
        user.setName(jsonObject.getString("name"));
        user.setUsername(jsonObject.getString("username"));
        
       return user;
    }
     
}
