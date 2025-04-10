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
   
   public boolean generarPedido(int id){
        String sqlInsert = "insert into pedidos(idUsuario, fecha) values (?, curdate());";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar insertar: " + exception.getMessage());
            return false;
        }
    }
   
   public boolean insertarArticulos(int idPedido, int idArticulo, int cantidad){
       String sqlInsert = " insert into ArticulosPedidos(idPedido, idArticulo, cantidad) values (?, ?, ?);";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setInt(1, idPedido);
            ps.setInt(2, idArticulo);
            ps.setInt(3, cantidad);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar insertar: " + exception.getMessage());
            return false;
        }
   }
   
   public ResultSet consultaPedidos(){
        String selectSQL = "select pedidos.id, usuarios.nombre from pedidos INNER JOIN Usuarios ON Pedidos.IdUsuario = Usuarios.Id;";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            return ps.executeQuery();
        }
        catch(SQLException exception){
            System.out.println("Error al intentar consultar: " + exception.getMessage());
            return null;
        }
    }
   
   public ResultSet consultaDepartamentos(){
       String selectSQL = "select id, nombre from usuarios;";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            return ps.executeQuery();
        }
        catch(SQLException exception){
            System.out.println("Error al intentar consultar: " + exception.getMessage());
            return null;
        }
   }


                public void mostrarInventario(JTable tablaInventario) {
                    try{
                        String sql = "SELECT id, nombre, categoria FROM Articulos"; // Cambia 'Inventario' al nombre de tu tabla
                        try (PreparedStatement ps = conexion.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                            DefaultTableModel modelo = (DefaultTableModel) tablaInventario.getModel();
                            modelo.setRowCount(0); // Limpia la tabla antes de actualizar

                            while (rs.next()) {
                                int idArticulo = rs.getInt("Id");
                                String nombre = rs.getString("Nombre");
                                String categoria = rs.getString("Categoria");
                             

                                modelo.addRow(new Object[]{idArticulo, nombre, categoria});
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








   