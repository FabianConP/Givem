/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;


import Conexion.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author DiegoAndrés
 */
public class JIF_Cliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIF_Cliente
     */
    public JIF_Cliente() {
        initComponents();
        setTitle("CLIENTE");     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Cedula = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jl_Nombre = new javax.swing.JLabel();
        jl_Pais = new javax.swing.JLabel();
        jl_Direccion = new javax.swing.JLabel();
        jl_Telefono = new javax.swing.JLabel();
        jl_Correo_Electronico = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jt_Direccion = new javax.swing.JTextField();
        jt_Pais = new javax.swing.JTextField();
        jt_Telefono = new javax.swing.JTextField();
        jt_Correo_Electronico = new javax.swing.JTextField();
        jl_Icono = new javax.swing.JLabel();
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jl_Ciudad = new javax.swing.JLabel();
        jt_Ciudad = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1020, 718));
        setVisible(true);
        getContentPane().setLayout(null);

        jl_Cedula.setText("Cédula:");
        getContentPane().add(jl_Cedula);
        jl_Cedula.setBounds(120, 120, 92, 23);

        jt_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_CedulaActionPerformed(evt);
            }
        });
        getContentPane().add(jt_Cedula);
        jt_Cedula.setBounds(240, 120, 320, 25);

        jl_Nombre.setText("Nombre:");
        getContentPane().add(jl_Nombre);
        jl_Nombre.setBounds(120, 150, 92, 20);

        jl_Pais.setText("País:");
        getContentPane().add(jl_Pais);
        jl_Pais.setBounds(120, 180, 92, 20);

        jl_Direccion.setText("Dirección:");
        getContentPane().add(jl_Direccion);
        jl_Direccion.setBounds(120, 240, 92, 20);

        jl_Telefono.setText("Teléfono:");
        getContentPane().add(jl_Telefono);
        jl_Telefono.setBounds(120, 270, 92, 20);

        jl_Correo_Electronico.setText("Correo Electrónico:");
        getContentPane().add(jl_Correo_Electronico);
        jl_Correo_Electronico.setBounds(120, 300, 110, 20);

        jt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(jt_Nombre);
        jt_Nombre.setBounds(240, 150, 320, 25);

        jt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_DireccionActionPerformed(evt);
            }
        });
        getContentPane().add(jt_Direccion);
        jt_Direccion.setBounds(240, 240, 320, 25);

        jt_Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_PaisActionPerformed(evt);
            }
        });
        getContentPane().add(jt_Pais);
        jt_Pais.setBounds(240, 180, 320, 25);

        jt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_TelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jt_Telefono);
        jt_Telefono.setBounds(240, 270, 320, 25);

        jt_Correo_Electronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_Correo_ElectronicoActionPerformed(evt);
            }
        });
        getContentPane().add(jt_Correo_Electronico);
        jt_Correo_Electronico.setBounds(240, 300, 320, 25);

        jl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/icono_acc_clientes.jpg"))); // NOI18N
        getContentPane().add(jl_Icono);
        jl_Icono.setBounds(650, 80, 265, 246);

        jb_Agregar.setText("Agregar");
        jb_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Agregar);
        jb_Agregar.setBounds(210, 380, 114, 43);

        jb_Modificar.setText("Modificar");
        jb_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Modificar);
        jb_Modificar.setBounds(350, 380, 114, 43);

        jl_Ciudad.setText("Ciudad:");
        getContentPane().add(jl_Ciudad);
        jl_Ciudad.setBounds(120, 210, 92, 20);
        getContentPane().add(jt_Ciudad);
        jt_Ciudad.setBounds(240, 210, 320, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_CedulaActionPerformed

    }//GEN-LAST:event_jt_CedulaActionPerformed

    private void jt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_NombreActionPerformed

    private void jt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_DireccionActionPerformed

    private void jt_PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_PaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_PaisActionPerformed

    private void jt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_TelefonoActionPerformed

    private void jt_Correo_ElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_Correo_ElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_Correo_ElectronicoActionPerformed

    private void jb_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AgregarActionPerformed
        if (evt.getSource() == jb_Agregar) {
            String cedula = jt_Cedula.getText();
            String nombre = jt_Nombre.getText();
            String pais = jt_Pais.getText();
            String ciudad = jt_Ciudad.getText();
            String direccion = jt_Direccion.getText();
            String telefono = jt_Telefono.getText();
            String correo = jt_Correo_Electronico.getText();
            int ntelefono = Integer.parseInt(telefono);
            int ncedula = Integer.parseInt(cedula);

            
            Conexion c;
            try { 
               c = new Conexion();
               try (Statement s = c.c.createStatement()) {
                    if (pais.equals("") || ciudad.equals("")){
                        pais = "Colombia";
                        ciudad = "Bogotá";                          
                    }
                    s.executeUpdate("insert into tb_Contacto (nombre, pais, ciudad, direccion, telefono, correoElectronico) VALUES ('" + nombre + "','" + pais + "','" + ciudad + "','" + direccion + "'," + ntelefono + ",'" + correo + "')");
                    ResultSet r = s.executeQuery("SELECT MAX(idUbicacion) FROM tb_Contacto");
                    if (r.next()) {
                        String ubicacion = r.getString(1);
                        int nubicacion = Integer.parseInt(ubicacion);
                        s.executeUpdate("insert into tb_Cliente (idNumero, contacto_idUbicacion) VALUES (" + ncedula + "," + nubicacion + ")");
                    }
                    JOptionPane.showMessageDialog(null, "Cliente Registrado Satisfactoriamente!");
                    jt_Cedula.setText("");
                    jt_Nombre.setText("");
                    jt_Pais.setText("");
                    jt_Ciudad.setText("");
                    jt_Direccion.setText("");
                    jt_Telefono.setText("");
                    jt_Correo_Electronico.setText("");
                    s.close();
                }

            } catch ( ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jb_AgregarActionPerformed

    private void jb_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ModificarActionPerformed
        String cedula = jt_Cedula.getText();
        String nombre = jt_Nombre.getText();
        String pais = jt_Pais.getText();
        String ciudad = jt_Ciudad.getText();
        String direccion = jt_Direccion.getText();
        String telefono = jt_Telefono.getText();
        String correo = jt_Correo_Electronico.getText();
        int ntelefono = Integer.parseInt(telefono);
        int ncedula = Integer.parseInt(cedula);
        
        Conexion c;
            try { 
                    c = new Conexion();
                    if (pais.equals("") || ciudad.equals("")){
                        pais = "Colombia";
                        ciudad = "Bogotá";                          
                    }
                    try (Statement s = c.c.createStatement()) {
                        s.executeUpdate("update tb_Contacto, tb_Cliente set nombre = '" + nombre + "', pais = '" + pais + "', ciudad = '" + ciudad + "', direccion = '" + direccion + "', telefono = " + ntelefono + ", correoElectronico = '" + correo + "' " + "where tb_Contacto.idUbicacion = tb_Cliente.contacto_idUbicacion and idNumero = " + ncedula);
                        JOptionPane.showMessageDialog(null, "Cliente Modificado Satisfactoriamente!");
                        jt_Cedula.setText("");
                        jt_Nombre.setText("");
                        jt_Pais.setText("");
                        jt_Ciudad.setText("");
                        jt_Direccion.setText("");
                        jt_Telefono.setText("");
                        jt_Correo_Electronico.setText("");
                        s.close();
                     }

            } catch (    ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Ciudad;
    private javax.swing.JLabel jl_Correo_Electronico;
    private javax.swing.JLabel jl_Direccion;
    private javax.swing.JLabel jl_Icono;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Pais;
    private javax.swing.JLabel jl_Telefono;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Ciudad;
    private javax.swing.JTextField jt_Correo_Electronico;
    private javax.swing.JTextField jt_Direccion;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Pais;
    private javax.swing.JTextField jt_Telefono;
    // End of variables declaration//GEN-END:variables
}
