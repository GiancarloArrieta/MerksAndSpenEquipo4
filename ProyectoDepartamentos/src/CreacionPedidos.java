/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Elin
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CreacionPedidos extends javax.swing.JFrame {
    
    private CRUDpedidos crud;
    /**
     * Creates new form CreacionPedidos
     */
    public CreacionPedidos() {
        initComponents();
        crud = new CRUDpedidos();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPGP = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jlabelUsuario1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnGenerarPedido = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtidUsuario = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnGuardarPedido = new javax.swing.JButton();
        jLIdPedido = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtidArticulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        btnRegresar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jlabelUsuario2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();
        MostrarInventario = new javax.swing.JButton();
        btnRegresar2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlabelUsuario3 = new javax.swing.JLabel();
        btnMostrarPedidos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnMostrarDepartamentos = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDepartamentos = new javax.swing.JTable();
        btnRegresar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPGP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabelUsuario1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jlabelUsuario1.setText("Generar nuevo pedido");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Generar pedido"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerarPedido.setBackground(new java.awt.Color(204, 255, 204));
        btnGenerarPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerarPedido.setText("Generar pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });
        jPanel6.add(btnGenerarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 173, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID de usuario:");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 108, -1));

        txtidUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidUsuarioActionPerformed(evt);
            }
        });
        jPanel6.add(txtidUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 234, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar artículos"));

        btnGuardarPedido.setBackground(new java.awt.Color(255, 204, 204));
        btnGuardarPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarPedido.setText("Agregar artículo");
        btnGuardarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPedidoActionPerformed(evt);
            }
        });

        jLIdPedido.setBackground(new java.awt.Color(0, 0, 0));
        jLIdPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLIdPedido.setText("ID del pedido:");

        txtIdPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPedidoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID de artículo:");

        txtidArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidArticuloActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnGuardarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLIdPedido)
                .addGap(18, 18, 18)
                .addComponent(txtIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(txtidArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnGuardarPedido)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnRegresar1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegresar1.setText("Regresar");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jlabelUsuario1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlabelUsuario1)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar1))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Generar Pedido", jPanel4);

        jlabelUsuario2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jlabelUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelUsuario2.setText("Inventario Actual");

        jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Producto", "Categoría"
            }
        ));
        jScrollPane2.setViewportView(jTableInventario);

        MostrarInventario.setText("Refrescar inventario");
        MostrarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInventarioActionPerformed(evt);
            }
        });

        btnRegresar2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegresar2.setText("Regresar");
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jlabelUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(MostrarInventario))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(btnRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlabelUsuario2)
                .addGap(18, 18, 18)
                .addComponent(MostrarInventario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnRegresar2)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Inventario", jPanel5);

        jlabelUsuario3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jlabelUsuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelUsuario3.setText("Consulta de IDs");

        btnMostrarPedidos.setText("Refrescar pedidos");
        btnMostrarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPedidosActionPerformed(evt);
            }
        });

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Departamento"
            }
        ));
        jScrollPane3.setViewportView(tblPedidos);

        btnMostrarDepartamentos.setText("Refrescar departamentos");
        btnMostrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDepartamentosActionPerformed(evt);
            }
        });

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Departamento"
            }
        ));
        jScrollPane4.setViewportView(tblDepartamentos);

        btnRegresar3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegresar3.setText("Regresar");
        btnRegresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jlabelUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnMostrarPedidos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(btnMostrarDepartamentos))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlabelUsuario3)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarPedidos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarDepartamentos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnRegresar3)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de IDs", jPanel1);

        JPGP.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        try {
            if (txtidUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Todos los campos deben contener valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int idUsuario = Integer.parseInt(txtidUsuario.getText());
                  
            boolean status = crud.generarPedido(idUsuario);

            if(status){
                JOptionPane.showMessageDialog(null, "El pedido se guardó exitosamente", "Registro de pedido", JOptionPane.INFORMATION_MESSAGE);
                txtidUsuario.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR: El pedido no fue guardado debido a un error.", "Registro de pedido", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa solo números en los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

    private void txtIdPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPedidoActionPerformed

    private void txtidArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidArticuloActionPerformed

    private void txtidUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidUsuarioActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void btnGuardarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPedidoActionPerformed
        try {
            if (txtIdPedido.getText().isEmpty() || txtidArticulo.getText().isEmpty() || txtcantidad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Todos los campos deben contener valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            int idPedido = Integer.parseInt(txtIdPedido.getText());
            int idArticulo = Integer.parseInt(txtidArticulo.getText());
            int cantidad = Integer.parseInt(txtcantidad.getText());
                  
            boolean status = crud.insertarArticulos(idPedido, idArticulo, cantidad);

            if(status){
                JOptionPane.showMessageDialog(null, "El artículo se insertó en el pedido exitosamente", "Registro de pedido", JOptionPane.INFORMATION_MESSAGE);
                txtidUsuario.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR: El artículo no fue guardado debido a un error.", "Registro de pedido", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa solo números en los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarPedidoActionPerformed

    private void MostrarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInventarioActionPerformed
        crud.mostrarInventario(jTableInventario);
    }//GEN-LAST:event_MostrarInventarioActionPerformed

    private void btnMostrarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPedidosActionPerformed
        try{
            ResultSet consulta = crud.consultaPedidos();
            DefaultTableModel modelo = (DefaultTableModel)tblPedidos.getModel();
            modelo.setRowCount(0);
            while(consulta.next()){
                modelo.addRow(new Object[]{consulta.getInt("pedidos.id"), consulta.getString("usuarios.nombre")});
            }
        }catch(SQLException e){
            System.out.println("Error al intentar llenar la tabla:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnMostrarPedidosActionPerformed

    private void btnMostrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDepartamentosActionPerformed
        try{
            ResultSet consulta = crud.consultaDepartamentos();
            DefaultTableModel modelo = (DefaultTableModel)tblDepartamentos.getModel();
            modelo.setRowCount(0);
            while(consulta.next()){
                modelo.addRow(new Object[]{consulta.getInt("id"), consulta.getString("nombre")});
            }
        }catch(SQLException e){
            System.out.println("Error al intentar llenar la tabla:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnMostrarDepartamentosActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        regresar();
    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        regresar();
    }//GEN-LAST:event_btnRegresar2ActionPerformed

    private void btnRegresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar3ActionPerformed
        regresar();
    }//GEN-LAST:event_btnRegresar3ActionPerformed

    private void regresar(){
        this.setVisible(false);
        this.dispose();
        MenuUsuario MU = new MenuUsuario();
        MU.setVisible(true);
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
            java.util.logging.Logger.getLogger(CreacionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPGP;
    private javax.swing.JButton MostrarInventario;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JButton btnGuardarPedido;
    private javax.swing.JButton btnMostrarDepartamentos;
    private javax.swing.JButton btnMostrarPedidos;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JButton btnRegresar3;
    private javax.swing.JLabel jLIdPedido;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableInventario;
    private javax.swing.JLabel jlabelUsuario1;
    private javax.swing.JLabel jlabelUsuario2;
    private javax.swing.JLabel jlabelUsuario3;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtidArticulo;
    private javax.swing.JTextField txtidUsuario;
    // End of variables declaration//GEN-END:variables
}
