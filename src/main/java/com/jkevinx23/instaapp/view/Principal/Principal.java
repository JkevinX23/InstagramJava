/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.view.Principal;

import com.jkevinx23.instaapp.Feed;
import com.jkevinx23.instaapp.ProfileHead;
import com.jkevinx23.instaapp.controller.AsyncFeedController;
import com.jkevinx23.instaapp.controller.CommentController;
import com.jkevinx23.instaapp.controller.LikeController;
import com.jkevinx23.instaapp.controller.MainController;
import com.jkevinx23.instaapp.models.User;
import java.awt.CardLayout;
import java.io.File;
import java.nio.charset.Charset;
import javax.swing.JFileChooser;

import com.jkevinx23.instaapp.controller.UserController;
import com.jkevinx23.instaapp.models.Comment;
import com.jkevinx23.instaapp.view.PublicStore.PublicStore;
import javax.swing.ImageIcon;
import org.json.JSONArray;
import com.jkevinx23.instaapp.view.Profile.IndexProfiles;

/**
 * @author jkevin
 */
public class Principal extends javax.swing.JFrame {

    public String[] ID_USER_FEED;
    public int PAGE;
    public int SIZE;
    public JSONArray jSONArray;
    public Feed feed;
    public CommentController commentController;

    CardLayout cardLayout;

