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
public class JIF_Empleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIF_Empleado
     */
    public JIF_Empleado() {
        initComponents();
        setTitle("EMPLEADO");
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
        jl_Nombre = new javax.swing.JLabel();
        jl_Pais = new javax.swing.JLabel();
        jl_Ciudad = new javax.swing.JLabel();
        jl_Direccion = new javax.swing.JLabel();
        jl_Telefono = new javax.swing.JLabel();
        jl_Correo = new javax.swing.JLabel();
        jl_Tienda = new javax.swing.JLabel();
        jl_Supervisor = new javax.swing.JLabel();
        jl_Rol = new javax.swing.JLabel();
        jl_Icono = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Pais = new javax.swing.JTextField();
        jt_Ciudad = new javax.swing.JTextField();
        jt_Direccion = new javax.swing.JTextField();
        jt_Telefono = new javax.swing.JTextField();
        jt_Correo = new javax.swing.JTextField();
        jcb_Tienda = new javax.swing.JComboBox();
        jcb_Supervisor = new javax.swing.JComboBox();
        jcb_Rol = new javax.swing.JComboBox();
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1020, 718));

        jl_Cedula.setText("Cédula:");

        jl_Nombre.setText("Nombre:");

        jl_Pais.setText("Pais:");

        jl_Ciudad.setText("Ciudad:");

        jl_Direccion.setText("Dirección:");

        jl_Telefono.setText("Teléfono");

        jl_Correo.setText("Correo Electrónico:");

        jl_Tienda.setText("Tienda:");

        jl_Supervisor.setText("Supervisor:");

        jl_Rol.setText("Rol:");

        jl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/User.jpg"))); // NOI18N

        jcb_Tienda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Americas", "Unicentro", "Chapinero", "Centro" }));
        jcb_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_TiendaActionPerformed(evt);
            }
        });

        jcb_Supervisor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carlos" }));
        jcb_Supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_SupervisorActionPerformed(evt);
            }
        });

        jcb_Rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Supervisor" }));
        jcb_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_RolActionPerformed(evt);
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
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_Cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jt_Nombre)
                            .addComponent(jt_Pais, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(327, 327, 327))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jt_Ciudad))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_Supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcb_Supervisor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcb_Tienda, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jt_Correo)
                                    .addComponent(jcb_Rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_Direccion)
                                    .addComponent(jt_Telefono))))
                        .addGap(39, 39, 39)
                        .addComponent(jl_Icono)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jb_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jb_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jl_Icono))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcb_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_Supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_TiendaActionPerformed
        
    }//GEN-LAST:event_jcb_TiendaActionPerformed

    private void jb_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AgregarActionPerformed
        if (evt.getSource() == jb_Agregar) {
            String cedula = jt_Cedula.getText();
            String nombre = jt_Nombre.getText();
            String pais = jt_Pais.getText();
            String ciudad = jt_Ciudad.getText();
            String direccion = jt_Direccion.getText();
            String telefono = jt_Telefono.getText();
            String correo = jt_Correo.getText();
            String tienda = (String) jcb_Tienda.getSelectedItem();
            String rol = (String) jcb_Rol.getSelectedItem();
            String supervisor = (String) jcb_Supervisor.getSelectedItem();
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
                        s.executeUpdate("insert into tb_Empleado (cedula, empleado_Cedula_Supervisor, tienda_idTienda, contacto_idUbicacion, contrasena, rol) VALUES (" + ncedula + "," + supervisor + "," + tienda + "," + nubicacion + "," + ncedula + "," + rol + ")");
                    }    
                    JOptionPane.showMessageDialog(null, "Cliente Registrado Satisfactoriamente!");
                    jt_Cedula.setText("");
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

    private void jcb_SupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_SupervisorActionPerformed
           
    }//GEN-LAST:event_jcb_SupervisorActionPerformed

    private void jcb_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_RolActionPerformed
   /*     if (evt.getSource() == jcb_Rol){
            String rol = (String) jcb_Rol.getSelectedItem();
            if (rol.equals("Supervisor")){
                jcb_Supervisor.setEnabled(false);
            } else {
                jcb_Supervisor.setEnabled(true);
            }            
        }*/
    }//GEN-LAST:event_jcb_RolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JComboBox jcb_Rol;
    private javax.swing.JComboBox jcb_Supervisor;
    private javax.swing.JComboBox jcb_Tienda;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Ciudad;
    private javax.swing.JLabel jl_Correo;
    private javax.swing.JLabel jl_Direccion;
    private javax.swing.JLabel jl_Icono;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Pais;
    private javax.swing.JLabel jl_Rol;
    private javax.swing.JLabel jl_Supervisor;
    private javax.swing.JLabel jl_Telefono;
    private javax.swing.JLabel jl_Tienda;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Ciudad;
    private javax.swing.JTextField jt_Correo;
    private javax.swing.JTextField jt_Direccion;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Pais;
    private javax.swing.JTextField jt_Telefono;
    // End of variables declaration//GEN-END:variables
}
