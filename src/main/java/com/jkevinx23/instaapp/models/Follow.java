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
public class Follow {
    private String iduser;
    private String idfollowed;
    private Boolean active;

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setIdfollowed(String idfollowed) {
        this.idfollowed = idfollowed;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public Boolean getActive() {
        return active;
    }

    public String getIdfollowed() {
        return idfollowed;
    }

    public String getIduser() {
        return iduser;
    }
   
}