    public Principal() {
        commentController = new CommentController();

        initComponents();
        getFeed();
        setHeader();
        setiduserFeed();
        
        if(ID_USER_FEED.length > 0){
            setFeed();
            setComments();

        }
       
        cardLayout = (CardLayout) pnlCards.getLayout();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        userImageView = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        followersNumber = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        followingNumber = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnlCards = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        createPublic = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        pulbicProfilePhoto = new javax.swing.JLabel();
        publicUsername = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        descPublic = new javax.swing.JLabel();
        ivPublic = new javax.swing.JLabel();
        likeButtom = new javax.swing.JLabel();
        nextButom = new javax.swing.JLabel();
        backFeed = new javax.swing.JLabel();
        buttonComment = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inComment = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentsList = new javax.swing.JList<>();
        pnlSettings = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        bt_edit_profile_photo = new javax.swing.JButton();
        pnlFollowing = new javax.swing.JPanel();
        pnlFollower = new javax.swing.JPanel();
        pnlProfile = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menuProfile = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHeader.setBackground(new java.awt.Color(30, 45, 61));

        jLabel6.setBackground(new java.awt.Color(242, 170, 76));
        jLabel6.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 170, 76));
        jLabel6.setText("InstApp");

        jLabel7.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 170, 76));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_search_30px.png")); // NOI18N
        jLabel7.setText("Usuários");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(30, 45, 61));

        userImageView.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_user_50px.png")); // NOI18N
        userImageView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 170, 76)));

        nameLabel.setBackground(new java.awt.Color(30, 45, 61));
        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(242, 170, 76));
        nameLabel.setText("João Kevin");

        followersNumber.setBackground(new java.awt.Color(30, 45, 61));
        followersNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        followersNumber.setForeground(new java.awt.Color(242, 170, 76));
        followersNumber.setText("150");

        usernameLabel.setBackground(new java.awt.Color(30, 45, 61));
        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(242, 170, 76));
        usernameLabel.setText("@kevin");

        followingNumber.setBackground(new java.awt.Color(30, 45, 61));
        followingNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        followingNumber.setForeground(new java.awt.Color(242, 170, 76));
        followingNumber.setText("120");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(userImageView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(32, 32, 32)
                        .addComponent(followersNumber))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(followingNumber)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userImageView)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(followersNumber)
                            .addComponent(nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(followingNumber))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlCards.setBackground(new java.awt.Color(24, 30, 47));
        pnlCards.setToolTipText("");
        pnlCards.setLayout(new java.awt.CardLayout());

        pnlHome.setBackground(new java.awt.Color(24, 30, 47));

        createPublic.setBackground(new java.awt.Color(255, 255, 255));
        createPublic.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        createPublic.setForeground(new java.awt.Color(242, 170, 76));
        createPublic.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_add_40px.png")); // NOI18N
        createPublic.setText("Nova Publicação");
        createPublic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createPublicMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(24, 30, 47));
        jPanel4.setForeground(new java.awt.Color(24, 30, 47));

        jPanel5.setBackground(new java.awt.Color(30, 45, 61));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pulbicProfilePhoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_user_42px.png")); // NOI18N

        publicUsername.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        publicUsername.setForeground(new java.awt.Color(242, 170, 76));
        publicUsername.setText("João Kevin");

        temp.setForeground(new java.awt.Color(242, 170, 76));
        temp.setText("4 min");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_menu_vertical_18px_1.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pulbicProfilePhoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicUsername)
                    .addComponent(temp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 604, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(publicUsername)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(temp))
                .addComponent(pulbicProfilePhoto, javax.swing.GroupLayout.Alignment.LEADING))
        );

        jPanel6.setBackground(new java.awt.Color(24, 30, 47));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        descPublic.setBackground(new java.awt.Color(242, 170, 76));
        descPublic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descPublic.setForeground(new java.awt.Color(242, 170, 76));
        descPublic.setText("                 Essa é minha incrivel foto huehu");

        ivPublic.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_picture_240px.png")); // NOI18N

        likeButtom.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 14)); // NOI18N
        likeButtom.setForeground(new java.awt.Color(242, 170, 76));
        likeButtom.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_heart_20px.png")); // NOI18N
        likeButtom.setText("Like");
        likeButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                likeButtomMouseClicked(evt);
            }
        });

        nextButom.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        nextButom.setForeground(new java.awt.Color(242, 170, 76));
        nextButom.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_circled_right_40px.png")); // NOI18N
        nextButom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButomMouseClicked(evt);
            }
        });

        backFeed.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        backFeed.setForeground(new java.awt.Color(242, 170, 76));
        backFeed.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_go_back_40px.png")); // NOI18N
        backFeed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backFeedMouseClicked(evt);
            }
        });

        buttonComment.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 14)); // NOI18N
        buttonComment.setForeground(new java.awt.Color(242, 170, 76));
        buttonComment.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_comments_20px.png")); // NOI18N
        buttonComment.setText("Comentar");
        buttonComment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCommentMouseClicked(evt);
            }
        });

        inComment.setBackground(new java.awt.Color(44, 51, 78));
        inComment.setColumns(20);
        inComment.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        inComment.setForeground(new java.awt.Color(242, 170, 76));
        inComment.setRows(5);
        inComment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(inComment);

        CommentsList.setBackground(new java.awt.Color(44, 51, 78));
        CommentsList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CommentsList.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        CommentsList.setForeground(new java.awt.Color(242, 170, 76));
        CommentsList.setToolTipText("");
        jScrollPane2.setViewportView(CommentsList);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(backFeed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButom))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(ivPublic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(likeButtom)
                                    .addComponent(buttonComment))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1)))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(descPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ivPublic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backFeed))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(likeButtom)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonComment)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButom)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createPublic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(createPublic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pnlCards.add(pnlHome, "home");

        pnlSettings.setBackground(new java.awt.Color(24, 30, 47));

        jButton1.setBackground(new java.awt.Color(24, 30, 47));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar perfil");

        jButton2.setBackground(new java.awt.Color(24, 30, 47));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(24, 30, 47));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Alterar senha");

        jButton4.setBackground(new java.awt.Color(24, 30, 47));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Sobre");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 39, 54));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_settings_20px_1.png")); // NOI18N
        jLabel8.setText("Settings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        bt_edit_profile_photo.setBackground(new java.awt.Color(24, 30, 47));
        bt_edit_profile_photo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_edit_profile_photo.setForeground(new java.awt.Color(255, 255, 255));
        bt_edit_profile_photo.setText("Alterar Foto do perfil");
        bt_edit_profile_photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_edit_profile_photoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSettingsLayout = new javax.swing.GroupLayout(pnlSettings);
        pnlSettings.setLayout(pnlSettingsLayout);
        pnlSettingsLayout.setHorizontalGroup(
            pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSettingsLayout.createSequentialGroup()
                .addGap(0, 398, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(363, 363, 363))
            .addGroup(pnlSettingsLayout.createSequentialGroup()
                .addGroup(pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSettingsLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addGroup(pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1)))
                    .addGroup(pnlSettingsLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jButton2))
                    .addGroup(pnlSettingsLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(bt_edit_profile_photo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSettingsLayout.setVerticalGroup(
            pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSettingsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton2)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jButton3)
                .addGap(52, 52, 52)
                .addComponent(bt_edit_profile_photo)
                .addGap(57, 57, 57)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCards.add(pnlSettings, "settings");

        pnlFollowing.setBackground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout pnlFollowingLayout = new javax.swing.GroupLayout(pnlFollowing);
        pnlFollowing.setLayout(pnlFollowingLayout);
        pnlFollowingLayout.setHorizontalGroup(
            pnlFollowingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        pnlFollowingLayout.setVerticalGroup(
            pnlFollowingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        pnlCards.add(pnlFollowing, "following");

        pnlFollower.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout pnlFollowerLayout = new javax.swing.GroupLayout(pnlFollower);
        pnlFollower.setLayout(pnlFollowerLayout);
        pnlFollowerLayout.setHorizontalGroup(
            pnlFollowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        pnlFollowerLayout.setVerticalGroup(
            pnlFollowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        pnlCards.add(pnlFollower, "follower");

        pnlProfile.setBackground(new java.awt.Color(24, 30, 47));

        javax.swing.GroupLayout pnlProfileLayout = new javax.swing.GroupLayout(pnlProfile);
        pnlProfile.setLayout(pnlProfileLayout);
        pnlProfileLayout.setHorizontalGroup(
            pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        pnlProfileLayout.setVerticalGroup(
            pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        pnlCards.add(pnlProfile, "profile");

        jSplitPane1.setRightComponent(pnlCards);

        jPanel2.setBackground(new java.awt.Color(30, 45, 61));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 170, 76));
        jLabel2.setText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        menuProfile.setBackground(new java.awt.Color(242, 170, 76));
        menuProfile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuProfile.setForeground(new java.awt.Color(242, 170, 76));
        menuProfile.setText("Profile");
        menuProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProfileMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(242, 170, 76));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 170, 76));
        jLabel4.setText("My Followers");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(242, 170, 76));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 170, 76));
        jLabel5.setText("My Following");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(242, 170, 76));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 170, 76));
        jLabel1.setText("Settings");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menuProfile)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(menuProfile)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cardLayout.show(pnlCards, "home");

        System.out.println("Nelore pnlHome");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void menuProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProfileMouseClicked
        cardLayout.show(pnlCards, "profile");
        System.out.println("Nelore pnlProfile");
    }//GEN-LAST:event_menuProfileMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        cardLayout.show(pnlCards, "follower");
        System.out.println("Nelore pnlFollower");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        cardLayout.show(pnlCards, "following");
        System.out.println("Nelore pnlFollowing");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(pnlCards, "settings");
        System.out.println("pnlSettings pnlSettings");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_edit_profile_photoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_edit_profile_photoActionPerformed
        UserController uc = new UserController();
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println(selectedFile.getName());
            uc.setPhotoProfile(selectedFile);
        }
    }//GEN-LAST:event_bt_edit_profile_photoActionPerformed

    private void createPublicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createPublicMouseClicked

        PublicStore publicStore = new PublicStore();
        publicStore.setVisible(true);

    }//GEN-LAST:event_createPublicMouseClicked

    private void nextButomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButomMouseClicked
        if (PAGE < SIZE) {

            if (!ID_USER_FEED[PAGE].equals(ID_USER_FEED[PAGE + 1])) {
                clearHeaderFeed();
            }

            commentController.clearJList(CommentsList);
            PAGE = PAGE + 1;
            clearFeed();
            setFeed();
            setComments();
        }

        if (PAGE == SIZE - 1) {
            nextButom.setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_forward_button_40px_1.png"));
        }

        if (PAGE > 0) {
            backFeed.setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_go_back_40px.png"));
        }

    }//GEN-LAST:event_nextButomMouseClicked

    private void backFeedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backFeedMouseClicked

        if (PAGE > 0) {

            if (!ID_USER_FEED[PAGE].equals(ID_USER_FEED[PAGE - 1])) {
                clearHeaderFeed();
            }

            commentController.clearJList(CommentsList);
            PAGE = PAGE - 1;
            clearFeed();
            setFeed();
            setComments();
            

            nextButom.setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_circled_right_40px.png"));
        }

        if (PAGE - 1 < 0) {
            backFeed.setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_back_arrow_40px.png"));

        }

    }//GEN-LAST:event_backFeedMouseClicked

    private void buttonCommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCommentMouseClicked

        Comment comment = new Comment();
        String content = new String(inComment.getText().getBytes(), Charset.forName("UTF-8"));
        String publicID = jSONArray.getJSONObject(PAGE).get("_id").toString();

        if (content.length() > 1) {
            comment.setContent(content);
            comment.setIdpublic(publicID);
            commentController.store(comment);
            inComment.setText("");
        }

    }//GEN-LAST:event_buttonCommentMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      
        IndexProfiles indexProfiles = new IndexProfiles();
        indexProfiles.setVisible(true);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void likeButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_likeButtomMouseClicked
        likeButtom.setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_heart_20px_1.png"));
        LikeController lc = new LikeController();        
        String idpublic = jSONArray.getJSONObject(PAGE).get("_id").toString();        
        lc.Store(idpublic);
    }//GEN-LAST:event_likeButtomMouseClicked

    private void setComments() {      
        String publicID = jSONArray.getJSONObject(PAGE).get("_id").toString();
        commentController.index(publicID, CommentsList);

    }

    private void clearHeaderFeed() {
        feed.getProfilePhoto().setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_user_42px.png"));
    }

    private void clearFeed() {
        feed.getDescription().setText("");
        feed.getImageView().setIcon(new ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_picture_240px.png"));
    }

    private void setFeed() {
        String desc = jSONArray.getJSONObject(PAGE).get("descricao").toString();
        descPublic.setText(desc);
        AsyncFeedController afc = new AsyncFeedController();
        afc.setFeedItens(feed, ID_USER_FEED[PAGE], jSONArray.getJSONObject(PAGE));
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    private void setHeader() {
        PAGE = 0;
        AsyncFeedController asyncFeedController = new AsyncFeedController();
        ProfileHead profileHead = new ProfileHead();
        MainController pc = new MainController();
        User user;

        profileHead.setNameLabel(nameLabel);
        profileHead.setUsernameLabel(usernameLabel);
        profileHead.setFollowersNumber(followersNumber);
        profileHead.setFollowingNumber(followingNumber);
        profileHead.setUserPhoto(userImageView);

        user = pc.getUser();
        String nome = new String(user.getName().getBytes(), Charset.forName("UTF-8"));
        //String bio = new String(user.getBio().getBytes(), Charset.forName("UTF-8"));
        String userName = new String(user.getUsername().getBytes(), Charset.forName("UTF-8"));

        nameLabel.setText(nome);
        //bioLabel.setText(bio);
        usernameLabel.setText(userName);

        asyncFeedController.setHeaderItens(profileHead);

    }

    private void setiduserFeed() {
        MainController pc = new MainController();
        String response = pc.getFeed();
        jSONArray = new JSONArray(response);
        SIZE = jSONArray.length();
        ID_USER_FEED = new String[SIZE];
        for (int i = 0; i < jSONArray.length(); i++) {
            ID_USER_FEED[i] = jSONArray.getJSONObject(i).get("iduser").toString();
        }
    }

    private void getFeed() {
        feed = new Feed();
        feed.setDescription(descPublic);
        feed.setImageView(ivPublic);
        feed.setProfilePhoto(pulbicProfilePhoto);
        feed.setTemp(temp);
        feed.setUsername(publicUsername);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> CommentsList;
    private javax.swing.JLabel backFeed;
    private javax.swing.JButton bt_edit_profile_photo;
    private javax.swing.JLabel buttonComment;
    private javax.swing.JLabel createPublic;
    private javax.swing.JLabel descPublic;
    private javax.swing.JLabel followersNumber;
    private javax.swing.JLabel followingNumber;
    private javax.swing.JTextArea inComment;
    private javax.swing.JLabel ivPublic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel likeButtom;
    private javax.swing.JLabel menuProfile;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nextButom;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlFollower;
    private javax.swing.JPanel pnlFollowing;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlProfile;
    private javax.swing.JPanel pnlSettings;
    private javax.swing.JLabel publicUsername;
    private javax.swing.JLabel pulbicProfilePhoto;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel userImageView;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}
