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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DiegoAndrés
 */
public class JIF_Empleado extends javax.swing.JInternalFrame {

    public JIF_Empleado() {
        initComponents();
        llenarTablaEmpleado();
        agregarTienda();
        agregarSupervisor();
        setTitle("EMPLEADO");

    }

    private void rowToFields(int fila) {

        try {
            Conexion c = new Conexion();
            Statement s = c.c.createStatement();
            String cedula = jtb_Empleados.getValueAt(fila, 0).toString();
            String nombre = jtb_Empleados.getValueAt(fila, 1).toString();
            String telefono = jtb_Empleados.getValueAt(fila, 2).toString();
            String correo = jtb_Empleados.getValueAt(fila, 3).toString();
            String supervisor = jtb_Empleados.getValueAt(fila, 4).toString();
            String tienda = jtb_Empleados.getValueAt(fila, 5).toString();
            String rol = jtb_Empleados.getValueAt(fila, 6).toString();
            int ntienda = Integer.parseInt(tienda);
            int nsupervisor = Integer.parseInt(supervisor);
            int ncedula = Integer.parseInt(cedula);
            ResultSet r = s.executeQuery("select pais, ciudad, direccion from tb_empleado, tb_contacto where contacto_idUbicacion = idUbicacion and cedula = " + ncedula);
            if (r.next()) {
                String pais = r.getString(1);
                String ciudad = r.getString(2);
                String direccion = r.getString(3);
                ResultSet rs = s.executeQuery("select nombre from tb_empleado, tb_contacto where contacto_idUbicacion = idUbicacion and cedula = " + nsupervisor);
                if (rs.next()) {
                    String nombreSupervisor = rs.getString(1);
                    ResultSet rt = s.executeQuery("select nombre from tb_tienda, tb_contacto where contacto_idUbicacion = idUbicacion and idTienda = " + ntienda);

                    if (rt.next()) {
                        String nombreTienda = rt.getString(1);
                        jt_Cedula.setText(cedula);
                        jt_Nombre.setText(nombre);
                        jt_Telefono.setText(telefono);
                        jt_Pais.setText(pais);
                        jt_Ciudad.setText(ciudad);
                        jt_Direccion.setText(direccion);
                        jt_Correo.setText(correo);
                        jcb_Rol.setSelectedItem(rol);
                        jcb_Tienda.setSelectedItem(nombreTienda);
                        jcb_Supervisor.setSelectedItem(nombreSupervisor);
                    }
                }
            }
            c.c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void llenarTablaEmpleado() {
        DefaultTableModel dtm = (DefaultTableModel) jtb_Empleados.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        jtb_Empleados.setModel(dtm);
        try {
            Conexion c = new Conexion();
            Statement s = c.c.createStatement();

            String sentence = "select cedula, nombre, telefono, correoElectronico, empleado_Cedula_Supervisor, tienda_idTienda, rol  from tb_contacto, tb_empleado where tb_contacto.`idUbicacion` = tb_empleado.`contacto_idUbicacion`";
            ResultSet r = s.executeQuery(sentence);
            while (r.next()) {
                Object[] o = new Object[]{r.getString(1), r.getString(2), r.getString(3),
                    r.getString(4), r.getString(5), r.getString(6), r.getString(7)};

                dtm.addRow(o);
                jtb_Empleados.setModel(dtm);
            }
            c.c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void agregarTienda() {
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
                    int n = 0;
                    while (rs.next()) {
                        out[n][i] = rs.getString(i + 1);
                        String nombre1 = rs.getString(1);
                        jcb_Tienda.addItem(nombre1);
                        n++;
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarSupervisor() {
        Conexion c;
        try {
            c = new Conexion();
            try (Statement s = c.c.createStatement()) {
                ResultSet rs1 = s.executeQuery("select nombre from tb_Contacto, tb_Empleado where tb_contacto.`idUbicacion` = tb_Empleado.`contacto_idUbicacion` and rol = 'Supervisor'");
                int nF = rs1.getMetaData().getColumnCount();
                rs1.last();
                String[][] out = new String[rs1.getRow()][nF];

                for (int i = 0; i < nF; i++) {
                    rs1.beforeFirst();
                    int n = 0;
                    while (rs1.next()) {
                        out[n][i] = rs1.getString(i + 1);
                        String nombre2 = rs1.getString(1);
                        jcb_Supervisor.addItem(nombre2);
                        n++;
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_find = new javax.swing.ButtonGroup();
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
        jp_DatosPersonales = new javax.swing.JPanel();
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
        jb_Nuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Empleados = new javax.swing.JTable();
        jp_Contenedor = new javax.swing.JPanel();
        jrb_Cedula = new javax.swing.JRadioButton();
        jrb_Nombre = new javax.swing.JRadioButton();
        jt_Buscar = new javax.swing.JTextField();
        jb_Find = new javax.swing.JButton();
        jb_Limpiar = new javax.swing.JButton();
        jp_Find = new javax.swing.JPanel();
        jb_Borrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EMPLEADO");
        setPreferredSize(new java.awt.Dimension(860, 680));
        getContentPane().setLayout(null);

        jl_Cedula.setText("Cédula:");
        getContentPane().add(jl_Cedula);
        jl_Cedula.setBounds(50, 30, 92, 30);

        jl_Nombre.setText("Nombre:");
        getContentPane().add(jl_Nombre);
        jl_Nombre.setBounds(50, 60, 92, 30);

        jl_Pais.setText("Pais:");
        getContentPane().add(jl_Pais);
        jl_Pais.setBounds(50, 90, 92, 30);

        jl_Ciudad.setText("Ciudad:");
        getContentPane().add(jl_Ciudad);
        jl_Ciudad.setBounds(50, 120, 92, 30);

        jl_Direccion.setText("Dirección:");
        getContentPane().add(jl_Direccion);
        jl_Direccion.setBounds(50, 150, 92, 30);

        jl_Telefono.setText("Teléfono");
        getContentPane().add(jl_Telefono);
        jl_Telefono.setBounds(50, 180, 92, 30);

        jl_Correo.setText("Correo Electrónico:");
        getContentPane().add(jl_Correo);
        jl_Correo.setBounds(50, 210, 117, 30);

        jl_Tienda.setText("Tienda:");
        getContentPane().add(jl_Tienda);
        jl_Tienda.setBounds(50, 240, 92, 30);

        jl_Supervisor.setText("Supervisor:");
        getContentPane().add(jl_Supervisor);
        jl_Supervisor.setBounds(50, 300, 92, 30);

        jl_Rol.setText("Rol:");
        getContentPane().add(jl_Rol);
        jl_Rol.setBounds(50, 270, 92, 30);

        jl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_seller.png"))); // NOI18N
        getContentPane().add(jl_Icono);
        jl_Icono.setBounds(540, 0, 290, 290);

        jb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_agregar.png"))); // NOI18N
        jb_Agregar.setText("Agregar");
        jb_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Agregar);
        jb_Agregar.setBounds(40, 350, 100, 30);

        jb_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_modificar.png"))); // NOI18N
        jb_Modificar.setText("Modificar");
        jb_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Modificar);
        jb_Modificar.setBounds(370, 350, 100, 30);

        jp_DatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        jp_DatosPersonales.setLayout(null);

        jt_Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_CorreoKeyTyped(evt);
            }
        });
        jp_DatosPersonales.add(jt_Correo);
        jt_Correo.setBounds(130, 200, 300, 25);

        jt_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_TelefonoKeyTyped(evt);
            }
        });
        jp_DatosPersonales.add(jt_Telefono);
        jt_Telefono.setBounds(130, 170, 300, 25);

        jt_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_DireccionKeyTyped(evt);
            }
        });
        jp_DatosPersonales.add(jt_Direccion);
        jt_Direccion.setBounds(130, 140, 300, 25);

