package com.mobile.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;
import java.awt.event.*;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSignup = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JSignup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JLogin1 = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jSignup.setFont(new java.awt.Font("Futura T OT", 0, 12)); // NOI18N
        jSignup.setText("I don't have an account ");

        jLabel3.setFont(new java.awt.Font("Futura T OT", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        JSignup.setFont(new java.awt.Font("Futura T OT", 0, 12)); // NOI18N
        JSignup.setForeground(new java.awt.Color(51, 51, 255));
        JSignup.setText("Signup");
        JSignup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JSignup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JSignup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSignupActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Futura T OT", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOGIN");

        txtEmail.setFont(new java.awt.Font("Futura T OT", 2, 12)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Futura T OT", 1, 14)); // NOI18N
        jLabel6.setText("Username");

        JLogin1.setBackground(new java.awt.Color(51, 102, 255));
        JLogin1.setFont(new java.awt.Font("Futura T OT", 1, 14)); // NOI18N
        JLogin1.setForeground(new java.awt.Color(255, 255, 255));
        JLogin1.setText("Login");
        JLogin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JLogin1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JLogin1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLogin1ActionPerformed(evt);
            }
        });

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JSignup)))
                                .addGap(56, 56, 56)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPassword, txtEmail});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(JLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSignup)
                    .addComponent(JSignup))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPassword, txtEmail});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void JSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSignupActionPerformed
        Register RegisterFrame = new Register ();
        RegisterFrame.setVisible(true);
        RegisterFrame.pack();
        RegisterFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_JSignupActionPerformed

    private void JLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLogin1ActionPerformed
        boolean banned=false;
        int jmlPercobaan=0;
        String emailInput=txtEmail.getText().trim();
        String passwordInput= new String(jPassword.getPassword()).trim();
        File file = new File ("login.txt");
        
        if(emailInput.isEmpty()){
            JOptionPane.showMessageDialog(this,"Username is required","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(passwordInput.isEmpty()){
            JOptionPane.showMessageDialog(this,"password is required","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
         boolean loginSuccess = false;

   if (file.exists() && file.canRead()){        
    try (
              BufferedReader reader = new BufferedReader(new FileReader(file))){
               String line;
               String username=null;
               String password=null;
           while ((line = reader.readLine())!= null){
           
               if((line.startsWith("====")) || line.startsWith("=====================")){
                   continue;
               }
           if(line.startsWith("Username")){
               username = line.substring("Username:".length()).trim();
           }else if(line.startsWith("Password:")){
               password = line.substring("Password:".length()).trim();
            }
                
            if(username != null && password != null){
                if(emailInput.equals(username) && passwordInput.equals(password)){
                loginSuccess = true;
               break;
           } else{
                    jmlPercobaan++;
                  if(jmlPercobaan >=3){
                    banned = true;
                    break;
                    }  
                }
                 username = null;
                 password = null;
          
           }
        }
        if(banned){
            JOptionPane.showMessageDialog(this,"Your Account has blocked!","Blocked",JOptionPane.ERROR_MESSAGE);
        }else if(loginSuccess){
        JOptionPane.showMessageDialog(this,"Login Success!");
        frontPage FrontPage =  new frontPage();
        FrontPage.setVisible(true);
        FrontPage.pack();
        this.dispose();
            }else{
        JOptionPane.showMessageDialog(this,"Incorrect Email or Password","Login Failed",JOptionPane.ERROR_MESSAGE);
    }
    }catch(Exception e){
      JOptionPane.showMessageDialog(this,"  " + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }
    }else{
        JOptionPane.showMessageDialog(this,"User doesn't exist");
    }
    txtEmail.setText("");
    jPassword.setText("");
    }//GEN-LAST:event_JLogin1ActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        
    }//GEN-LAST:event_jPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Login loginFrame = new Login();
            loginFrame.setVisible(true);
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JLogin1;
    private javax.swing.JButton JSignup;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JLabel jSignup;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

 
}
