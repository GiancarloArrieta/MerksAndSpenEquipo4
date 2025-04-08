import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CRUDArticulos {
    private Connection conexion;
    
    public CRUDArticulos(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean crearArticulo(String nombre, String categoria){
        String sqlInsert = "insert into articulos(nombre, categoria) value (?,?);";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1, nombre);
            ps.setString(2, categoria);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar insertar: " + exception.getMessage());
            return false;
        }
    }
    
    public ResultSet obtenerArticuloNombre(String nombre){
        String selectSQL = "select * from articulos where nombre = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ps.setString(1, nombre);
            return ps.executeQuery();
        }
        catch(SQLException exception){
            System.out.println("Error al intentar consultar: " + exception.getMessage());
            return null;
        }
    }
    
    public ResultSet obtenerArticulos(){
        String selectSQL = "select * from articulos";
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            return ps.executeQuery();
        }
        catch(SQLException exception){
            System.out.println("Error al intentar consultar: " + exception.getMessage());
            return null;
        }
    }
    
    public boolean actualizarArticulo(String id, String nombre, int cantidad, String categoria){
        String sqlUpdate = "update articulos set nombre = ?, cantidad = ?, categoria = ? where id = ?;";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlUpdate);
            ps.setString(1, nombre);
            ps.setInt(2, cantidad);
            ps.setString(3, categoria);
            ps.setString(4, id);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar insertar: " + exception.getMessage());
            return false;
        }
    }
    
    public boolean eliminarArticulo(String nombre){
        String sqlDelete = "delete from articulos where nombre = ?;";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlDelete);
            ps.setString(1, nombre);
            return ps.executeUpdate()>0;
        }catch(SQLException exception){
            System.out.println("Error al intentar eliminar: " + exception.getMessage());
            return false;
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elin
 */

