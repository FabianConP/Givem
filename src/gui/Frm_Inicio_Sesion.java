/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import Conexion.Conexion;
import Util.Util;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jt_Contrasena = new javax.swing.JPasswordField();
        jl_Documento = new javax.swing.JLabel();
        jt_Documento = new javax.swing.JTextField();
        jl_Contrasena = new javax.swing.JLabel();
        jb_Entrar = new javax.swing.JButton();
        jl_InicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        jt_Contrasena.setText("1234");
        jt_Contrasena.setToolTipText("Contraseña del empleado [a-Z][0-9]");

        jl_Documento.setText("Documento");

        jt_Documento.setText("1019101086");
        jt_Documento.setToolTipText("Documento del empleado [0-9]");
        jt_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_DocumentoKeyTyped(evt);
            }
        });

        jl_Contrasena.setText("Contraseña");

        jb_Entrar.setText("Entrar");
        jb_Entrar.setToolTipText("Clic aquí para iniciar sesión");
        jb_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EntrarActionPerformed(evt);
            }
        });

        jl_InicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_iniciarSesion.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_InicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Documento)
                        .addGap(18, 18, 18)
                        .addComponent(jt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Contrasena)
                        .addGap(18, 18, 18)
                        .addComponent(jt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Entrar)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Documento)
                            .addComponent(jt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Contrasena)
                            .addComponent(jt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jb_Entrar))
                    .addComponent(jl_InicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EntrarActionPerformed
        Conexion c;
        try {
            c = new Conexion();
            Statement s = c.c.createStatement();
            String cedula = jt_Documento.getText();
            String contraseña = Util.cArrayToString(jt_Contrasena.getPassword());
            String sentence  = "CALL sp_login("+cedula+","+contraseña+")", ans = "";
            ResultSet r = s.executeQuery(sentence);
            if (r.next()) {
                ans = r.getString(1);
                if (!ans.equals("NO")) {
                    JOptionPane.showMessageDialog(this,
                        "Se ha iniciado sesión correctamente\nBienvenido su rol es "+ans);
                    Frm_Principal frm_Principal = new Frm_Principal(ans);
                    frm_Principal.main(new String[]{""});
                    this.dispose();
                } else
                JOptionPane.showMessageDialog(this,"Documento o contraseña incorrecta");
                jt_Contrasena.setText("");
            } else
            JOptionPane.showMessageDialog(this,"Documento o contraseña incorrecta");
            jt_Contrasena.setText("");
            c.c.close();
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(this,"Error al conectarse", "Error de conexion", JOptionPane.ERROR_MESSAGE); 
        }

    }//GEN-LAST:event_jb_EntrarActionPerformed

    private void jt_DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_DocumentoKeyTyped
        char n = evt.getKeyChar();
        if(!Character.isDigit(n))
            evt.consume();  
    }//GEN-LAST:event_jt_DocumentoKeyTyped
    
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
    private javax.swing.JButton jb_Entrar;
    private javax.swing.JLabel jl_Contrasena;
    private javax.swing.JLabel jl_Documento;
    private javax.swing.JLabel jl_InicioSesion;
    private javax.swing.JPasswordField jt_Contrasena;
    private javax.swing.JTextField jt_Documento;
    // End of variables declaration//GEN-END:variables
}
