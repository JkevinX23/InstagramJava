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
    private String path;
    private String id_user;
    private String tb_like;
    private String tb_comment;
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setTb_comment(String tb_comment) {
        this.tb_comment = tb_comment;
    }

    public void setTb_like(String tb_like) {
        this.tb_like = tb_like;
    }

    public String getDescription() {
        return description;
    }

    public String getId_user() {
        return id_user;
    }

    public String getPath() {
        return path;
    }

    public String getTb_comment() {
        return tb_comment;
    }

    public String getTb_like() {
        return tb_like;
    }

}
