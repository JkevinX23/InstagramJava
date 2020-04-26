/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.controller;

import com.jkevinx23.instaapp.auxiliar.DisposeWindow;
import com.jkevinx23.instaapp.config.Connection;
import com.jkevinx23.instaapp.config.Keys;
import com.jkevinx23.instaapp.models.User;
import com.jkevinx23.instaapp.view.Profile.Profiles;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import org.json.JSONArray;

/**
 *
 * @author jkevi
 */
public class ProfileController {

    Connection con = new Connection();
    String token = Keys.BearerToken;
    DefaultListModel listModel = new DefaultListModel();
    User[] users;

    public void index(JList list) {

        String route = "/user/index";

        String response = con.GET_AUTH(route, token);
        JSONArray usuarios = new JSONArray(response);
        int size = usuarios.length();
        users = new User[size];
        for (int i = 0; i < size; i += 1) {
            String name = usuarios.getJSONObject(i).get("name").toString();
            String username = usuarios.getJSONObject(i).get("username").toString();
            String bio = usuarios.getJSONObject(i).get("bio").toString();
            String profilephoto = usuarios.getJSONObject(i).get("profilephoto").toString();
            String id = usuarios.getJSONObject(i).get("_id").toString();

            User user = new User();
            user.setBio(bio);
            user.setId(id);
            user.setName(name);
            user.setProfilePhoto(profilephoto);
            user.setUsername(username);
            users[i] = user;

            listModel.addElement(username);
            list.setModel(listModel);
        }

        System.out.println("SETANDO LISTA DE TAMANHO: " + size);
        list.setModel(listModel);
        
       list.addListSelectionListener((ListSelectionEvent e) -> {
           if(!e.getValueIsAdjusting()){
               userprofile(list.getSelectedIndex());
               DisposeWindow dw = new DisposeWindow();
               dw.dispose(list);
           }
           
       });
    }

    private void userprofile(int selected) {
        Profiles profiles = new Profiles(users, selected);
        profiles.setVisible(true);
    }
}
