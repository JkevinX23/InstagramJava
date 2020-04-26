/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;

/**
 *
 * @author jkevi
 */
public class FollowController {
    Connection con = new Connection();
    String token = Keys.BearerToken;
    
    public String store(String idfollow){
        String route = "/flow/"+idfollow;
        try{
            
        String response = con.GET_AUTH(route, token);
        System.out.println("Follow response: "+ response);
        return response;
    }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
    }
       return "error";
    }
    
    public String index(){
        String route  = "/flow";
        String response = con.GET_AUTH(route, token);
        return response;
    }
}



