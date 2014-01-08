/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DiegoAndrés
 */
public class JIF_Tienda extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIF_Tienda
     */
    public JIF_Tienda() {
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

        jl_ID = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Pais = new javax.swing.JLabel();
        jl_Ciudad = new javax.swing.JLabel();
        jl_Direccion = new javax.swing.JLabel();
        jl_Telefono = new javax.swing.JLabel();
        jl_Correo = new javax.swing.JLabel();
        jt_ID = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Pais = new javax.swing.JTextField();
        jt_Ciudad = new javax.swing.JTextField();
        jt_Direccion = new javax.swing.JTextField();
        jt_Telefono = new javax.swing.JTextField();
        jt_Correo = new javax.swing.JTextField();
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1020, 718));

        jl_ID.setText("ID:");

        jl_Nombre.setText("Nombre:");

        jl_Pais.setText("País:");

        jl_Ciudad.setText("Ciudad:");

        jl_Direccion.setText("Dirección:");

        jl_Telefono.setText("Teléfono:");

        jl_Correo.setText("Correo Electrónico:");

        jt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_IDActionPerformed(evt);
            }
        });

        jt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_TelefonoActionPerformed(evt);
            }
        });

        jb_Agregar.setText("Agregar");
        jb_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarActionPerformed(evt);
            }
        });

        jb_Modificar.setText("Modificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jb_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jb_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AgregarActionPerformed
        if (evt.getSource() == jb_Agregar) {
            String id = jt_ID.getText();
            String nombre = jt_Nombre.getText();
            String pais = jt_Pais.getText();
            String ciudad = jt_Ciudad.getText();
            String direccion = jt_Direccion.getText();
            String telefono = jt_Telefono.getText();
            String correo = jt_Correo.getText();
            int ntelefono = Integer.parseInt(telefono);
            int nid = Integer.parseInt(id);

            
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
                        s.executeUpdate("insert into tb_Tienda (idTienda, contacto_idUbicacion) VALUES (" + nid + "," + nubicacion + ")");
                    }
                    JOptionPane.showMessageDialog(null, "Tienda Registrada Satisfactoriamente!");
                    jt_ID.setText("");
                    jt_Nombre.setText("");
                    jt_Pais.setText("");
                    jt_Ciudad.setText("");
                    jt_Direccion.setText("");
                    jt_Telefono.setText("");
                    jt_Correo.setText("");
                    s.close();
                }

            } catch ( ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jb_AgregarActionPerformed

    private void jt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_IDActionPerformed
        
    }//GEN-LAST:event_jt_IDActionPerformed

    private void jt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_TelefonoActionPerformed
       
    }//GEN-LAST:event_jt_TelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JLabel jl_Ciudad;
    private javax.swing.JLabel jl_Correo;
    private javax.swing.JLabel jl_Direccion;
    private javax.swing.JLabel jl_ID;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Pais;
    private javax.swing.JLabel jl_Telefono;
    private javax.swing.JTextField jt_Ciudad;
    private javax.swing.JTextField jt_Correo;
    private javax.swing.JTextField jt_Direccion;
    private javax.swing.JTextField jt_ID;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Pais;
    private javax.swing.JTextField jt_Telefono;
    // End of variables declaration//GEN-END:variables
}