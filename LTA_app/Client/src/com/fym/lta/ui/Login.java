
package com.fym.lta.ui;

import com.fym.lta.bao.BaoFactory;
import com.fym.lta.bao.LoginEngine;
import com.fym.lta.bao.UserBao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author h.omar
 */
public class Login extends javax.swing.JFrame {

    // create the bussiness object to check entered data
    UserBao userBaoObj = new BaoFactory().createUserBao();

    /** Creates new form Login */
    public Login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        username = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        login_btn = new javax.swing.JButton();
        userPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        username.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        username.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 78, 290, 20));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Keep Me Logged in ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 290, 30));

        login_btn.setBackground(new java.awt.Color(0, 0, 0));
        login_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login_btn.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\loginBTN.png")); // NOI18N
        login_btn.setBorder(null);
        login_btn.setIconTextGap(0);
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        getContentPane().add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 180, 50));

        userPassword.setBackground(new java.awt.Color(0, 0, 0));
        userPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userPassword.setForeground(new java.awt.Color(255, 255, 255));
        userPassword.setBorder(null);
        userPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        userPassword.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        userPassword.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 290, 20));
        userPassword.getAccessibleContext().setAccessibleName("");
        userPassword.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Oracle\\Middleware\\LTA\\icons\\loginBackgrond.png")); // NOI18N
        jLabel3.setIconTextGap(0);
        jLabel3.setMaximumSize(new java.awt.Dimension(900, 400));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 400));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 400));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 400));

        pack();
    }//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
                                                                       
        boolean loginStatus =
            userBaoObj.checkLogin(username.getText(),
                                  Utilities.getMd5(new String (userPassword.getPassword()))); // passing username ,password to check

        if (jCheckBox1.isSelected()) // this means i must store this values encrypted in ab file

        {System.out.println("======>"+loginStatus +"password  "+ Utilities.getMd5(new String (userPassword.getPassword())));
            if (loginStatus) {

                LoginEngine.currentUser = username.getText();
                BufferedWriter writer = null;
                try {
                    writer = new BufferedWriter(new FileWriter("original"));
                    writer.write(username.getText());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try {

                    String key = "squirrel123"; // needs to be at least 8 characters for DES

                    FileInputStream fis = new FileInputStream("original");
                    FileOutputStream fos = new FileOutputStream("ab.txt");
                    LoginEngine.encrypt(key, fis, fos);
                    File file = new File("original");
                    file.delete();
                    // delete original file

                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (Throwable e) {
                    // must go up to user and tell him no logged file found login again 
                    e.printStackTrace();

                }
            }
        }

        if (loginStatus) {
            MMenu mu = new MMenu();
            mu.setVisible(true);
            this.setVisible(false);
        }

    

    }//GEN-LAST:event_login_btnMouseClicked

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_btnActionPerformed

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
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login_btn;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
