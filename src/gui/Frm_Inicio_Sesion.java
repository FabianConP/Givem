/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Conexion.Conexion;
import Util.Util;
import com.alee.extended.image.WebImage;
import com.alee.managers.notification.NotificationIcon;
import com.alee.managers.notification.NotificationManager;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author fabian
 */
public class Frm_Inicio_Sesion extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Inicio_Sesion
     */
    public Frm_Inicio_Sesion() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Entrar = new javax.swing.JButton();
        jl_InicioSesion = new javax.swing.JLabel();
        wt_Documento = new com.alee.laf.text.WebTextField();
        wt_Contrasena = new com.alee.laf.text.WebPasswordField();
        jl_Titulo = new javax.swing.JLabel();
        jl_Compania = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        jb_Entrar.setText("Entrar");
        jb_Entrar.setToolTipText("Clic aquí para iniciar sesión");
        jb_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EntrarActionPerformed(evt);
            }
        });

        jl_InicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_iniciarSesion.jpg"))); // NOI18N

        wt_Documento.setText("1019101086");
        wt_Documento.setToolTipText("Ingrese su documento");
        wt_Documento.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        wt_Documento.setInputPrompt("Documento");
        wt_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt_DocumentoKeyTyped(evt);
            }
        });

        wt_Contrasena.setText("1234");
        wt_Contrasena.setToolTipText("Ingrese su contraseña");
        wt_Contrasena.setEchoChar('\u25cf');
        wt_Contrasena.setInputPrompt("Contraseña");
        wt_Contrasena.setLeadingComponent(new WebImage(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_contrasena.png"))));
        wt_Contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt_ContrasenaKeyTyped(evt);
            }
        });

        jl_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jl_Titulo.setForeground(new java.awt.Color(9, 74, 168));
        jl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_Titulo.setText("GIVEM");

        jl_Compania.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_Compania.setForeground(java.awt.Color.lightGray);
        jl_Compania.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_Compania.setText("<html>\nGivem Inc.\n©2014 \n</html>");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_givemLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jl_InicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Compania)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_Entrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(wt_Contrasena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wt_Documento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(wt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_Entrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_Compania, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_InicioSesion)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EntrarActionPerformed
        inicioSesion();
    }//GEN-LAST:event_jb_EntrarActionPerformed

    private void wt_DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt_DocumentoKeyTyped
        char n = evt.getKeyChar();
        if (!Character.isDigit(n)) {
            evt.consume();
        }
        if ((char) evt.getKeyChar() == 10) {
            inicioSesion();
        }
    }//GEN-LAST:event_wt_DocumentoKeyTyped

    private void wt_ContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt_ContrasenaKeyTyped
        if ((char) evt.getKeyChar() == 10) {
            inicioSesion();
        }
    }//GEN-LAST:event_wt_ContrasenaKeyTyped

    private void inicioSesion() {
        Conexion c;
        try {
            c = new Conexion();
            Statement s = c.c.createStatement();
            String cedula = wt_Documento.getText();
            String contraseña = Util.cArrayToString(wt_Contrasena.getPassword());
            String sentence = "CALL sp_login(" + cedula + "," + contraseña + ")", rol = "";
            ResultSet r = s.executeQuery(sentence);
            if (r.next()) {
                rol = r.getString(1);
                if (!rol.equals("NO")) {
                    Frm_Principal frm_Principal = new Frm_Principal(cedula, rol);
                    frm_Principal.main(new String[]{""});
                    this.dispose();
                } else {
                    NotificationManager.showNotification("Documento o contraseña incorrecta", NotificationIcon.error.getIcon()).setDisplayTime(5000);
                }
                wt_Documento.setText("");
                wt_Contrasena.setText("");
            } else {
                NotificationManager.showNotification("Documento o contraseña incorrecta", NotificationIcon.error.getIcon()).setDisplayTime(5000);
                wt_Documento.setText("");
                wt_Contrasena.setText("");
            }
            wt_Documento.setText("");
            c.c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            NotificationManager.showNotification("Documento o contraseña incorrecta", NotificationIcon.error.getIcon()).setDisplayTime(5000);
            wt_Documento.setText("");
            wt_Contrasena.setText("");
        }
    }

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
            java.util.logging.Logger.getLogger(Frm_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Inicio_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_Entrar;
    private javax.swing.JLabel jl_Compania;
    private javax.swing.JLabel jl_InicioSesion;
    private javax.swing.JLabel jl_Titulo;
    private com.alee.laf.text.WebPasswordField wt_Contrasena;
    private com.alee.laf.text.WebTextField wt_Documento;
    // End of variables declaration//GEN-END:variables
}
