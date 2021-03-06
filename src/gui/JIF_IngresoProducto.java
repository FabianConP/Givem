/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Conexion.Conexion;
import com.alee.managers.notification.NotificationIcon;
import com.alee.managers.notification.NotificationManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;

/**
 *
 * @author Personal
 */
public class JIF_IngresoProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form IngresoProducto
     */
    public JIF_IngresoProducto() {
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

        jl_infoTienda = new javax.swing.JLabel();
        jl_idTienda = new javax.swing.JLabel();
        jl_infoProducto = new javax.swing.JLabel();
        jt_idProducto = new javax.swing.JTextField();
        jb_BuscadorGeneral = new javax.swing.JButton();
        jl_infoCantAgregar = new javax.swing.JLabel();
        js_CantAgregar = new javax.swing.JSpinner();
        jl_infoCantActual = new javax.swing.JLabel();
        jl_cantActual = new javax.swing.JLabel();
        jb_Agregar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jl_infoTienda.setText("ID. tienda");

        jl_idTienda.setText("0");
        jl_idTienda.setToolTipText("ID. de la tienda del usuario de la sesión");

        jl_infoProducto.setText("ID. producto");

        jt_idProducto.setToolTipText("<html>\nID. del producto a agregar<p>\n[Si no conoce el ID oprima el botón que se encuentra a la derecha]\n</html>");

        jb_BuscadorGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_buscar.png"))); // NOI18N
        jb_BuscadorGeneral.setToolTipText("Buscador de productos");
        jb_BuscadorGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscadorGeneralActionPerformed(evt);
            }
        });

        jl_infoCantAgregar.setText("Agregar");

        js_CantAgregar.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        js_CantAgregar.setToolTipText("Cantidad a agregar");

        jl_infoCantActual.setText("Cant. actual");

        jl_cantActual.setText("0");
        jl_cantActual.setToolTipText("Cantidad que la tienda posee actualmente");

        jb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_nuevo.png"))); // NOI18N
        jb_Agregar.setText("Agregar");
        jb_Agregar.setToolTipText("Agregar ");
        jb_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_infoProducto)
                                    .addComponent(jl_infoTienda))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_idTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jt_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_BuscadorGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jl_infoCantAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_infoCantActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jl_cantActual, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(js_CantAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_Agregar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_infoTienda)
                    .addComponent(jl_idTienda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_infoProducto)
                    .addComponent(jt_idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_BuscadorGeneral))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_infoCantActual)
                    .addComponent(jl_cantActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_infoCantAgregar)
                    .addComponent(js_CantAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Agregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_idTienda.setText(Frm_Principal.idTienda);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_BuscadorGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscadorGeneralActionPerformed
        Frm_BuscadorProductoGen frm_BuscadorProductoGen = new Frm_BuscadorProductoGen();
        frm_BuscadorProductoGen.main(new String[]{""});
    }//GEN-LAST:event_jb_BuscadorGeneralActionPerformed

    private void jb_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AgregarActionPerformed
        if (jt_idProducto.getText().length() == 0 || js_CantAgregar.getValue().toString().length() == 0) {
            NotificationManager.showNotification("Complete todos los campos", NotificationIcon.error.getIcon()).setDisplayTime(3000);
        } else {
            Conexion c;
            try {
                c = new Conexion();
                Statement s = c.c.createStatement();
                String idTienda = jl_idTienda.getText();
                String idProducto = jt_idProducto.getText();
                String cantidad = js_CantAgregar.getValue().toString();
                String sentence = "CALL sp_agregarCantProducto(" + idTienda + "," + idProducto + "," + cantidad + ")", ans = "";
                ResultSet r = s.executeQuery(sentence);
                if (r.next()) {
                    ans = r.getString(1);
                    Icon icon = !ans.startsWith("No") ? NotificationIcon.information.getIcon() : NotificationIcon.error.getIcon();
                    NotificationManager.showNotification(ans, icon).setDisplayTime(3000);
                } else {
                    NotificationManager.showNotification("No se pudo agregar, verifique el ID del producto", NotificationIcon.error.getIcon()).setDisplayTime(3000);
                }
                c.c.close();
            } catch (ClassNotFoundException | SQLException ex) {
                NotificationManager.showNotification("No se pudo agregar, verifique el ID del producto", NotificationIcon.error.getIcon()).setDisplayTime(3000);
            }
        }
    }//GEN-LAST:event_jb_AgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_BuscadorGeneral;
    private javax.swing.JLabel jl_cantActual;
    private javax.swing.JLabel jl_idTienda;
    private javax.swing.JLabel jl_infoCantActual;
    private javax.swing.JLabel jl_infoCantAgregar;
    private javax.swing.JLabel jl_infoProducto;
    private javax.swing.JLabel jl_infoTienda;
    private javax.swing.JSpinner js_CantAgregar;
    private javax.swing.JTextField jt_idProducto;
    // End of variables declaration//GEN-END:variables
}
