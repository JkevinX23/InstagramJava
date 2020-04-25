/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.view.Profile;

import com.jkevinx23.instaapp.models.User;

/**
 *
 * @author jkevi
 */
public class Profiles extends javax.swing.JFrame {

    User[] users;
    int pos;
    public Profiles(User[] users, int pos) {
        this.users = users;
        this.pos = pos;
        initComponents();
        setFields();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        iv_photo = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelBio = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nextButtom = new javax.swing.JLabel();
        backButtom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 45, 61));
        jPanel1.setForeground(new java.awt.Color(30, 45, 61));

        jPanel2.setBackground(new java.awt.Color(24, 30, 47));

        jLabel1.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 170, 76));
        jLabel1.setText("Profiles");

        jLabel18.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(242, 170, 76));
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_logout_rounded_left_30px.png")); // NOI18N
        jLabel18.setText("Voltar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel18)
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
                .addComponent(jLabel18))
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

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_picture_60px.png")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(242, 170, 76));
        jLabel15.setText("0/5");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_next_page_20px.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_back_to_20px_1.png")); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 170, 76));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_add_user_male_30px.png")); // NOI18N
        jLabel12.setText("Seguir");

        nextButtom.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_circled_right_30px_1.png")); // NOI18N

        backButtom.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Profile\\Icons\\icons8_go_back_30px.png")); // NOI18N

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
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addContainerGap()))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
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
                            .addComponent(jLabel12))
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
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
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

    
    private void setFields(){
        User user = users[pos];
        nameLabel.setText(user.getName());
        labelBio.setText(user.getBio());
        labelUsername.setText(user.getUsername());       
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButtom;
    private javax.swing.JLabel iv_photo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelBio;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nextButtom;
    // End of variables declaration//GEN-END:variables
}
