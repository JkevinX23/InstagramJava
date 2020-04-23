/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp;

import javax.swing.JLabel;

/**
 *
 * @author jkevi
 */
public class ProfileHead {
    
    private JLabel userPhoto;
    private JLabel nameLabel;
    private JLabel usernameLabel;
    private JLabel followersNumber;
    private JLabel followingNumber;

    public JLabel getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(JLabel userPhoto) {
        this.userPhoto = userPhoto;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public JLabel getFollowersNumber() {
        return followersNumber;
    }

    public void setFollowersNumber(JLabel followersNumber) {
        this.followersNumber = followersNumber;
    }

    public JLabel getFollowingNumber() {
        return followingNumber;
    }

    public void setFollowingNumber(JLabel followingNumber) {
        this.followingNumber = followingNumber;
    }
   
}
