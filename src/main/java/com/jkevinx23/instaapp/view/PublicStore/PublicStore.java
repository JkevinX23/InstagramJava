/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.view.PublicStore;

import com.jkevinx23.instaapp.auxiliar.ResizeImages;
import com.jkevinx23.instaapp.controller.PublicController;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class PublicStore extends javax.swing.JFrame {
    File selected;

    public PublicStore() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        btSelectPhoto = new javax.swing.JLabel();
        ivPhoto = new javax.swing.JLabel();
        PublicationStore = new javax.swing.JLabel();
        CancelButtom = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 45, 61));

        jPanel2.setBackground(new java.awt.Color(24, 30, 47));

        jLabel3.setFont(new java.awt.Font("Lyster Bold PERSONAL USE ONLY", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 170, 76));
        jLabel3.setText("Nova Publicação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lyster Bold PERSONAL USE ONLY", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 170, 76));
        jLabel2.setText("Descrição: ");

        textField.setBackground(new java.awt.Color(24, 30, 47));
        textField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField.setForeground(new java.awt.Color(242, 170, 76));
        textField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btSelectPhoto.setFont(new java.awt.Font("Lyster Bold PERSONAL USE ONLY", 0, 14)); // NOI18N
        btSelectPhoto.setForeground(new java.awt.Color(242, 170, 76));
        btSelectPhoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\PublicStore\\Icons\\icons8_camera_20px.png")); // NOI18N
        btSelectPhoto.setText(" Foto ");
        btSelectPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSelectPhotoMouseClicked(evt);
            }
        });

        ivPhoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\jkevi\\OneDrive\\Documentos\\NetBeansProjects\\InstagramJava\\src\\main\\java\\com\\jkevinx23\\instaapp\\view\\Principal\\Icons\\icons8_picture_240px.png")); // NOI18N

        PublicationStore.setFont(new java.awt.Font("Lyster Bold PERSONAL USE ONLY", 0, 14)); // NOI18N
        PublicationStore.setForeground(new java.awt.Color(242, 170, 76));
        PublicationStore.setText(" Publicar ");
        PublicationStore.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(242, 170, 76)));
        PublicationStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PublicationStoreMouseClicked(evt);
            }
        });

        CancelButtom.setForeground(new java.awt.Color(255, 255, 255));
        CancelButtom.setText("SAIR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(textField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CancelButtom)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ivPhoto)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(PublicationStore)))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btSelectPhoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btSelectPhoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ivPhoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PublicationStore)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelButtom)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PublicationStoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublicationStoreMouseClicked
  
        if(selected!= null){
            String description  = textField.getText();
            PublicController pc = new PublicController();
            pc.Store(selected, description);
            JFrame window = (JFrame) SwingUtilities.getWindowAncestor(PublicationStore);
            window.dispose();
            
        }
                   
    }//GEN-LAST:event_PublicationStoreMouseClicked

    private void btSelectPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSelectPhotoMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);    
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                Image image  = ImageIO.read(selectedFile);
                selected = selectedFile;
                ResizeImages ri = new ResizeImages();
                ivPhoto.setIcon(new ImageIcon(ri.resize(image, 240)));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(jPanel1,
                         "Erro no arquivo selecionado",
                         "Tente novamente",
                         JOptionPane.WARNING_MESSAGE);
                
                System.out.println("ERROR IMAGE SELECTED: "+ ex.getMessage());
            }
        }
    }//GEN-LAST:event_btSelectPhotoMouseClicked

    
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PublicStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>    
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new PublicStore().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CancelButtom;
    private javax.swing.JLabel PublicationStore;
    private javax.swing.JLabel btSelectPhoto;
    private javax.swing.JLabel ivPhoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
