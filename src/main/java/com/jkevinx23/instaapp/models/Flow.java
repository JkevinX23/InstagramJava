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
public class Flow {
    private String user_id;
    private String flowed_id;
    private Boolean active;

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setFlowed_id(String flowed_id) {
        this.flowed_id = flowed_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Boolean getActive() {
        return active;
    }

    public String getFlowed_id() {
        return flowed_id;
    }

    public String getUser_id() {
        return user_id;
    }
   
}
