import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;



public class CRUDpedidos {
     ConexionMySQL conexion = new ConexionMySQL ();
  
    public void AgregarArticulo(int idPedido, int idArticulo, int cantidad, int idUsuario, JTable tablaSolicitud) {
        if (tablaSolicitud != null) {
            DefaultTableModel modelo = (DefaultTableModel) tablaSolicitud.getModel();
            modelo.addRow(new Object[]{idPedido, idArticulo, cantidad, idUsuario});
            JOptionPane.showMessageDialog(null, "✅ Artículo agregado a la tabla solicitud.");
        } else {
            JOptionPane.showMessageDialog(null, "❌ Error: La tabla solicitud no está disponible.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

   public void GenerarPedido(JTable tabla) {
    try (Connection conn = conexion.conectar()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "❌ No se pudo establecer conexión con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int filas = modelo.getRowCount();

        for (int i = 0; i < filas; i++) {
            Object objIdPedido = modelo.getValueAt(i, 0);
            Object objCantidad = modelo.getValueAt(i, 1);

            if (objIdPedido == null || objCantidad == null) {
                continue; // Saltar filas con datos vacíos
            }

            try {
                int idPedido = Integer.parseInt(objIdPedido.toString());
                int cantidadSolicitada = Integer.parseInt(objCantidad.toString());

                // Verificar si el pedido existe y está pendiente (IdEstado = 3)
                String sqlBuscar = "SELECT IdArticulo FROM Pedidos WHERE Id = ? AND IdEstado = 3";
                try (PreparedStatement psBuscar = conn.prepareStatement(sqlBuscar)) {
                    psBuscar.setInt(1, idPedido);
                    try (ResultSet rs = psBuscar.executeQuery()) {
                        if (rs.next()) {
                            int idArticulo = rs.getInt("IdArticulo");

                            // Actualizar estado a Finalizado (IdEstado = 4)
                            String sqlActualizarEstado = "UPDATE Pedidos SET IdEstado = 4 WHERE Id = ?";
                            try (PreparedStatement psEstado = conn.prepareStatement(sqlActualizarEstado)) {
                                psEstado.setInt(1, idPedido);
                                int filasActualizadas = psEstado.executeUpdate();
                                
                                if (filasActualizadas > 0) {
                                    JOptionPane.showMessageDialog(null, "✅ Pedido #" + idPedido + " procesado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, 
                                "⚠️ El pedido #" + idPedido + " no está disponible para procesar:\n" +
                                "- Puede que no exista\n" + 
                                "- O no esté en estado 'Pendiente'", 
                                "Advertencia", 
                                JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "❌ Error en formato numérico (fila " + (i+1) + ")", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "❌ Error de base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "❌ Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


                public void mostrarInventario(JTable tablaInventario) {
                    try (Connection conn = conexion.conectar()) {
                        if (conn == null) {
                            JOptionPane.showMessageDialog(null, "❌ No se pudo establecer conexión con la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }

                        String sql = "SELECT Id, NombreProducto, cantidad FROM Articulos"; // Cambia 'Inventario' al nombre de tu tabla
                        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                            DefaultTableModel modelo = (DefaultTableModel) tablaInventario.getModel();
                            modelo.setRowCount(0); // Limpia la tabla antes de actualizar

                            while (rs.next()) {
                                int idArticulo = rs.getInt("Id");
                                String nombre = rs.getString("NombreProducto");
                                int cantidad = rs.getInt("Cantidad");
                             

                                modelo.addRow(new Object[]{idArticulo, nombre, cantidad});
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "❌ Error al cargar el inventario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                public void iniciarActualizacionAutomatica(JTable tablaInventario, int intervaloSegundos) {
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            mostrarInventario(tablaInventario);
                        }
                    }, 0, intervaloSegundos * 1000); // Se actualiza cada X segundos
                }

    public void mostrarPedidos(JTable jTable1) {
        try (Connection conn = conexion.conectar()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(null, "❌ No se pudo conectar a la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql = "SELECT Id, Fecha, IdUsuario, IdEstado FROM Pedidos"; // Ajustado con los nombres exactos de tu tabla
            try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0); // Limpia la tabla antes de actualizar

                while (rs.next()) {
                    int idPedido = rs.getInt("Id");
                    String fecha = rs.getString("Fecha");
                    int idUsuario = rs.getInt("IdUsuario");
                    int idEstado = rs.getInt("IdEstado");

                    modelo.addRow(new Object[]{idPedido, fecha, idUsuario, idEstado});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al cargar pedidos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}








   