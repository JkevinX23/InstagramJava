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
public class Notification {
    private String id_user;
    private String type;
    private String content;
    private Boolean read;
    private String id_public;

    public String getContent() {
        return content;
    }

    public String getId_public() {
        return id_public;
    }

    public String getId_user() {
        return id_user;
    }

    public Boolean getRead() {
        return read;
    }

    public String getType() {
        return type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId_public(String id_public) {
        this.id_public = id_public;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public void setType(String type) {
        this.type = type;
    }

}
