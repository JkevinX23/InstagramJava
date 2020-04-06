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
public class Comment {
   private String id_user;
   private String id_publication;
   private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setId_publication(String id_publication) {
        this.id_publication = id_publication;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getContent() {
        return content;
    }

    public String getId_publication() {
        return id_publication;
    }

    public String getId_user() {
        return id_user;
    }
   
   
}
