/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;


public class LikeController {
    Connection con = new Connection();
    String token = Keys.BearerToken;
    
    public void Store(String idpublic){
        String route  = "/public/like/"+idpublic;
        String response = con.GET_AUTH(route, token);
        System.out.println("LIKE: "+ response);
    }
}
