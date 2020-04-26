/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.controller.SwingWorkers.AsyncGetPublicPhoto;
import com.jkevinx23.instaapp.models.Publication;
import java.io.File;
import javax.swing.JLabel;
import org.json.JSONArray;
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
    
    public Publication[] index(String iduser){
        
        String route = "/public/" + iduser;
        
        String response = con.GET_AUTH(route, token);
        
        JSONArray json = new JSONArray(response);
        
        int size = json.length();
        
        Publication[] ps = new Publication[size];
        
        for(int i=0; i<size; i++){
            Publication p = new Publication();
            p.setId(json.getJSONObject(i).get("_id").toString());
            p.setPath(json.getJSONObject(i).get("path").toString());
            p.setDescription(json.getJSONObject(i).get("descricao").toString());
            ps[i] = p;
        }
        
        return ps;
        
    }
    
    public void setPublicPhoto(JSONObject pb, JLabel label){
        AsyncGetPublicPhoto agpp = new AsyncGetPublicPhoto(pb, label, 60);
        agpp.execute();
    }
}   
