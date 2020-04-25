/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.models.Comment;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import org.json.JSONArray;

/**
 *
 * @author jkevi
 */
public class CommentController {

    Connection con = new Connection();
    String token = Keys.BearerToken;
    DefaultListModel listModel = new DefaultListModel();

    public void store(Comment comment) {

        String response = con.POST_JSON_AUTH("/public/comment", comment, token);

        System.out.println(" :: COMMENT :: " + response);
    }

    public void index(String publicID, JList list) {

        String response = con.GET_AUTH("/public/comment/" + publicID, token);

        JSONArray contentList = new JSONArray(response);
        
        System.out.println("SIZE COMMENTS RESPONSE :: " + contentList.length());

        list.setModel(listModel);

        setJList(contentList, listModel, list);

    }

    public void clearJList(JList list) {
        listModel.clear();
        list = new JList(listModel);
    }

    private void setJList(JSONArray contentList, DefaultListModel listModel, JList list) {
        for (int i = 0; i < contentList.length(); i += 1) {
            String content = contentList.getJSONObject(i).get("content").toString();
            listModel.addElement(content);        
        }
        
        list = new JList(listModel);
    }

}
