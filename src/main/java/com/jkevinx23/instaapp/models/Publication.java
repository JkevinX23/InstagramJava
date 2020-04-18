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
public class Publication {
    
    private String id;
    private String path;
    private String iduser;
    private String description;
    private String createat;

      public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getCreateat() {
        return createat;
    }

    public void setCreateat(String createat) {
        this.createat = createat;
    }

    public String getUpdateat() {
        return updateat;
    }

    public void setUpdateat(String updateat) {
        this.updateat = updateat;
    }
    private String updateat;
    
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public String getIduser() {
        return iduser;
    }

    public String getPath() {
        return path;
    }

}