        jt_Ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_CiudadKeyTyped(evt);
            }
        });
        jp_DatosPersonales.add(jt_Ciudad);
        jt_Ciudad.setBounds(130, 110, 300, 25);

        jt_Pais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_PaisKeyTyped(evt);
            }
        });
        jp_DatosPersonales.add(jt_Pais);
        jt_Pais.setBounds(130, 80, 300, 25);

        jt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_NombreKeyTyped(evt);
            }
        });
        jp_DatosPersonales.add(jt_Nombre);
        jt_Nombre.setBounds(130, 50, 300, 25);

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
        jp_DatosPersonales.add(jt_Cedula);
        jt_Cedula.setBounds(130, 20, 300, 25);

        jcb_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_TiendaActionPerformed(evt);
            }
        });
        jp_DatosPersonales.add(jcb_Tienda);
        jcb_Tienda.setBounds(130, 230, 300, 25);

        jcb_Rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Supervisor" }));
        jcb_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_RolActionPerformed(evt);
            }
        });
        jp_DatosPersonales.add(jcb_Rol);
        jcb_Rol.setBounds(130, 260, 300, 25);

        jcb_Supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_SupervisorActionPerformed(evt);
            }
        });
        jp_DatosPersonales.add(jcb_Supervisor);
        jcb_Supervisor.setBounds(130, 290, 300, 25);

        getContentPane().add(jp_DatosPersonales);
        jp_DatosPersonales.setBounds(30, 10, 450, 330);

        jb_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_nuevo.png"))); // NOI18N
        jb_Nuevo.setText("Nuevo");
        jb_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Nuevo);
        jb_Nuevo.setBounds(150, 350, 100, 30);

        jtb_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Teléfono", "Correo Electrónico", "Supervisor", "Tienda", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_EmpleadosMouseClicked(evt);
            }
        });
        jtb_Empleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtb_EmpleadosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_Empleados);
        if (jtb_Empleados.getColumnModel().getColumnCount() > 0) {
            jtb_Empleados.getColumnModel().getColumn(0).setPreferredWidth(8);
            jtb_Empleados.getColumnModel().getColumn(2).setPreferredWidth(8);
            jtb_Empleados.getColumnModel().getColumn(4).setPreferredWidth(8);
            jtb_Empleados.getColumnModel().getColumn(5).setPreferredWidth(4);
            jtb_Empleados.getColumnModel().getColumn(6).setPreferredWidth(8);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 410, 790, 220);

        jp_Contenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados Registrados"));
        getContentPane().add(jp_Contenedor);
        jp_Contenedor.setBounds(20, 390, 810, 250);

        bg_find.add(jrb_Cedula);
        jrb_Cedula.setSelected(true);
        jrb_Cedula.setText("Cédula");
        jrb_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_CedulaActionPerformed(evt);
            }
        });
        getContentPane().add(jrb_Cedula);
        jrb_Cedula.setBounds(500, 310, 80, 30);

        bg_find.add(jrb_Nombre);
        jrb_Nombre.setText("Nombre");
        jrb_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(jrb_Nombre);
        jrb_Nombre.setBounds(500, 340, 80, 30);

        jt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_BuscarActionPerformed(evt);
            }
        });
        jt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_BuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jt_Buscar);
        jt_Buscar.setBounds(600, 310, 150, 30);

        jb_Find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_buscar.png"))); // NOI18N
        jb_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_FindActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Find);
        jb_Find.setBounds(750, 310, 49, 30);

        jb_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_clear.png"))); // NOI18N
        jb_Limpiar.setText("Limpiar");
        jb_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Limpiar);
        jb_Limpiar.setBounds(600, 340, 200, 25);

        jp_Find.setBorder(javax.swing.BorderFactory.createTitledBorder("Herramientas de Búsqueda"));
        getContentPane().add(jp_Find);
        jp_Find.setBounds(490, 290, 330, 90);

        jb_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_borrar.png"))); // NOI18N
        jb_Borrar.setText("Borrar");
        jb_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Borrar);
        jb_Borrar.setBounds(260, 350, 100, 30);

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

            Conexion c;
            ttry:
            try {
                c = new Conexion();
                try (Statement s = c.c.createStatement()) {
                    if (pais.equals("") || ciudad.equals("")) {
                        pais = "Colombia";
                        ciudad = "Bogotá";
                    }
                    if (telefono.length() == 0) {
                        telefono = "0";
                    }
                    if (jt_Cedula.getText().length() == 0 || jt_Nombre.getText().length() == 0) {
                        JOptionPane.showMessageDialog(this, "Complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                        break ttry;
                    }
                    int ntelefono = Integer.parseInt(telefono);
                    int ncedula = Integer.parseInt(cedula);
                    ResultSet repetida = s.executeQuery("SELECT cedula FROM tb_empleado where cedula = " + ncedula);
                    if (repetida.next()) {
                        String cedulaRepetida = repetida.getString(1);
                        if (cedulaRepetida.length() != 0) {
                            JOptionPane.showMessageDialog(this, "No se ha podido agregar. El empleado ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
                            break ttry;
                        }
                    }
                    if (supervisor.equals("")) {
                        s.executeUpdate("insert into tb_Contacto (nombre, pais, ciudad, direccion, telefono, correoElectronico) VALUES ('" + nombre + "','" + pais + "','" + ciudad + "','" + direccion + "'," + ntelefono + ",'" + correo + "')");
                        ResultSet r = s.executeQuery("select MAX(idUbicacion) FROM tb_Contacto");
                        if (r.next()) {
                            String ubicacion = r.getString(1);
                            String cSupervisor = cedula;
                            int nUbicacion = Integer.parseInt(ubicacion);
                            int nSupervisor = Integer.parseInt(cSupervisor);
                            ResultSet rs = s.executeQuery("select idTienda FROM tb_Contacto, tb_Tienda where nombre = '" + tienda + "'");
                            if (rs.next()) {
                                String Tienda = rs.getString(1);
                                int nTienda = Integer.parseInt(Tienda);
                                s.executeUpdate("insert into tb_Empleado (cedula, empleado_Cedula_Supervisor, tienda_idTienda, contacto_idUbicacion, contrasena, rol) VALUES (" + ncedula + "," + nSupervisor + "," + nTienda + "," + nUbicacion + "," + ncedula + ",'" + rol + "')");
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
                        llenarTablaEmpleado();
                        s.close();
                    } else {
                        s.executeUpdate("insert into tb_Contacto (nombre, pais, ciudad, direccion, telefono, correoElectronico) VALUES ('" + nombre + "','" + pais + "','" + ciudad + "','" + direccion + "'," + ntelefono + ",'" + correo + "')");
                        ResultSet r = s.executeQuery("select MAX(idUbicacion) FROM tb_Contacto");
                        if (r.next()) {
                            String ubicacion = r.getString(1);
                            int nubicacion = Integer.parseInt(ubicacion);
                            ResultSet rs1 = s.executeQuery("select cedula FROM tb_Contacto, tb_Empleado where nombre = '" + supervisor + "'");
                            if (rs1.next()) {
                                String cSupervisor = rs1.getString(1);
                                int nSupervisor = Integer.parseInt(cSupervisor);
                                ResultSet rs = s.executeQuery("select idTienda FROM tb_Contacto, tb_Tienda where contacto_idUbicacion = idUbicacion and nombre like '" + tienda + "'");
                                if (rs.next()) {
                                    String Tienda = rs.getString(1);
                                    int nTienda = Integer.parseInt(Tienda);
                                    s.executeUpdate("insert into tb_Empleado (cedula, empleado_Cedula_Supervisor, tienda_idTienda, contacto_idUbicacion, contrasena, rol) VALUES (" + ncedula + "," + nSupervisor + "," + nTienda + "," + nubicacion + "," + ncedula + ",'" + rol + "')");
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
                        llenarTablaEmpleado();
                        s.close();
                    }
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jb_AgregarActionPerformed

    private void jcb_SupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_SupervisorActionPerformed

    }//GEN-LAST:event_jcb_SupervisorActionPerformed

    private void jcb_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_RolActionPerformed
        if (evt.getSource() == jcb_Rol) {
            String rol = (String) jcb_Rol.getSelectedItem();
            if (rol.equals("Supervisor")) {
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
        String supervisor = jcb_Supervisor.getSelectedItem().toString();

        Conexion c;
        ttry:
        try {
            c = new Conexion();
            try (Statement s = c.c.createStatement()) {
                if (pais.equals("") || ciudad.equals("")) {
                    pais = "Colombia";
                    ciudad = "Bogotá";
                }
                if (telefono.length() == 0) {
                    telefono = "0";
                }
                if (jt_Cedula.getText().length() == 0 || jt_Nombre.getText().length() == 0) {
                    JOptionPane.showMessageDialog(this, "Complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    break ttry;
                }
                int ntelefono = Integer.parseInt(telefono);
                int ncedula = Integer.parseInt(cedula);
                if (supervisor.equals("")) {
                    s.executeUpdate("update tb_Contacto, tb_Empleado set nombre = '" + nombre + "', pais = '" + pais + "', ciudad = '" + ciudad + "', direccion = '" + direccion + "', telefono = " + ntelefono + ", correoElectronico = '" + correo + "' " + " where tb_Contacto.idUbicacion = tb_Empleado.contacto_idUbicacion and cedula = " + ncedula);
                    ResultSet rs1 = s.executeQuery("select idTienda FROM tb_tienda, tb_contacto where idUbicacion = contacto_idUbicacion and nombre like '" + tienda + "'");
                    if (rs1.next()) {
                        String cSupervisor = cedula;
                        int nSupervisor = Integer.parseInt(cSupervisor);
                        String Tienda = rs1.getString(1);
                        int nTienda = Integer.parseInt(Tienda);
                        s.executeUpdate("update tb_Empleado set empleado_Cedula_Supervisor = " + nSupervisor + ", tienda_idTienda = " + nTienda + ", rol = 'Supervisor' where cedula = " + ncedula);
                    }
                    JOptionPane.showMessageDialog(null, "Empleado Modificado Satisfactoriamente!");
                    jt_Cedula.setText("");
                    jt_Nombre.setText("");
                    jt_Pais.setText("");
                    jt_Ciudad.setText("");
                    jt_Direccion.setText("");
                    jt_Telefono.setText("");
                    jt_Correo.setText("");
                    jcb_Rol.setSelectedIndex(0);
                    jcb_Supervisor.setSelectedIndex(0);
                    jcb_Tienda.setSelectedIndex(0);
                    llenarTablaEmpleado();
                    s.close();
                } else {
                    s.executeUpdate("update tb_Contacto, tb_Empleado set nombre = '" + nombre + "', pais = '" + pais + "', ciudad = '" + ciudad + "', direccion = '" + direccion + "', telefono = " + ntelefono + ", correoElectronico = '" + correo + "' " + " where tb_Contacto.idUbicacion = tb_Empleado.contacto_idUbicacion and cedula = " + ncedula);
                    ResultSet rs1 = s.executeQuery("select cedula FROM tb_Contacto, tb_Empleado where tb_contacto.idUbicacion = tb_empleado.contacto_idUbicacion and nombre like '" + supervisor + "'");
                    if (rs1.next()) {
                        String cSupervisor = rs1.getString(1);
                        int nSupervisor = Integer.parseInt(cSupervisor);
                        ResultSet rs = s.executeQuery("select idTienda FROM tb_Contacto, tb_Tienda where  idUbicacion = contacto_idUbicacion and nombre like '" + tienda + "'");
                        if (rs.next()) {
                            String Tienda = rs.getString(1);
                            int nTienda = Integer.parseInt(Tienda);
                            s.executeUpdate("update tb_Empleado set empleado_Cedula_Supervisor = " + nSupervisor + ", tienda_idTienda = " + nTienda + ", rol = 'Vendedor' where cedula = " + ncedula);
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
                    jcb_Rol.setSelectedIndex(0);
                    jcb_Supervisor.setSelectedIndex(0);
                    jcb_Tienda.setSelectedIndex(0);
                    llenarTablaEmpleado();
                    s.close();
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JIF_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_ModificarActionPerformed

    private void jt_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_CedulaActionPerformed

    }//GEN-LAST:event_jt_CedulaActionPerformed

    private void jt_CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CedulaKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jt_CedulaKeyTyped

    private void jt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NombreKeyTyped
        int limite = 60;
        if (jt_Nombre.getText().length() >= limite) {
            evt.consume();
        }
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9')) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jt_NombreKeyTyped

    private void jt_PaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_PaisKeyTyped
        int limite = 20;
        if (jt_Pais.getText().length() >= limite) {
            evt.consume();
        }
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9')) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jt_PaisKeyTyped

    private void jt_CiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CiudadKeyTyped
        int limite = 20;
        if (jt_Ciudad.getText().length() >= limite) {
            evt.consume();
        }
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9')) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jt_CiudadKeyTyped

    private void jt_DireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_DireccionKeyTyped
        int limite = 60;
        if (jt_Direccion.getText().length() >= limite) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_DireccionKeyTyped

    private void jt_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_TelefonoKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
        int limite = 20;
        if (jt_Telefono.getText().length() >= limite) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_TelefonoKeyTyped

    private void jt_CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CorreoKeyTyped
        int limite = 60;
        if (jt_Correo.getText().length() >= limite) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_CorreoKeyTyped

    private void jb_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_NuevoActionPerformed
        jt_Cedula.setText("");
        jt_Nombre.setText("");
        jt_Pais.setText("");
        jt_Ciudad.setText("");
        jt_Direccion.setText("");
        jt_Telefono.setText("");
        jt_Correo.setText("");
        jcb_Rol.setSelectedIndex(0);
        jcb_Supervisor.setSelectedIndex(0);
        jcb_Tienda.setSelectedIndex(0);
    }//GEN-LAST:event_jb_NuevoActionPerformed

    private void jrb_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_CedulaActionPerformed
        jt_Buscar.setText("");
    }//GEN-LAST:event_jrb_CedulaActionPerformed

    private void jrb_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_NombreActionPerformed
        jt_Buscar.setText("");
    }//GEN-LAST:event_jrb_NombreActionPerformed

    private void jt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_BuscarActionPerformed

    }//GEN-LAST:event_jt_BuscarActionPerformed

    private void jt_BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_BuscarKeyTyped
        if (jrb_Cedula.isSelected()) {
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                evt.consume();  // ignorar el evento de teclado
            }
        }
    }//GEN-LAST:event_jt_BuscarKeyTyped

    private void jb_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_FindActionPerformed
        Conexion c;
        DefaultTableModel dtm = (DefaultTableModel) jtb_Empleados.getModel();
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        jtb_Empleados.setModel(dtm);
        try {
            c = new Conexion();
            try (Statement s = c.c.createStatement()) {
                if (jrb_Cedula.isSelected()) {
                    String cedula = jt_Buscar.getText();
                    if (cedula.equals("")) {
                        cedula = "0";
                    }
                    int fcedula = Integer.parseInt(cedula);
                    String sentence = "select cedula, nombre, telefono, correoElectronico, empleado_Cedula_Supervisor, tienda_idTienda, rol from tb_empleado, tb_contacto where tb_contacto.`idUbicacion` = tb_empleado.`contacto_idUbicacion` and cedula = " + fcedula + "";
                    ResultSet r = s.executeQuery(sentence);
                    while (r.next()) {
                        Object[] o = new Object[]{r.getString(1), r.getString(2), r.getString(3),
                            r.getString(4), r.getString(5), r.getString(6), r.getString(7)};

                        dtm.addRow(o);
                        jtb_Empleados.setModel(dtm);
                    }
                } else if (jrb_Nombre.isSelected()) {
                    String nombre = jt_Buscar.getText();
                    String sentence = "select cedula, nombre, telefono, correoElectronico, empleado_Cedula_Supervisor, tienda_idTienda, rol from tb_empleado, tb_contacto where tb_contacto.`idUbicacion` = tb_empleado.`contacto_idUbicacion` and nombre like '%" + nombre + "%'";
                    ResultSet r = s.executeQuery(sentence);
                    while (r.next()) {
                        Object[] o = new Object[]{r.getString(1), r.getString(2), r.getString(3),
                            r.getString(4), r.getString(5), r.getString(6), r.getString(7)};

                        dtm.addRow(o);
                        jtb_Empleados.setModel(dtm);
                    }
                }
                s.close();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jb_FindActionPerformed

    private void jb_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimpiarActionPerformed
        jt_Buscar.setText("");
        llenarTablaEmpleado();
    }//GEN-LAST:event_jb_LimpiarActionPerformed

    private void jb_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BorrarActionPerformed
        String supervisor = jcb_Supervisor.getSelectedItem().toString();
        if (supervisor.equals("")) {
            JOptionPane.showMessageDialog(null, "Un Supervisor no puede eliminarse de esta manera. \nPrimero debe asignarle los empleados a cargo a otro supervisor");
            llenarTablaEmpleado();
        } else {
            String cedula = jt_Cedula.getText();
            if (cedula.length() == 0) {
                JOptionPane.showMessageDialog(this, "Escriba la cédula del empleado, está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int op = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea borrar el\nempleado asociada a la cédula " + cedula + " ?");
                if (op == JOptionPane.YES_OPTION) {
                    try {
                        Conexion c = new Conexion();
                        Statement s = c.c.createStatement();
                        String sentence = "CALL sp_borrarEmpleado(" + cedula + ")";
                        ResultSet r = s.executeQuery(sentence);
                        if (r.next()) {
                            String ans = r.getString(1);
                            JOptionPane.showMessageDialog(this, ans);
                        } else {
                            JOptionPane.showMessageDialog(this, "Error al intentar borrar", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        c.c.close();
                    } catch (ClassNotFoundException | SQLException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    llenarTablaEmpleado();
                    jt_Cedula.setText("");
                    jt_Nombre.setText("");
                    jt_Pais.setText("");
                    jt_Ciudad.setText("");
                    jt_Direccion.setText("");
                    jt_Telefono.setText("");
                    jt_Correo.setText("");
                    jcb_Rol.setSelectedIndex(0);
                    jcb_Supervisor.setSelectedIndex(0);
                    jcb_Tienda.setSelectedIndex(0);
                }
            }
        }
    }//GEN-LAST:event_jb_BorrarActionPerformed

    private void jtb_EmpleadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtb_EmpleadosKeyTyped

    }//GEN-LAST:event_jtb_EmpleadosKeyTyped

    private void jtb_EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_EmpleadosMouseClicked
        rowToFields(jtb_Empleados.getSelectedRow());
    }//GEN-LAST:event_jtb_EmpleadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_find;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Borrar;
    private javax.swing.JButton jb_Find;
    private javax.swing.JButton jb_Limpiar;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JButton jb_Nuevo;
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
    private javax.swing.JPanel jp_Contenedor;
    private javax.swing.JPanel jp_DatosPersonales;
    private javax.swing.JPanel jp_Find;
    private javax.swing.JRadioButton jrb_Cedula;
    private javax.swing.JRadioButton jrb_Nombre;
    private javax.swing.JTextField jt_Buscar;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Ciudad;
    private javax.swing.JTextField jt_Correo;
    private javax.swing.JTextField jt_Direccion;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Pais;
    private javax.swing.JTextField jt_Telefono;
    private javax.swing.JTable jtb_Empleados;
    // End of variables declaration//GEN-END:variables
}
