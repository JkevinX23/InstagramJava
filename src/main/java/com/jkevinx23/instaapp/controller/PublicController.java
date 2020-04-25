/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import java.io.File;
import org.json.JSONObject;


public class PublicController {
    
    Connection con = new Connection();
    String token = Keys.BearerToken;
    
    public void Store(File image, String description){
        
        String route = "/public";
        
        String response = con.POST_MULTIPART_AUTH(route, image, token);
        
        JSONObject json = new JSONObject(response);
        
        String idpublic = json.get("_id").toString();
        
        setDescription(idpublic, description);
        
    }

    private void setDescription(String idpublic, String description) {
        String route = "/public/desc";
        JSONObject json = new JSONObject();
        json.put("idpublic", idpublic);
        json.put("description", description);
        String response = con.POST_JSON_AUTH2(route, json, token);
        System.out.println("DESCRIPTION SET: "+response);
    }
}   
