/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elin
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InicioSesion {
    
    private Connection conexion;
    
    public InicioSesion(){
        conexion = ConexionMySQL.conectar();
    }
    
    public ResultSet inicioSesion(String usuario){
        String sqlConsulta = "select contrasena from usuarios where nombre = ?;";
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlConsulta);
            ps.setString(1, usuario);
            return ps.executeQuery();
        }catch(SQLException e){
            System.out.println("Error al intentar consultar información:\n" + e.getMessage());
            return null;
        }
    }
}
