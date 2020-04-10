/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jkevinx23.instaapp.view.Register;

import com.jkevinx23.instaapp.controller.UserController;
import com.jkevinx23.instaapp.models.User;
import com.jkevinx23.instaapp.view.Login.Login;
import java.awt.Color;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

/**
 *
 * @author jkevi
 */
public class Register extends javax.swing.JFrame {

    Border errorBorder = BorderFactory.createLineBorder(Color.RED);

    public Register() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_userName = new javax.swing.JTextField();
        passconfirm = new javax.swing.JPasswordField();
        passfield = new javax.swing.JPasswordField();
        datepicker = new datechooser.beans.DateChooserCombo();
        bt_ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_bio = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 17));

        jPanel2.setBackground(new java.awt.Color(252, 246, 245));

        jLabel1.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 17));
        jLabel1.setText("Criando Usuário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        tf_name.setBackground(new java.awt.Color(252, 246, 245));
        tf_name.setFont(new java.awt.Font("Fira Code Retina", 0, 14)); // NOI18N
        tf_name.setForeground(new java.awt.Color(153, 0, 17));
        tf_name.setToolTipText("Nome");
        tf_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tf_email.setBackground(new java.awt.Color(252, 246, 245));
        tf_email.setFont(new java.awt.Font("Fira Code Retina", 0, 14)); // NOI18N
        tf_email.setForeground(new java.awt.Color(153, 0, 17));
        tf_email.setToolTipText("Username");

        tf_userName.setBackground(new java.awt.Color(252, 246, 245));
        tf_userName.setFont(new java.awt.Font("Fira Code Retina", 0, 14)); // NOI18N
        tf_userName.setForeground(new java.awt.Color(153, 0, 17));

        passconfirm.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        passconfirm.setForeground(new java.awt.Color(153, 0, 17));
        passconfirm.setToolTipText("");

        passfield.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        passfield.setForeground(new java.awt.Color(153, 0, 17));

        datepicker.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    datepicker.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    datepicker.setNavigateFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));

    bt_ok.setBackground(new java.awt.Color(153, 0, 17));
    bt_ok.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    bt_ok.setForeground(new java.awt.Color(252, 246, 245));
    bt_ok.setText("Confirmar");
    bt_ok.setToolTipText("");
    bt_ok.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            bt_okMouseClicked(evt);
        }
    });
    bt_ok.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt_okActionPerformed(evt);
        }
    });

    jLabel2.setBackground(new java.awt.Color(252, 246, 245));
    jLabel2.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(252, 246, 245));
    jLabel2.setText("Biografia");

    jLabel3.setBackground(new java.awt.Color(252, 246, 245));
    jLabel3.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(252, 246, 245));
    jLabel3.setText("Senha");

    jLabel4.setBackground(new java.awt.Color(252, 246, 245));
    jLabel4.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(252, 246, 245));
    jLabel4.setText("Nome ");

    jLabel5.setBackground(new java.awt.Color(252, 246, 245));
    jLabel5.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(252, 246, 245));
    jLabel5.setText("Email");

    tf_bio.setBackground(new java.awt.Color(252, 246, 245));
    tf_bio.setColumns(20);
    tf_bio.setRows(5);
    jScrollPane1.setViewportView(tf_bio);

    jLabel6.setBackground(new java.awt.Color(252, 246, 245));
    jLabel6.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(252, 246, 245));
    jLabel6.setText("Username");

    jLabel7.setBackground(new java.awt.Color(252, 246, 245));
    jLabel7.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(252, 246, 245));
    jLabel7.setText("Confirme sua senha");

    jLabel8.setBackground(new java.awt.Color(252, 246, 245));
    jLabel8.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(252, 246, 245));
    jLabel8.setText("Nascimento");

    bt_back.setBackground(new java.awt.Color(153, 0, 17));
    bt_back.setFont(new java.awt.Font("Lyster PERSONAL USE ONLY", 0, 18)); // NOI18N
    bt_back.setForeground(new java.awt.Color(252, 246, 245));
    bt_back.setText("Voltar");
    bt_back.setToolTipText("");
    bt_back.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt_backActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(105, 105, 105)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addGap(72, 72, 72))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(jLabel3))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel7))
                        .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jLabel8)))
                    .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(datepicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39))))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(115, 115, 115)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5)
            .addGap(97, 97, 97))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(bt_ok)
                    .addGap(261, 261, 261))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(bt_back)
                    .addGap(276, 276, 276))))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(179, 179, 179)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(tf_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(jLabel8))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(passconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(datepicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
            .addComponent(bt_ok)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(bt_back)
            .addGap(17, 17, 17))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_okActionPerformed
        User user = new User();

        int response;

        Date date = datepicker.getSelectedDate().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String data = dateFormat.format(date);

        if (tf_name.getText().equals("")) {
            tf_name.setBorder(errorBorder);
            tf_name.requestFocus();
        } else {
            
            user.setName( new String(tf_name.getText().getBytes(),Charset.forName("UTF-8")));
            if (tf_userName.getText().equals("")) {
                tf_userName.setBorder(errorBorder);
                tf_userName.requestFocus();
            } else {

                 user.setUsername(new String(tf_userName.getText().getBytes(),Charset.forName("UTF-8")));

                if (tf_email.getText().equals("")) {
                    tf_email.setBorder(errorBorder);
                    tf_email.requestFocus();
                } else {
                    
                    user.setEmail(new String(tf_email.getText().getBytes(),Charset.forName("UTF-8")));

                    if (tf_bio.getText().equals("")) {
                        tf_bio.setBorder(errorBorder);
                        tf_bio.requestFocus();
                    } else {
                        user.setBio(new String(tf_bio.getText().getBytes(),Charset.forName("UTF-8")));

                        if (!(Arrays.equals(passfield.getPassword(), passconfirm.getPassword()) && passfield.getPassword().length > 3)) {
                            passfield.setText("");
                            passconfirm.setText("");

                        } else {
                            user.setPassword(String.copyValueOf(passfield.getPassword()));
                            user.setDate(data);
                            UserController userController = new UserController();
                            System.out.println("Senha :: " + user.getPassword());
                            response = userController.createAccount(user);
                         
                            switch (response) {
                                case 0:
                                    System.out.println("Usuário criado com susesso");
                                    JOptionPane.showMessageDialog(jPanel1,
                                            "Sucesso",
                                            "Cadastro realizado com sucesso, efetue o login.",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    JFrame f2 = (JFrame) SwingUtilities.getWindowAncestor(bt_ok);
                                    f2.dispose();

                                    Login login = new Login();
                                    login.setVisible(true);

                                    break;
                                case -1:
                                    JOptionPane.showMessageDialog(jPanel1,
                                            "Email já cadastrado",
                                            "Email já cadastrado, efetue o login.",
                                            JOptionPane.WARNING_MESSAGE);
                                    tf_email.requestFocus();
                                    break;
                                case -2:
                                    JOptionPane.showMessageDialog(jPanel1,
                                            "Este username já existe",
                                            "Este username já existe, escolha outro.",
                                            JOptionPane.WARNING_MESSAGE);
                                    tf_userName.requestFocus();

                                    break;

                                default:
                                    JOptionPane.showMessageDialog(jPanel1,
                                            "Servidor não disponível",
                                            "Servidor não disponível, "
                                            + "entre em contato com o desenvolvedor reponsável",
                                            JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_bt_okActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        JFrame f2 = (JFrame) SwingUtilities.getWindowAncestor(bt_ok);
        f2.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_okMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_okMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            Register register = new Register();

            public void run() {
                register.setVisible(true);
            }

            public void close() {
                register.dispose();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_ok;
    private datechooser.beans.DateChooserCombo datepicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passconfirm;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextArea tf_bio;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_userName;
    // End of variables declaration//GEN-END:variables

}
