/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Conexion.Conexion;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class Frm_Principal extends javax.swing.JFrame {

    public static String cedula;
    public static String cedulaSupervisor;
    public static String idTienda;
    public static String rol;
    public static String nombre;
    public static String pais;
    public static String ciudad;
    public static String direccion;
    public static String telefono;
    public static String email;

    /**
     * Creates new form Principal
     */
    public Frm_Principal(String Cedula, String Rol) {
        initComponents();
        cedula = Cedula;
        rol = Rol;
        this.setTitle(this.getTitle() + " - " + rol);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdp_DesktopPrincipal = new javax.swing.JDesktopPane();
        jmb_Principal = new javax.swing.JMenuBar();
        jm_Archivo = new javax.swing.JMenu();
        jmi_Cerrar_Sesion = new javax.swing.JMenuItem();
        jmi_Salir = new javax.swing.JMenuItem();
        jm_Buscar = new javax.swing.JMenu();
        jmi_BProducto = new javax.swing.JMenuItem();
        jmi_BCliente = new javax.swing.JMenuItem();
        jmi_BEmpleado = new javax.swing.JMenuItem();
        jmi_BTienda = new javax.swing.JMenuItem();
        jm_Agregar_Modificar = new javax.swing.JMenu();
        jmi_Factura = new javax.swing.JMenuItem();
        jmi_Producto = new javax.swing.JMenuItem();
        jmi_Cliente = new javax.swing.JMenuItem();
        jmi_Empleado = new javax.swing.JMenuItem();
        jmi_Proveedor = new javax.swing.JMenuItem();
        jmi_Tienda = new javax.swing.JMenuItem();
        jm_Herramientas = new javax.swing.JMenu();
        jmi_Generar_CS = new javax.swing.JMenuItem();
        jmi_Restaurar = new javax.swing.JMenuItem();
        jm_Informes = new javax.swing.JMenu();
        jmi_Informe_General = new javax.swing.JMenuItem();
        jmi_Productos_Vendidos = new javax.swing.JMenuItem();
        jmi_Ventas_Tienda = new javax.swing.JMenuItem();
        jmi_Ventas_Vendedor = new javax.swing.JMenuItem();
        jmi_Inventario = new javax.swing.JMenuItem();
        jm_Ayuda = new javax.swing.JMenu();
        jmi_Contenidos_Ayuda = new javax.swing.JMenuItem();
        jmi_Acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Givem");
        setPreferredSize(new java.awt.Dimension(1024, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jm_Archivo.setText("Archivo");

        jmi_Cerrar_Sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_loginOut_small.png"))); // NOI18N
        jmi_Cerrar_Sesion.setText("Cerrar Sesión");
        jmi_Cerrar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Cerrar_SesionActionPerformed(evt);
            }
        });
        jm_Archivo.add(jmi_Cerrar_Sesion);

        jmi_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_salir_small.png"))); // NOI18N
        jmi_Salir.setText("Salir");
        jmi_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_SalirActionPerformed(evt);
            }
        });
        jm_Archivo.add(jmi_Salir);

        jmb_Principal.add(jm_Archivo);

        jm_Buscar.setText("Buscar");

        jmi_BProducto.setText("Producto");
        jm_Buscar.add(jmi_BProducto);

        jmi_BCliente.setText("Cliente");
        jm_Buscar.add(jmi_BCliente);

        jmi_BEmpleado.setText("Empleado");
        jm_Buscar.add(jmi_BEmpleado);

        jmi_BTienda.setText("Tienda");
        jm_Buscar.add(jmi_BTienda);

        jmb_Principal.add(jm_Buscar);

        jm_Agregar_Modificar.setText("Agregar / Modificar");

        jmi_Factura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_factura_small.png"))); // NOI18N
        jmi_Factura.setText("Factura");
        jmi_Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_FacturaActionPerformed(evt);
            }
        });
        jm_Agregar_Modificar.add(jmi_Factura);

        jmi_Producto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_producto_small.png"))); // NOI18N
        jmi_Producto.setText("Producto");
        jmi_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ProductoActionPerformed(evt);
            }
        });
        jm_Agregar_Modificar.add(jmi_Producto);

        jmi_Cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_cliente_small.png"))); // NOI18N
        jmi_Cliente.setText("Cliente");
        jmi_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ClienteActionPerformed(evt);
            }
        });
        jm_Agregar_Modificar.add(jmi_Cliente);

        jmi_Empleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_empleado_small.png"))); // NOI18N
        jmi_Empleado.setText("Empleado");
        jmi_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EmpleadoActionPerformed(evt);
            }
        });
        jm_Agregar_Modificar.add(jmi_Empleado);

        jmi_Proveedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_proveedor_small.png"))); // NOI18N
        jmi_Proveedor.setText("Proveedor");
        jmi_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ProveedorActionPerformed(evt);
            }
        });
        jm_Agregar_Modificar.add(jmi_Proveedor);

        jmi_Tienda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmi_Tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_tienda_small.png"))); // NOI18N
        jmi_Tienda.setText("Tienda");
        jmi_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_TiendaActionPerformed(evt);
            }
        });
        jm_Agregar_Modificar.add(jmi_Tienda);

        jmb_Principal.add(jm_Agregar_Modificar);

        jm_Herramientas.setText("Herramientas");

        jmi_Generar_CS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_copia_small.png"))); // NOI18N
        jmi_Generar_CS.setText("Generar Copia de Seguridad");
        jm_Herramientas.add(jmi_Generar_CS);

        jmi_Restaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_restaurar_small.png"))); // NOI18N
        jmi_Restaurar.setText("Restaurar");
        jm_Herramientas.add(jmi_Restaurar);

        jmb_Principal.add(jm_Herramientas);

        jm_Informes.setText("Informes");

        jmi_Informe_General.setText("Informe General");
        jmi_Informe_General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Informe_GeneralActionPerformed(evt);
            }
        });
        jm_Informes.add(jmi_Informe_General);

        jmi_Productos_Vendidos.setText("Productos Vendidos");
        jmi_Productos_Vendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Productos_VendidosActionPerformed(evt);
            }
        });
        jm_Informes.add(jmi_Productos_Vendidos);

        jmi_Ventas_Tienda.setText("Ventas por Tienda");
        jm_Informes.add(jmi_Ventas_Tienda);

        jmi_Ventas_Vendedor.setText("Ventas por Vendedor");
        jm_Informes.add(jmi_Ventas_Vendedor);

        jmi_Inventario.setText("Inventario");
        jm_Informes.add(jmi_Inventario);

        jmb_Principal.add(jm_Informes);

        jm_Ayuda.setText("Ayuda");

        jmi_Contenidos_Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_ayuda_small.png"))); // NOI18N
        jmi_Contenidos_Ayuda.setText("Contenidos de Ayuda");
        jm_Ayuda.add(jmi_Contenidos_Ayuda);

        jmi_Acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_acerca_small.png"))); // NOI18N
        jmi_Acerca.setText("Acerca");
        jm_Ayuda.add(jmi_Acerca);

        jmb_Principal.add(jm_Ayuda);

        setJMenuBar(jmb_Principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdp_DesktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdp_DesktopPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ProductoActionPerformed
        JIF_Producto jif_Producto = new JIF_Producto();
        jdp_DesktopPrincipal.removeAll();
        jdp_DesktopPrincipal.add(jif_Producto);
        jif_Producto.show();
    }//GEN-LAST:event_jmi_ProductoActionPerformed

    private void jmi_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmi_SalirActionPerformed

    private void jmi_Cerrar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Cerrar_SesionActionPerformed
        Frm_Inicio_Sesion frm_Inicio_Sesion = new Frm_Inicio_Sesion();
        frm_Inicio_Sesion.main(new String[]{""});
        this.dispose();
    }//GEN-LAST:event_jmi_Cerrar_SesionActionPerformed

    private void jmi_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ClienteActionPerformed
        JIF_Cliente jif_Cliente = new JIF_Cliente();
        jdp_DesktopPrincipal.removeAll();
        jdp_DesktopPrincipal.add(jif_Cliente);
        jif_Cliente.show();
    }//GEN-LAST:event_jmi_ClienteActionPerformed

    private void jmi_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ProveedorActionPerformed
        JIF_Proveedor jif_Proveedor = new JIF_Proveedor();
        jdp_DesktopPrincipal.removeAll();
        jdp_DesktopPrincipal.add(jif_Proveedor);
        jif_Proveedor.show();
    }//GEN-LAST:event_jmi_ProveedorActionPerformed

    private void jmi_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EmpleadoActionPerformed
        JIF_Empleado jif_Empleado = new JIF_Empleado();
        jdp_DesktopPrincipal.removeAll();
        jdp_DesktopPrincipal.add(jif_Empleado);
        jif_Empleado.show();
    }//GEN-LAST:event_jmi_EmpleadoActionPerformed

    private void jmi_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_TiendaActionPerformed
        JIF_Tienda jif_Tienda = new JIF_Tienda();
        jdp_DesktopPrincipal.removeAll();
        jdp_DesktopPrincipal.add(jif_Tienda);
        jif_Tienda.show();
    }//GEN-LAST:event_jmi_TiendaActionPerformed

    private void jmi_FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_FacturaActionPerformed
        JIF_Factura jif_Factura = new JIF_Factura();
        jdp_DesktopPrincipal.removeAll();
        jdp_DesktopPrincipal.add(jif_Factura);
        jif_Factura.show();
    }//GEN-LAST:event_jmi_FacturaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Conexion c = new Conexion();
            Statement s = c.c.createStatement();
            String sentence = "CALL sp_infoSesion(" + cedula + ")";
            ResultSet r = s.executeQuery(sentence);
            while (r.next()) {
                idTienda = r.getString(3);
                rol = r.getString(6);
                nombre = r.getString(8);
                pais = r.getString(9);
                ciudad = r.getString(10);
                direccion = r.getString(11);
                telefono = r.getString(12);
                email = r.getString(13);
            }
            c.c.close();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jmi_Informe_GeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Informe_GeneralActionPerformed
        JIF_InformeGeneral jif_informeGeneral = new JIF_InformeGeneral();
        jdp_DesktopPrincipal.removeAll();
        jdp_DesktopPrincipal.add(jif_informeGeneral);
        jif_informeGeneral.show();
    }//GEN-LAST:event_jmi_Informe_GeneralActionPerformed

    private void jmi_Productos_VendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Productos_VendidosActionPerformed
        JIF_ProductosVendidos jif_productosVendidos = new JIF_ProductosVendidos();
        jdp_DesktopPrincipal.removeAll();
        jdp_DesktopPrincipal.add(jif_productosVendidos);
        jif_productosVendidos.show();
    }//GEN-LAST:event_jmi_Productos_VendidosActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Principal(cedula, rol).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jdp_DesktopPrincipal;
    private javax.swing.JMenu jm_Agregar_Modificar;
    private javax.swing.JMenu jm_Archivo;
    private javax.swing.JMenu jm_Ayuda;
    private javax.swing.JMenu jm_Buscar;
    private javax.swing.JMenu jm_Herramientas;
    private javax.swing.JMenu jm_Informes;
    private javax.swing.JMenuBar jmb_Principal;
    private javax.swing.JMenuItem jmi_Acerca;
    private javax.swing.JMenuItem jmi_BCliente;
    private javax.swing.JMenuItem jmi_BEmpleado;
    private javax.swing.JMenuItem jmi_BProducto;
    private javax.swing.JMenuItem jmi_BTienda;
    private javax.swing.JMenuItem jmi_Cerrar_Sesion;
    private javax.swing.JMenuItem jmi_Cliente;
    private javax.swing.JMenuItem jmi_Contenidos_Ayuda;
    private javax.swing.JMenuItem jmi_Empleado;
    private javax.swing.JMenuItem jmi_Factura;
    private javax.swing.JMenuItem jmi_Generar_CS;
    private javax.swing.JMenuItem jmi_Informe_General;
    private javax.swing.JMenuItem jmi_Inventario;
    private javax.swing.JMenuItem jmi_Producto;
    private javax.swing.JMenuItem jmi_Productos_Vendidos;
    private javax.swing.JMenuItem jmi_Proveedor;
    private javax.swing.JMenuItem jmi_Restaurar;
    private javax.swing.JMenuItem jmi_Salir;
    private javax.swing.JMenuItem jmi_Tienda;
    private javax.swing.JMenuItem jmi_Ventas_Tienda;
    private javax.swing.JMenuItem jmi_Ventas_Vendedor;
    // End of variables declaration//GEN-END:variables
}
