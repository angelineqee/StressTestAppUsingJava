/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quizapp;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Angeline
 */
public class Login extends javax.swing.JFrame {

    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        AppNameLabel = new javax.swing.JLabel();
        AppTaglineLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LoginTitleLabel = new javax.swing.JLabel();
        LogInUsernameLabel = new javax.swing.JLabel();
        LogInPasswordLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        SignUpLabel = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(576, 320));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AppNameLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        AppNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppNameLabel.setText("~M i n d   Y o u r   M i n d~");
        jPanel2.add(AppNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 12, 322, -1));

        AppTaglineLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        AppTaglineLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppTaglineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppTaglineLabel.setText("Measure your stress, manage your well-being");
        AppTaglineLabel.setAlignmentY(0.0F);
        jPanel2.add(AppTaglineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 318, 322, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginTitleLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        LoginTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTitleLabel.setText("Log in");
        LoginTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LoginTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 6, 68, 35));

        LogInUsernameLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        LogInUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        LogInUsernameLabel.setText("Username:");
        jPanel1.add(LogInUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 47, -1, -1));

        LogInPasswordLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        LogInPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        LogInPasswordLabel.setText("Password:");
        jPanel1.add(LogInPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 119, -1, -1));

        UsernameTextField.setSelectionColor(new java.awt.Color(255, 51, 51));
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 67, 254, 34));

        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 139, 254, 34));

        LoginButton.setBackground(new java.awt.Color(125, 152, 161));
        LoginButton.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setBorderPainted(false);
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setOpaque(true);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 199, 254, 31));

        SignUpLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        SignUpLabel.setText("Click here to sign up");
        jPanel1.add(SignUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 236, -1, 24));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppNameLabel;
    private javax.swing.JLabel AppTaglineLabel;
    private javax.swing.JLabel LogInPasswordLabel;
    private javax.swing.JLabel LogInUsernameLabel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginTitleLabel;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
