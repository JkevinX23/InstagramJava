/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.view.Profile;

import com.jkevinx23.instaapp.auxiliar.DisposeWindow;
import com.jkevinx23.instaapp.controller.FollowController;
import com.jkevinx23.instaapp.controller.PublicController;
import com.jkevinx23.instaapp.controller.SwingWorkers.AsyncGetUserPhoto;
import com.jkevinx23.instaapp.models.Follow;
import com.jkevinx23.instaapp.models.Publication;
import com.jkevinx23.instaapp.models.User;
import javax.swing.ImageIcon;
import org.json.JSONArray;
import org.json.JSONObject;



public class Profiles extends javax.swing.JFrame {

    User[] users;
    Publication[] publications;
    Follow[] follows;
    int pos;
    int index = 0;

    public Profiles(User[] users, int pos) {
        this.users = users;
        this.pos = pos;
        initComponents();
        getFollows();
        setPublicationArray();
        setFields();
        verifyFollow();

        if (publications.length > 0) {

            setPublication();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        iv_photo = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelBio = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        publicView = new javax.swing.JLabel();
        labelIndex = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        followIcon = new javax.swing.JLabel();
        nextButtom = new javax.swing.JLabel();
        backButtom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 45, 61));
        jPanel1.setForeground(new java.awt.Color(30, 45, 61));

        jPanel2.setBackground(new java.awt.Color(24, 30, 47));

        jLabel1.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 170, 76));
        jLabel1.setText("Profiles");

        close.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 11)); // NOI18N
        close.setForeground(new java.awt.Color(242, 170, 76));
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_logout_rounded_left_30px.png")); // NOI18N
        close.setText("Voltar");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(close)
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(close))
        );

        iv_photo.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_user_50px.png")); // NOI18N

        nameLabel.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(242, 170, 76));
        nameLabel.setText("Name");

        labelUsername.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 12)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(242, 170, 76));
        labelUsername.setText("@username");

        labelBio.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 12)); // NOI18N
        labelBio.setForeground(new java.awt.Color(242, 170, 76));
        labelBio.setText("Bio");

        jLabel8.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 170, 76));
        jLabel8.setText("Seguidores: ");

        jLabel9.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 170, 76));
        jLabel9.setText("132165");

        jLabel10.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 170, 76));
        jLabel10.setText("323210");

        jLabel11.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 170, 76));
        jLabel11.setText("Seguindo: ");

        jLabel13.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(242, 170, 76));
        jLabel13.setText("Publicações");

        publicView.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_picture_60px.png")); // NOI18N

        labelIndex.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelIndex.setForeground(new java.awt.Color(242, 170, 76));
        labelIndex.setText("0/5");

        next.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_next_page_20px.png")); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_back_to_20px_1.png")); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        followIcon.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 11)); // NOI18N
        followIcon.setForeground(new java.awt.Color(242, 170, 76));
        followIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_add_user_male_30px.png")); // NOI18N
        followIcon.setText("Seguir");
        followIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                followIconMouseClicked(evt);
            }
        });

        nextButtom.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_circled_right_30px_1.png")); // NOI18N
        nextButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtomMouseClicked(evt);
            }
        });

        backButtom.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_go_back_30px.png")); // NOI18N
        backButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtomMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iv_photo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameLabel))
                    .addComponent(labelUsername)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(labelBio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(publicView)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(next, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addContainerGap()))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(followIcon)
                        .addGap(94, 94, 94))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButtom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButtom)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iv_photo)
                        .addGap(18, 18, 18)
                        .addComponent(labelBio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelUsername)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(followIcon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backButtom)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(jLabel13)
                            .addComponent(labelIndex))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publicView)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(next)
                                .addGap(18, 18, 18)
                                .addComponent(back)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButtom)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verifyFollow() {
        for (Follow f : follows) {
            if (f.getActive() && f.getIdfollowed().equals(users[pos].getId())) {
                System.out.println("Change icon");
                followIcon.setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_checked_user_male_30px.png"));
                followIcon.setText("Seguindo");
                break;
            }
        }
    }

    private void getFollows() {
        System.out.println("VRRRAAAAUUU");
        followIcon.setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_add_user_male_30px.png"));
        followIcon.setText("Seguir");
        FollowController fc = new FollowController();
        String response = fc.index();
        JSONArray json = new JSONArray(response);
        int size = json.length();
        follows = new Follow[size];
        System.out.println("SIZE: " + size);
        for (int i = 0; i < size; i++) {
            String idfollower = json.getJSONObject(i).get("iduser").toString();
            String iduser = json.getJSONObject(i).get("iduser").toString();
            Boolean active = (Boolean) json.getJSONObject(i).get("active");

            Follow f = new Follow();
            f.setActive(active);
            f.setIdfollowed(idfollower);
            f.setIduser(iduser);

            follows[i] = f;
        }

    }

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        if (publications.length > index - 1) {
            index += 1;
            setPublication();
        }

    }//GEN-LAST:event_nextMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (index > 0) {
            index -= 1;
            setPublication();
        }
    }//GEN-LAST:event_backMouseClicked

    private void followIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_followIconMouseClicked

        FollowController fc = new FollowController();
        String repsonse = fc.store(users[pos].getId());
        setFollowIcon();


    }//GEN-LAST:event_followIconMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked

        DisposeWindow dw = new DisposeWindow();
        dw.dispose(back);

    }//GEN-LAST:event_closeMouseClicked

    private void nextButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtomMouseClicked
        if (users.length > pos + 1) {
            pos += 1;
            index = 0;
            setPublicationArray();
            setFields();
            verifyFollow();
            if (publications.length > 0) {
                setPublication();
            }
        }
    }//GEN-LAST:event_nextButtomMouseClicked

    private void backButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtomMouseClicked
        if (pos - 1 >= 0) {
            pos -= 1;
            index = 0;
            setPublicationArray();
            setFields();
            verifyFollow();
            if (publications.length > 0) {
                setPublication();
            }
        }
    }//GEN-LAST:event_backButtomMouseClicked

    private void setPublication() {
        PublicController pc = new PublicController();
        JSONObject json = new JSONObject(publications[index]);
        pc.setPublicPhoto(json, publicView);
        labelIndex.setText(index + 1 + "/" + publications.length);
    }

    private void setPublicationArray() {
        PublicController pc = new PublicController();
        publications = pc.index(users[pos].getId());
    }

    private void setFields() {
        User user = users[pos];
        nameLabel.setText(user.getName());
        labelBio.setText(user.getBio());
        labelUsername.setText(user.getUsername());
        setProfileImage(user);
        labelIndex.setText(0 + "/" + publications.length);
    }

    private void setFollowIcon() {
        FollowController fc = new FollowController();
        String response = fc.store(users[pos].getId());
        followIcon.setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_checked_user_male_30px.png"));
        followIcon.setText("Seguindo");
    }

    private void setProfileImage(User user) {
        AsyncGetUserPhoto agup = new AsyncGetUserPhoto(user.getId(), iv_photo);
        agup.execute();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel backButtom;
    private javax.swing.JLabel close;
    private javax.swing.JLabel followIcon;
    private javax.swing.JLabel iv_photo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBio;
    private javax.swing.JLabel labelIndex;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel next;
    private javax.swing.JLabel nextButtom;
    private javax.swing.JLabel publicView;
    // End of variables declaration//GEN-END:variables

}
