/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.models.Comment;

/**
 *
 * @author jkevi
 */
public class CommentController {
    
    public void store(Comment comment){
        Connection con  = new Connection();
        String token = Keys.BearerToken;
        
         String response = con.POST_JSON_AUTH("/public/comment", comment, token);
         
         System.out.println(" :: COMMENT :: "+ response);
    }
    
}
