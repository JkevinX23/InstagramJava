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

    private String idpublic;
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void setIdpublic(String idpublic) {
        this.idpublic = idpublic;
    }

    public String getContent() {
        return content;
    }

    public String getIdpublic() {
        return idpublic;
    }

}
