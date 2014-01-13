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

        public JIF_Empleado() {
        initComponents();
        agregarTienda();
        agregarSupervisor();
        setTitle("EMPLEADO");
        
    }
    
    public void agregarTienda (){
        Conexion c;
        try { 
               c = new Conexion();
               try (Statement s = c.c.createStatement()) {
                   ResultSet rs = s.executeQuery("select nombre from tb_Contacto, tb_Tienda where tb_contacto.`idUbicacion` = tb_tienda.`contacto_idUbicacion`");
                   int nF = rs.getMetaData().getColumnCount();
                   rs.last();
                   String[][] out = new String[rs.getRow()][nF];

                    for (int i = 0; i < nF; i++) {
                      rs.beforeFirst();
                      int n=0;
                      while (rs.next()) {
                        out[n][i]=rs.getString( i+1 );
                        String nombre1 = rs.getString(1);
                        jcb_Tienda.addItem(nombre1);
                        n++;
                      }
                    }
               }
        } catch ( ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void agregarSupervisor (){
        Conexion c;
        try { 
               c = new Conexion();
               try (Statement s = c.c.createStatement()) {
                   ResultSet rs1 = s.executeQuery("select nombre from tb_Contacto, tb_Empleado where tb_contacto.`idUbicacion` = tb_Empleado.`contacto_idUbicacion` and rol = 'Supervisor'");
                   int nF = rs1.getMetaData().getColumnCount();
                   rs1.last();
                   String[][] out = new String[rs1.getRow()][nF];

                    for (int i=0; i<nF; i++) {
                      rs1.beforeFirst();
                      int n=0;
                      while (rs1.next()) {
                        out[n][i]=rs1.getString(i+1);
                        String nombre2 = rs1.getString(1);
                        jcb_Supervisor.addItem(nombre2);
                        n++;
                      }
                    }
               }
        } catch ( ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jt_Correo = new javax.swing.JTextField();
        jt_Telefono = new javax.swing.JTextField();
        jt_Direccion = new javax.swing.JTextField();
        jt_Ciudad = new javax.swing.JTextField();
        jt_Pais = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Cedula = new javax.swing.JTextField();
        jcb_Tienda = new javax.swing.JComboBox();
        jcb_Rol = new javax.swing.JComboBox();
        jcb_Supervisor = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EMPLEADO");
        setPreferredSize(new java.awt.Dimension(1020, 718));
        getContentPane().setLayout(null);

        jl_Cedula.setText("Cédula:");
        getContentPane().add(jl_Cedula);
        jl_Cedula.setBounds(110, 60, 92, 23);

        jl_Nombre.setText("Nombre:");
        getContentPane().add(jl_Nombre);
        jl_Nombre.setBounds(110, 90, 92, 23);

        jl_Pais.setText("Pais:");
        getContentPane().add(jl_Pais);
        jl_Pais.setBounds(110, 120, 92, 23);

        jl_Ciudad.setText("Ciudad:");
        getContentPane().add(jl_Ciudad);
        jl_Ciudad.setBounds(110, 150, 92, 23);

        jl_Direccion.setText("Dirección:");
        getContentPane().add(jl_Direccion);
        jl_Direccion.setBounds(110, 180, 92, 23);

        jl_Telefono.setText("Teléfono");
        getContentPane().add(jl_Telefono);
        jl_Telefono.setBounds(110, 210, 92, 23);

        jl_Correo.setText("Correo Electrónico:");
        getContentPane().add(jl_Correo);
        jl_Correo.setBounds(110, 240, 117, 23);

        jl_Tienda.setText("Tienda:");
        getContentPane().add(jl_Tienda);
        jl_Tienda.setBounds(110, 270, 92, 23);

        jl_Supervisor.setText("Supervisor:");
        getContentPane().add(jl_Supervisor);
        jl_Supervisor.setBounds(110, 330, 92, 23);

        jl_Rol.setText("Rol:");
        getContentPane().add(jl_Rol);
        jl_Rol.setBounds(110, 300, 92, 23);

        jl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/User.jpg"))); // NOI18N
        getContentPane().add(jl_Icono);
        jl_Icono.setBounds(610, 70, 290, 290);

        jb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_nuevo.png"))); // NOI18N
        jb_Agregar.setText("Agregar");
        jb_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Agregar);
        jb_Agregar.setBounds(200, 400, 114, 30);

        jb_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/modificar.png"))); // NOI18N
        jb_Modificar.setText("Modificar");
        jb_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Modificar);
        jb_Modificar.setBounds(330, 400, 114, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jt_Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_CorreoKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Correo);
        jt_Correo.setBounds(130, 200, 350, 25);

        jt_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_TelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Telefono);
        jt_Telefono.setBounds(130, 170, 350, 25);

        jt_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_DireccionKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Direccion);
        jt_Direccion.setBounds(130, 140, 350, 25);

        jt_Ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_CiudadKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Ciudad);
        jt_Ciudad.setBounds(130, 110, 350, 25);

        jt_Pais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_PaisKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Pais);
        jt_Pais.setBounds(130, 80, 350, 25);

        jt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_NombreKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Nombre);
        jt_Nombre.setBounds(130, 50, 350, 25);

        jt_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_CedulaActionPerformed(evt);
            }
        });
        jt_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_CedulaKeyTyped(evt);
            }
        });
        jPanel1.add(jt_Cedula);
        jt_Cedula.setBounds(130, 20, 350, 25);

        jcb_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_TiendaActionPerformed(evt);
            }
        });
        jPanel1.add(jcb_Tienda);
        jcb_Tienda.setBounds(130, 230, 350, 25);

        jcb_Rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Supervisor" }));
        jcb_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_RolActionPerformed(evt);
            }
        });
        jPanel1.add(jcb_Rol);
        jcb_Rol.setBounds(130, 260, 350, 25);

        jcb_Supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_SupervisorActionPerformed(evt);
            }
        });
        jPanel1.add(jcb_Supervisor);
        jcb_Supervisor.setBounds(130, 290, 350, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 40, 500, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/fondo-blanco.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1020, 718));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1050, 720);

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
            String tienda = jcb_Tienda.getSelectedItem().toString();
            String rol = jcb_Rol.getSelectedItem().toString();
            String supervisor = jcb_Supervisor.getSelectedItem().toString();
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
                    if (supervisor.equals("")){
                        s.executeUpdate("insert into tb_Contacto (nombre, pais, ciudad, direccion, telefono, correoElectronico) VALUES ('" + nombre + "','" + pais + "','" + ciudad + "','" + direccion + "'," + ntelefono + ",'" + correo + "')");
                        ResultSet r = s.executeQuery("select MAX(idUbicacion) FROM tb_Contacto" );
                        if (r.next()) {
                            String ubicacion = r.getString(1);
                            String cSupervisor = cedula;
                            int nUbicacion = Integer.parseInt(ubicacion);
                            int nSupervisor = Integer.parseInt(cSupervisor);
                            ResultSet rs = s.executeQuery("select idTienda FROM tb_Contacto, tb_Tienda where nombre = '" + tienda + "'");
                            if (rs.next()){
                                String Tienda = rs.getString(1);
                                int nTienda = Integer.parseInt(Tienda);
                                s.executeUpdate("insert into tb_Empleado (cedula, empleado_Cedula_Supervisor, tienda_idTienda, contacto_idUbicacion, contrasena, rol) VALUES (" + ncedula + "," + nSupervisor + "," + nTienda + ","  + nUbicacion + "," + ncedula + ",'" + rol + "')");
                            }
                        }
                    JOptionPane.showMessageDialog(null, "Empleado Registrado Satisfactoriamente!");
                    jt_Cedula.setText("");
                    jt_Nombre.setText("");
                    jt_Pais.setText("");
                    jt_Ciudad.setText("");
                    jt_Direccion.setText("");
                    jt_Telefono.setText("");
                    jt_Correo.setText("");
                    s.close();
               } else {
                        s.executeUpdate("insert into tb_Contacto (nombre, pais, ciudad, direccion, telefono, correoElectronico) VALUES ('" + nombre + "','" + pais + "','" + ciudad + "','" + direccion + "'," + ntelefono + ",'" + correo + "')");
                        ResultSet r = s.executeQuery("select MAX(idUbicacion) FROM tb_Contacto" );
                        System.out.println(supervisor);
                        if (r.next()) {
                            String ubicacion = r.getString(1);
                            int nubicacion = Integer.parseInt(ubicacion);
                            ResultSet rs1 = s.executeQuery("select cedula FROM tb_Contacto, tb_Empleado where nombre = '" + supervisor + "'");
                            if (rs1.next()){
                                String cSupervisor = rs1.getString(1);
                                int nSupervisor = Integer.parseInt(cSupervisor);
                                ResultSet rs = s.executeQuery("select idTienda FROM tb_Contacto, tb_Tienda where nombre = '" + tienda + "'");
                                if (rs.next()){
                                    String Tienda = rs.getString(1);
                                    int nTienda = Integer.parseInt(Tienda);
                                    s.executeUpdate("insert into tb_Empleado (cedula, empleado_Cedula_Supervisor, tienda_idTienda, contacto_idUbicacion, contrasena, rol) VALUES (" + ncedula + "," + nSupervisor + "," + nTienda + ","  + nubicacion + "," + ncedula + ",'" + rol + "')");
                                }
                            }
                        }
                    JOptionPane.showMessageDialog(null, "Empleado Registrado Satisfactoriamente!");
                    jt_Cedula.setText("");
                    jt_Nombre.setText("");
                    jt_Pais.setText("");
                    jt_Ciudad.setText("");
                    jt_Direccion.setText("");
                    jt_Telefono.setText("");
                    jt_Correo.setText("");
                    s.close();
                    }
               }               
                       
            } catch ( ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jb_AgregarActionPerformed

    private void jcb_SupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_SupervisorActionPerformed
           
    }//GEN-LAST:event_jcb_SupervisorActionPerformed

    private void jcb_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_RolActionPerformed
        if (evt.getSource() == jcb_Rol){
            String rol = (String) jcb_Rol.getSelectedItem();
            if (rol.equals("Supervisor")){
                jcb_Supervisor.removeAllItems();
                jcb_Supervisor.addItem("");
                jcb_Supervisor.getSelectedItem();
                jcb_Supervisor.setEnabled(false);
            } else {
                jcb_Supervisor.setEnabled(true);
                jcb_Supervisor.removeAllItems();
                agregarSupervisor();
            }            
        
        }
    }//GEN-LAST:event_jcb_RolActionPerformed

    private void jb_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ModificarActionPerformed
            String cedula = jt_Cedula.getText();
            String nombre = jt_Nombre.getText();
            String pais = jt_Pais.getText();
            String ciudad = jt_Ciudad.getText();
            String direccion = jt_Direccion.getText();
            String telefono = jt_Telefono.getText();
            String correo = jt_Correo.getText();
            String tienda = jcb_Tienda.getSelectedItem().toString();
            String rol = jcb_Rol.getSelectedItem().toString();
            String supervisor = jcb_Supervisor.getSelectedItem().toString();
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
                    if (supervisor.equals("")){
                        s.executeUpdate("update tb_Contacto, tb_Empleado set nombre = '" + nombre + "', pais = '" + pais + "', ciudad = '" + ciudad + "', direccion = '" + direccion + "', telefono = " + ntelefono + ", correoElectronico = '" + correo + "' " + " where tb_Contacto.idUbicacion = tb_Empleado.contacto_idUbicacion and cedula = " + ncedula );
                        ResultSet rs1 = s.executeQuery("select contacto_idUbicacion FROM tb_Empleado where cedula = '" + ncedula + "'" );
                        if (rs1.next()) {
                            String ubicacion = rs1.getString(1);
                            String cSupervisor = cedula;
                            int nUbicacion = Integer.parseInt(ubicacion);
                            int nSupervisor = Integer.parseInt(cSupervisor);
                            ResultSet rs = s.executeQuery("select idTienda FROM tb_Contacto, tb_Tienda where nombre = '" + tienda + "'");
                            if (rs.next()){
                                String Tienda = rs.getString(1);
                                int nTienda = Integer.parseInt(Tienda);
                                s.executeUpdate("update tb_Empleado set empleado_Cedula_Supervisor = " + nSupervisor + ", tienda_idTienda = " + nTienda + ", contacto_idUbicacion = " + nUbicacion + ", contrasena = " + ncedula + ", rol = 'Supervisor' where cedula = " + ncedula );
                            }
                        }
                    JOptionPane.showMessageDialog(null, "Empleado Modificado Satisfactoriamente!");
                    jt_Cedula.setText("");
                    jt_Nombre.setText("");
                    jt_Pais.setText("");
                    jt_Ciudad.setText("");
                    jt_Direccion.setText("");
                    jt_Telefono.setText("");
                    jt_Correo.setText("");
                    s.close();
               } else {
                        s.executeUpdate("update tb_Contacto, tb_Empleado set nombre = '" + nombre + "', pais = '" + pais + "', ciudad = '" + ciudad + "', direccion = '" + direccion + "', telefono = " + ntelefono + ", correoElectronico = '" + correo + "' " + " where tb_Contacto.idUbicacion = tb_Empleado.contacto_idUbicacion and cedula = " + ncedula );
                        ResultSet r = s.executeQuery("select idUbicacion FROM tb_Contacto, tb_Empleado where tb_contacto.cedula = " + ncedula );
                        if (r.next()) {
                            String ubicacion = r.getString(1);
                            int nubicacion = Integer.parseInt(ubicacion);
                            ResultSet rs1 = s.executeQuery("select cedula FROM tb_Contacto, tb_Empleado where tb_contacto.nombre = '" + supervisor + "'");
                            if (rs1.next()){
                                String cSupervisor = r.getString(1);
                                int nSupervisor = Integer.parseInt(cSupervisor);
                                ResultSet rs = s.executeQuery("select idTienda FROM tb_Contacto, tb_Tienda where nombre = '" + tienda + "'");
                                if (rs.next()){
                                    String Tienda = rs.getString(1);
                                    int nTienda = Integer.parseInt(Tienda);
                                    s.executeUpdate("update tb_Empleado set empleado_Cedula_Supervisor = " + nSupervisor + ", tienda_idTienda = " + nTienda + ", contacto_idUbicacion = " + nubicacion + ", contrasena = " + ncedula + ", rol = 'Supervisor' where cedula = " + ncedula );
                                }
                            }
                            
                        }
                    JOptionPane.showMessageDialog(null, "Empleado Modificado Satisfactoriamente!");
                    jt_Cedula.setText("");
                    jt_Nombre.setText("");
                    jt_Pais.setText("");
                    jt_Ciudad.setText("");
                    jt_Direccion.setText("");
                    jt_Telefono.setText("");
                    jt_Correo.setText("");
                    s.close();
                    }
               }               
                       
            } catch ( ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jb_ModificarActionPerformed

    private void jt_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_CedulaActionPerformed

    }//GEN-LAST:event_jt_CedulaActionPerformed

    private void jt_CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CedulaKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jt_CedulaKeyTyped

    private void jt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NombreKeyTyped
        int limite = 60;
        if (jt_Nombre.getText().length() >= limite){
            evt.consume();
        }
    }//GEN-LAST:event_jt_NombreKeyTyped

    private void jt_PaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_PaisKeyTyped
        int limite = 20;
        if (jt_Pais.getText().length() >= limite){
            evt.consume();
        }
    }//GEN-LAST:event_jt_PaisKeyTyped

    private void jt_CiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CiudadKeyTyped
        int limite = 20;
        if (jt_Ciudad.getText().length() >= limite){
            evt.consume();
        }
    }//GEN-LAST:event_jt_CiudadKeyTyped

    private void jt_DireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_DireccionKeyTyped
        int limite = 60;
        if (jt_Direccion.getText().length() >= limite){
            evt.consume();
        }
    }//GEN-LAST:event_jt_DireccionKeyTyped

    private void jt_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_TelefonoKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
        int limite = 20;
        if (jt_Telefono.getText().length() >= limite){
            evt.consume();
        }
    }//GEN-LAST:event_jt_TelefonoKeyTyped

    private void jt_CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CorreoKeyTyped
        int limite = 60;
        if (jt_Correo.getText().length() >= limite){
            evt.consume();
        }
    }//GEN-LAST:event_jt_CorreoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
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
