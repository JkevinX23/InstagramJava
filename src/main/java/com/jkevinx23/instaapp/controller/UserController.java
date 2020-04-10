/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.models.User;
import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import org.json.JSONObject;

/**
 *
 * @author jkevin
 */
public class UserController {
    Connection con = new Connection();
    
    public int login(String email,String senha)
    {
        User user = new User();
        user.setEmail(email);
        user.setPassword(senha);
        String responseString = con.POST_JSON("/session",user);
        
        if(responseString.compareTo("error")==0){
            System.out.println("catch");
            return 1; 
        }
        
        if(responseString.compareTo("{\"error\":\"Password not match\"}")==0){
            System.out.println("Senha incorreta");
            return -1; 
        }
            
        if(responseString.compareTo("{\"error\":\"User not found.\"}")==0){
            System.out.println("Email incorreto");
            return -2;
        }

        JSONObject result = new JSONObject(responseString);
        String bToken = result.get("token").toString();
        System.out.println("::TOOKEEEN:: "+bToken);
        Keys.BearerToken = bToken;

        return 0;
    }

    public int createAccount(User user){
        String responseString = con.POST_JSON("/cadastrar",user);
        
        if(responseString.compareTo("error")==0){
            System.out.println("catch");
            return 1; 
        }
        
        if(responseString.compareTo("{\"error\":\"User already exists.\"}")==0){
            System.out.println("Usuário já cadastrado");
            return -1;
        }
         if(responseString.compareTo("{\"error\":\"Username already exists.\"}")==0){
            System.out.println("Username já cadastrado");
            return -2;
        }
        System.out.println("CREATE ACCOUNT::: "+ responseString);
        return 0;
    }
}
