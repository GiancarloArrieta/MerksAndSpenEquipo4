import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;



public class CRUDpedidos {
    
    private Connection conexion;

    public CRUDpedidos(){
        conexion = ConexionMySQL.conectar();
    }
    
   public void GenerarPedido(JTable tabla) {
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
                try (PreparedStatement psBuscar = conexion.prepareStatement(sqlBuscar)) {
                    psBuscar.setInt(1, idPedido);
                    try (ResultSet rs = psBuscar.executeQuery()) {
                        if (rs.next()) {
                            int idArticulo = rs.getInt("IdArticulo");

                            // Actualizar estado a Finalizado (IdEstado = 4)
                            String sqlActualizarEstado = "UPDATE Pedidos SET IdEstado = 4 WHERE Id = ?";
                            try (PreparedStatement psEstado = conexion.prepareStatement(sqlActualizarEstado)) {
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
}


                public void mostrarInventario(JTable tablaInventario) {
                    try{
                        String sql = "SELECT Id, NombreProducto, cantidad FROM Articulos"; // Cambia 'Inventario' al nombre de tu tabla
                        try (PreparedStatement ps = conexion.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
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
        try{
            String sql = "SELECT \n" +
                "    Pedidos.Id AS ID,\n" +
                "    Usuarios.Nombre AS Departamento,\n" +
                "    Pedidos.Fecha AS Fecha,\n" +
                "    GROUP_CONCAT(CONCAT(Articulos.Nombre, ' (', ArticulosPedidos.cantidad, ' unidades)') SEPARATOR ', ') AS ArticulosSolicitados,\n" +
                "    SUM(ArticulosPedidos.cantidad) AS TotalDeArticulos,\n" +
                "    Estado.Tipo AS EstatusPedido\n" +
                "FROM \n" +
                "    Pedidos\n" +
                "INNER JOIN \n" +
                "    Estado ON Pedidos.IdEstado = Estado.Id\n" +
                "INNER JOIN \n" +
                "    Usuarios ON Pedidos.IdUsuario = Usuarios.Id\n" +
                "INNER JOIN \n" +
                "    ArticulosPedidos ON Pedidos.Id = ArticulosPedidos.idPedido\n" +
                "INNER JOIN \n" +
                "    Articulos ON ArticulosPedidos.idArticulo = Articulos.Id\n" +
                "GROUP BY \n" +
                "    Pedidos.Id, Estado.Tipo, Usuarios.Nombre;"; // Ajustado con los nombres exactos de tu tabla
            try (PreparedStatement ps = conexion.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0); // Limpia la tabla antes de actualizar

                while (rs.next()) {
                    int idPedido = rs.getInt("Id");
                    String departamento = rs.getString("Departamento");
                    String fecha = rs.getString("Fecha");
                    String articulos = rs.getString("ArticulosSolicitados");
                    int total = rs.getInt("TotalDeArticulos");
                    String idEstado = rs.getString("EstatusPedido");

                    modelo.addRow(new Object[]{idPedido, departamento, fecha, articulos, total, idEstado});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al cargar pedidos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean actualizarPedido(int id, int estatus){
        String sqlUpdate = "update pedidos set idEstado = ? where id = ?;";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlUpdate);
            ps.setInt(1, estatus);
            ps.setInt(2, id);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar actualizar: " + exception.getMessage());
            return false;
        }
    }
}








   