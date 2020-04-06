/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.models;

/**
 *
 * @author jkevi
 */
public class Like {
    private String user_id;
    private String public_id;

    public String getPublic_id() {
        return public_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setPublic_id(String public_id) {
        this.public_id = public_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
