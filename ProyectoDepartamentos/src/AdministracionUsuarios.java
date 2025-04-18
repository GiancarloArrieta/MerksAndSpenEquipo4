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

public class AdministracionUsuarios extends javax.swing.JFrame {

    private CRUDDepartamentos crud;
    
    /**
     * Creates new form AdministracionUsuarios
     */
    public AdministracionUsuarios() {
        initComponents();
        crud = new CRUDDepartamentos();
        this.setLocationRelativeTo(null);
        this.setSize(550, 450);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtIDConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartamentosConsulta = new javax.swing.JTable();
        btnBuscarIDConsulta = new javax.swing.JButton();
        btnMostrarTodos = new javax.swing.JButton();
        btnRegresar1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtUsuarioActualizacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtContrasenaActualizacion = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtIDActualizacion = new javax.swing.JTextField();
        btnRegresar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDepartamentosEliminar = new javax.swing.JTable();
        btnBuscarIDEliminar = new javax.swing.JButton();
        txtIDEliminar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegresar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 430));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(550, 450));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Merks and Spen");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 538, 31));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de departamentos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 538, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 106, 493, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre de departamento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 141, 191, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 141, 284, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 181, 191, -1));

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 181, 284, -1));

        btnAgregar.setBackground(new java.awt.Color(102, 255, 102));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar departamento");
        btnAgregar.setMaximumSize(new java.awt.Dimension(142, 24));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 244, 493, 40));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, -1));

        jTabbedPane1.addTab("Registro", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Merks and Spen");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 550, 31));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consulta de departamentos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 538, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 106, 493, -1));

        txtIDConsulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDConsulta.setForeground(new java.awt.Color(102, 102, 102));
        txtIDConsulta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(txtIDConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 83, -1));

        tblDepartamentosConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Departamento", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDepartamentosConsulta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 127, 493, 120));

        btnBuscarIDConsulta.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscarIDConsulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarIDConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarIDConsulta.setText("Buscar por ID");
        btnBuscarIDConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarIDConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        btnMostrarTodos.setBackground(new java.awt.Color(153, 153, 255));
        btnMostrarTodos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrarTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarTodos.setText("Mostrar todos");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        btnRegresar1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegresar1.setText("Regresar");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, -1));

        jTabbedPane1.addTab("Consulta", jPanel2);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Merks and Spen");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 550, 31));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Actualización de departamentos");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 538, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 106, 493, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nombre de departamento:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 191, -1));

        txtUsuarioActualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActualizacionActionPerformed(evt);
            }
        });
        jPanel4.add(txtUsuarioActualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 284, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Contraseña:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 191, -1));

        txtContrasenaActualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActualizacionActionPerformed(evt);
            }
        });
        jPanel4.add(txtContrasenaActualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 284, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 204, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar departamento");
        btnActualizar.setMaximumSize(new java.awt.Dimension(142, 24));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 493, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("ID:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 191, -1));

        txtIDActualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActualizacionActionPerformed(evt);
            }
        });
        jPanel4.add(txtIDActualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 284, -1));

        btnRegresar2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegresar2.setText("Regresar");
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, -1));

        jTabbedPane1.addTab("Actualización", jPanel4);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Merks and Spen");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 550, 31));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Eliminación de departamentos");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 538, -1));

        tblDepartamentosEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Departamento", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDepartamentosEliminar);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 186, 493, 110));

        btnBuscarIDEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscarIDEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarIDEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarIDEliminar.setText("Buscar por ID");
        btnBuscarIDEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarIDEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 135, -1, -1));

        txtIDEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDEliminar.setForeground(new java.awt.Color(102, 102, 102));
        txtIDEliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(txtIDEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 135, 83, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar usuario");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 135, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 106, 493, -1));

        btnRegresar4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegresar4.setText("Regresar");
        btnRegresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 110, -1));

        jTabbedPane1.addTab("Eliminación", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        if(nombre.isEmpty() || contrasena.isEmpty()){
            JOptionPane.showMessageDialog(null, "ERROR: Todos los campos son obligatorios.", "Registro de departamento", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean status = crud.crearDepartamento(nombre, contrasena);

        if(status){
            JOptionPane.showMessageDialog(null, "El departamento se guardó exitosamente", "Registro de departamento", JOptionPane.INFORMATION_MESSAGE);
            txtUsuario.setText("");
            txtContrasena.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR: El departamento no fue guardado debido a un error.", "Registro de departamento", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtIDConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDConsultaActionPerformed

    private void btnBuscarIDConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDConsultaActionPerformed
        String idText = txtIDConsulta.getText();
        if(idText.isEmpty()){
            JOptionPane.showMessageDialog(null, "ERROR: Es necesario ingresar un ID para generar una consulta." , "Consulta de departamento", JOptionPane.QUESTION_MESSAGE);
            return;
        }
        try{
            ResultSet consulta = crud.obtenerDepartamentoID(Integer.parseInt(idText));
            DefaultTableModel modelo = (DefaultTableModel)tblDepartamentosConsulta.getModel();
            modelo.setRowCount(0);
            if(consulta.next()){
                modelo.addRow(new Object[]{consulta.getInt("id"), consulta.getString("nombre"), consulta.getString("contrasena")});
            }
            txtIDConsulta.setText("");
        }catch(SQLException e){
            System.out.println("Error al intentar llenar la tabla:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarIDConsultaActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        ResultSet consultaTodos = crud.obtenerDepartamentos();
        DefaultTableModel modelo = (DefaultTableModel)tblDepartamentosConsulta.getModel();
        modelo.setRowCount(0);
        
        try{
            while(consultaTodos.next()){
                modelo.addRow(new Object[]{consultaTodos.getInt("id"), consultaTodos.getString("nombre"), consultaTodos.getString("contrasena")});
            }
        }catch(SQLException e){
            System.out.println("Error al intentar llenar la tabla:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnBuscarIDEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDEliminarActionPerformed
        String idText = txtIDEliminar.getText();
        if(idText.isEmpty()){
            JOptionPane.showMessageDialog(null, "ERROR: Es necesario ingresar un ID para generar una consulta." , "Consulta de departamento", JOptionPane.QUESTION_MESSAGE);
            return;
        }
        try{
            ResultSet consulta = crud.obtenerDepartamentoID(Integer.parseInt(idText));
            DefaultTableModel modelo = (DefaultTableModel)tblDepartamentosEliminar.getModel();
            modelo.setRowCount(0);
            if(consulta.next()){
                modelo.addRow(new Object[]{consulta.getInt("id"), consulta.getString("nombre"), consulta.getString("contrasena")});
            }
            txtIDConsulta.setText("");
        }catch(SQLException e){
            System.out.println("Error al intentar llenar la tabla:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarIDEliminarActionPerformed

    private void txtIDEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDEliminarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = txtIDEliminar.getText();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null, "ERROR: Es necesario ingresar un nombre para eliminar un usuario." , "Eliminación de departamento", JOptionPane.QUESTION_MESSAGE);
            return;
        }
        String botones[] = {"Sí", "No"};
        int decision = JOptionPane.showOptionDialog(null, "¿Estás seguro de querer eliminar al usuario " + id + "?",
                "Eliminación de usuario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if(decision == 0){
            boolean status = crud.eliminarDepartamento(id);
            if(status){
            JOptionPane.showMessageDialog(null, "El usuario se eliminó exitosamente", "Eliminación de departamento", JOptionPane.INFORMATION_MESSAGE);
            txtIDEliminar.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR: El usuario no fue eliminó debido a un error.", "Eliminación de departamento", JOptionPane.ERROR_MESSAGE);
        }
        }else{
            return;
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtUsuarioActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActualizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActualizacionActionPerformed

    private void txtContrasenaActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActualizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActualizacionActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String id = txtIDActualizacion.getText();
        String nombre = txtUsuarioActualizacion.getText();
        String contrasena = txtContrasenaActualizacion.getText();
        
        if(id.isEmpty() || nombre.isEmpty() || contrasena.isEmpty()){
            JOptionPane.showMessageDialog(null, "ERROR: Todos los campos son obligatorios.", "Actualización de departamento", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String botones[] = {"Sí", "No"};
        int decision = JOptionPane.showOptionDialog(null, "Se actualizará el usuario con el ID '" + id + "' con los siguientes datos:\n"
                + "Nombre: " + nombre
                + "\nContraseña: " + contrasena,
                "Actualización de usuario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if(decision == 0){
            boolean status = crud.actualizarDepartamento(id, nombre, contrasena);
            if(status){
            JOptionPane.showMessageDialog(null, "El usuario se actualizó exitosamente", "Actualización de departamento", JOptionPane.INFORMATION_MESSAGE);
            txtIDActualizacion.setText("");
            txtUsuarioActualizacion.setText("");
            txtContrasenaActualizacion.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "ERROR: El usuario no fue guardado debido a un error.", "Actualización de departamento", JOptionPane.ERROR_MESSAGE);
        }
        }else{
            return;
        }        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtIDActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActualizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActualizacionActionPerformed

    private void btnRegresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar4ActionPerformed
        regresar();
    }//GEN-LAST:event_btnRegresar4ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        regresar();
    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        regresar();
    }//GEN-LAST:event_btnRegresar2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionUsuarios().setVisible(true);
            }
        });
    }
    
    private void regresar(){
        this.setVisible(false);
        this.dispose();
        MenuAdmin MA = new MenuAdmin();
        MA.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarIDConsulta;
    private javax.swing.JButton btnBuscarIDEliminar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JButton btnRegresar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDepartamentosConsulta;
    private javax.swing.JTable tblDepartamentosEliminar;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtContrasenaActualizacion;
    private javax.swing.JTextField txtIDActualizacion;
    private javax.swing.JTextField txtIDConsulta;
    private javax.swing.JTextField txtIDEliminar;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioActualizacion;
    // End of variables declaration//GEN-END:variables
}
