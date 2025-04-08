import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CRUDDepartamentos {
    private Connection conexion;
    
    public CRUDDepartamentos(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean crearDepartamento(String nombre, String contrasena){
        String sqlInsert = "insert into usuarios(nombre, contrasena) value (?,?);";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1, nombre);
            ps.setString(2, contrasena);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar insertar: " + exception.getMessage());
            return false;
        }
    }
    
    public ResultSet obtenerDepartamentoID(int id){
        String selectSQL = "select * from usuarios where id = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException exception){
            System.out.println("Error al intentar consultar: " + exception.getMessage());
            return null;
        }
    }
    
    public ResultSet obtenerDepartamentos(){
        String selectSQL = "select * from usuarios";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            return ps.executeQuery();
        }
        catch(SQLException exception){
            System.out.println("Error al intentar consultar: " + exception.getMessage());
            return null;
        }
    }
    
    public boolean actualizarDepartamento(int id, String nombre, String contrasena){
        String sqlUpdate = "update usuarios set nombre = ?, contrasena = ? where id = ?;";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlUpdate);
            ps.setString(1, nombre);
            ps.setString(2, contrasena);
            ps.setInt(3, id);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar insertar: " + exception.getMessage());
            return false;
        }
    }
    
    public boolean eliminarDepartamento(int id){
        String sqlDelete = "delete from usuarios where id = ?;";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlDelete);
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar eliminar: " + exception.getMessage());
            return false;
        }
    }
}
