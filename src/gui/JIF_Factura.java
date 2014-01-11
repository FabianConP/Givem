/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;

/**
 *
 * @author Personal
 */
public class JIF_Factura extends javax.swing.JInternalFrame {

    /**
     * Creates new form Factura
     */
    public JIF_Factura() {
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

        jp_Vendedor = new javax.swing.JPanel();
        jl_CodigoVendedor = new javax.swing.JLabel();
        jt_CodigoVendedor = new javax.swing.JTextField();
        jb_BuscarEmpleado = new javax.swing.JButton();
        jl_InfoNomVendedor = new javax.swing.JLabel();
        jl_NomVendedor = new javax.swing.JLabel();
        jp_Producto = new javax.swing.JPanel();
        jl_CodigoProducto = new javax.swing.JLabel();
        jt_CodigoProducto = new javax.swing.JTextField();
        jb_BuscarProducto = new javax.swing.JButton();
        jl_InfoPrecio = new javax.swing.JLabel();
        jl_PrecioProducto = new javax.swing.JLabel();
        jl_NombreProducto = new javax.swing.JLabel();
        jl_CantidadProducto = new javax.swing.JLabel();
        jsp_Cantidad = new javax.swing.JSpinner();
        jb_AgregarProducto = new javax.swing.JButton();
        jc_DescuentoProducto = new javax.swing.JCheckBox();
        jl_InfoUnidDispoProducto = new javax.swing.JLabel();
        jt_UnidDispoProducto = new javax.swing.JTextField();
        jt_DescuentoProducto = new javax.swing.JTextField();
        jp_Venta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Venta = new javax.swing.JTable();
        jb_Facturar = new javax.swing.JButton();
        jp_Cliente = new javax.swing.JPanel();
        jl_CodCliente = new javax.swing.JLabel();
        jt_CodigoCliente = new javax.swing.JTextField();
        jb_BuscarCliente = new javax.swing.JButton();
        jl_InfoNomCliente = new javax.swing.JLabel();
        jl_NomCliente = new javax.swing.JLabel();
        jl_InfoFactura = new javax.swing.JLabel();
        jl_NumeroFactura = new javax.swing.JLabel();
        jl_Fecha = new javax.swing.JLabel();
        jl_InfoPrecioTotal = new javax.swing.JLabel();
        jl_PrecioTotal = new javax.swing.JLabel();
        jl_InfoFecha = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Factura");

        jp_Vendedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jl_CodigoVendedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jl_CodigoVendedor.setText("Código vendedor");

        jt_CodigoVendedor.setToolTipText("Código del vendedor");
        jt_CodigoVendedor.setEnabled(false);

        jb_BuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_buscar.png"))); // NOI18N
        jb_BuscarEmpleado.setToolTipText("Buscador de empleados");
        jb_BuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarEmpleadoActionPerformed(evt);
            }
        });

        jl_InfoNomVendedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jl_InfoNomVendedor.setText("Nombre del vendedor:");

        jl_NomVendedor.setText(" ");

        javax.swing.GroupLayout jp_VendedorLayout = new javax.swing.GroupLayout(jp_Vendedor);
        jp_Vendedor.setLayout(jp_VendedorLayout);
        jp_VendedorLayout.setHorizontalGroup(
            jp_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_VendedorLayout.createSequentialGroup()
                        .addComponent(jl_NomVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jp_VendedorLayout.createSequentialGroup()
                        .addComponent(jl_InfoNomVendedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jp_VendedorLayout.createSequentialGroup()
                        .addComponent(jl_CodigoVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_CodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_BuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jp_VendedorLayout.setVerticalGroup(
            jp_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CodigoVendedor)
                    .addComponent(jt_CodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_BuscarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_InfoNomVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_NomVendedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_Producto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jl_CodigoProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jl_CodigoProducto.setText("Código producto");

        jt_CodigoProducto.setToolTipText("Código del producto");
        jt_CodigoProducto.setEnabled(false);

        jb_BuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_buscar.png"))); // NOI18N
        jb_BuscarProducto.setToolTipText("Buscador de productos");
        jb_BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarProductoActionPerformed(evt);
            }
        });

        jl_InfoPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jl_InfoPrecio.setText("Precio");

        jl_PrecioProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_PrecioProducto.setForeground(new java.awt.Color(0, 102, 0));
        jl_PrecioProducto.setText("$$");
        jl_PrecioProducto.setToolTipText("Precio del producto");
        jl_PrecioProducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jl_NombreProducto.setText(" ");
        jl_NombreProducto.setToolTipText("Nombre del producto");

        jl_CantidadProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jl_CantidadProducto.setText("Cantidad");

        jsp_Cantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jsp_Cantidad.setToolTipText("Cantidad de productos a comprar");

        jb_AgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_nuevo.png"))); // NOI18N
        jb_AgregarProducto.setText("Agregar");
        jb_AgregarProducto.setToolTipText("Agregar producto(s) a la factura");

        jc_DescuentoProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jc_DescuentoProducto.setText("Descuento");
        jc_DescuentoProducto.setToolTipText("Marque esta opción si se aplica algún descuento al producto");

        jl_InfoUnidDispoProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jl_InfoUnidDispoProducto.setText("Unid. disp.");

        jt_UnidDispoProducto.setToolTipText("Unidades dispo. del producto");
        jt_UnidDispoProducto.setEnabled(false);

        jt_DescuentoProducto.setToolTipText("Descuento a aplicar");

        javax.swing.GroupLayout jp_ProductoLayout = new javax.swing.GroupLayout(jp_Producto);
        jp_Producto.setLayout(jp_ProductoLayout);
        jp_ProductoLayout.setHorizontalGroup(
            jp_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_ProductoLayout.createSequentialGroup()
                        .addComponent(jl_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_InfoUnidDispoProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_UnidDispoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_CantidadProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsp_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_ProductoLayout.createSequentialGroup()
                        .addComponent(jl_CodigoProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_CodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jl_InfoPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jc_DescuentoProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_DescuentoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jb_AgregarProducto)
                .addContainerGap())
        );
        jp_ProductoLayout.setVerticalGroup(
            jp_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ProductoLayout.createSequentialGroup()
                        .addGroup(jp_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_CodigoProducto)
                            .addComponent(jt_CodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_BuscarProducto)
                            .addComponent(jl_InfoPrecio)
                            .addComponent(jl_PrecioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jc_DescuentoProducto)
                            .addComponent(jt_DescuentoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_NombreProducto)
                            .addComponent(jl_CantidadProducto)
                            .addComponent(jsp_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_InfoUnidDispoProducto)
                            .addComponent(jt_UnidDispoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(jb_AgregarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jp_Venta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jta_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio C/U", "Cantidad", "Precio Total", "Dto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jta_Venta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jta_Venta);
        if (jta_Venta.getColumnModel().getColumnCount() > 0) {
            jta_Venta.getColumnModel().getColumn(0).setPreferredWidth(50);
            jta_Venta.getColumnModel().getColumn(1).setPreferredWidth(400);
            jta_Venta.getColumnModel().getColumn(3).setPreferredWidth(5);
            jta_Venta.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jp_VentaLayout = new javax.swing.GroupLayout(jp_Venta);
        jp_Venta.setLayout(jp_VentaLayout);
        jp_VentaLayout.setHorizontalGroup(
            jp_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_VentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jp_VentaLayout.setVerticalGroup(
            jp_VentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_VentaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        jb_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_imprimir.png"))); // NOI18N
        jb_Facturar.setText("Facturar");
        jb_Facturar.setToolTipText("Haga clic aquí para generar la factura");

        jp_Cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jl_CodCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jl_CodCliente.setText("Código cliente");

        jt_CodigoCliente.setToolTipText("Código del cliente");
        jt_CodigoCliente.setEnabled(false);

        jb_BuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/img_buscar.png"))); // NOI18N
        jb_BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarClienteActionPerformed(evt);
            }
        });

        jl_InfoNomCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jl_InfoNomCliente.setText("Nombre del cliente:");

        jl_NomCliente.setText(" ");

        javax.swing.GroupLayout jp_ClienteLayout = new javax.swing.GroupLayout(jp_Cliente);
        jp_Cliente.setLayout(jp_ClienteLayout);
        jp_ClienteLayout.setHorizontalGroup(
            jp_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ClienteLayout.createSequentialGroup()
                .addGroup(jp_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ClienteLayout.createSequentialGroup()
                        .addComponent(jl_CodCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jt_CodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_ClienteLayout.createSequentialGroup()
                        .addGroup(jp_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_InfoNomCliente)
                            .addComponent(jl_NomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_ClienteLayout.setVerticalGroup(
            jp_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CodCliente)
                    .addComponent(jt_CodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_BuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_InfoNomCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_NomCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_InfoFactura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_InfoFactura.setText("Factura");

        jl_NumeroFactura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_NumeroFactura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_NumeroFactura.setText(" ");

        jl_Fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_Fecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_Fecha.setText(" ");

        jl_InfoPrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_InfoPrecioTotal.setText("Precio Total");

        jl_PrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_PrecioTotal.setForeground(new java.awt.Color(0, 102, 0));
        jl_PrecioTotal.setText("Precio Total");

        jl_InfoFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_InfoFecha.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_Venta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jp_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jp_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jl_InfoFactura))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jl_InfoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jl_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jl_NumeroFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jp_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_InfoPrecioTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_PrecioTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jp_Vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_InfoFactura)
                            .addComponent(jl_NumeroFactura))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_InfoFecha)
                            .addComponent(jl_Fecha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jp_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_InfoPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_PrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );

        final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        final Calendar cal = Calendar.getInstance();
        jl_Fecha.setText(dateFormat.format(cal.getTime()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String docCliente, nomCliente;

    private void jb_BuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarEmpleadoActionPerformed
        Frm_BuscadorEmpleado frm_BuscadorEmpleado = new Frm_BuscadorEmpleado();
        frm_BuscadorEmpleado.main(new String[]{""});
    }//GEN-LAST:event_jb_BuscarEmpleadoActionPerformed

    private void jb_BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarClienteActionPerformed
        Frm_BuscadorCliente frm_BuscadorCliente = new Frm_BuscadorCliente();
        frm_BuscadorCliente.main(new String[]{""});
    }//GEN-LAST:event_jb_BuscarClienteActionPerformed

    private void jb_BuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarProductoActionPerformed
        Frm_BuscadorProducto frm_BuscadorProducto = new Frm_BuscadorProducto();
        frm_BuscadorProducto.main(new String[]{""});
    }//GEN-LAST:event_jb_BuscarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_AgregarProducto;
    private javax.swing.JButton jb_BuscarCliente;
    private javax.swing.JButton jb_BuscarEmpleado;
    private javax.swing.JButton jb_BuscarProducto;
    private javax.swing.JButton jb_Facturar;
    private javax.swing.JCheckBox jc_DescuentoProducto;
    private javax.swing.JLabel jl_CantidadProducto;
    private javax.swing.JLabel jl_CodCliente;
    private javax.swing.JLabel jl_CodigoProducto;
    private javax.swing.JLabel jl_CodigoVendedor;
    private javax.swing.JLabel jl_Fecha;
    private javax.swing.JLabel jl_InfoFactura;
    private javax.swing.JLabel jl_InfoFecha;
    private javax.swing.JLabel jl_InfoNomCliente;
    private javax.swing.JLabel jl_InfoNomVendedor;
    private javax.swing.JLabel jl_InfoPrecio;
    private javax.swing.JLabel jl_InfoPrecioTotal;
    private javax.swing.JLabel jl_InfoUnidDispoProducto;
    public static javax.swing.JLabel jl_NomCliente;
    public static javax.swing.JLabel jl_NomVendedor;
    public static javax.swing.JLabel jl_NombreProducto;
    private javax.swing.JLabel jl_NumeroFactura;
    public static javax.swing.JLabel jl_PrecioProducto;
    private javax.swing.JLabel jl_PrecioTotal;
    private javax.swing.JPanel jp_Cliente;
    private javax.swing.JPanel jp_Producto;
    private javax.swing.JPanel jp_Vendedor;
    private javax.swing.JPanel jp_Venta;
    private javax.swing.JSpinner jsp_Cantidad;
    public static javax.swing.JTextField jt_CodigoCliente;
    public static javax.swing.JTextField jt_CodigoProducto;
    public static javax.swing.JTextField jt_CodigoVendedor;
    private javax.swing.JTextField jt_DescuentoProducto;
    private javax.swing.JTextField jt_UnidDispoProducto;
    private javax.swing.JTable jta_Venta;
    // End of variables declaration//GEN-END:variables
}
