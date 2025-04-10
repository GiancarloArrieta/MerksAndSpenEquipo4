import java.sql.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartPanel;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class GraficaReporte {
    
    private Connection conexion;
    
    public GraficaReporte(){
        conexion = ConexionMySQL.conectar();
    }

    public ChartPanel obtenerGrafico() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        ConexionMySQL conexionMySQL = new ConexionMySQL();
        Connection conn = conexionMySQL.conectar();

        if (conn != null) {
            String query = """
                SELECT
                    Articulos.Nombre AS Nombre,
                    SUM(ArticulosPedidos.cantidad) AS Cantidad
                FROM 
                    ArticulosPedidos
                INNER JOIN 
                    Articulos ON ArticulosPedidos.idArticulo = Articulos.Id
                GROUP BY 
                    Articulos.Id, Articulos.Nombre
                HAVING
                	SUM(ArticulosPedidos.cantidad) >= 100
                ORDER BY 
                    Cantidad DESC;
            """;

            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
                while (rs.next()) {
                    String nombre = rs.getString("Nombre");
                    int cantidad = rs.getInt("Cantidad");
                    dataset.addValue(cantidad, "Pedidos", nombre);
                }
            } catch (SQLException ex) {
                System.out.println("Error al obtener datos: " + ex.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexión: " + ex.getMessage());
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart(
            "Artículos más solicitados",
            "Artículo",
            "Cantidad total solicitada",
            dataset,
            PlotOrientation.VERTICAL,
            false, true, false
        );

        return new ChartPanel(chart);
    }
    
    public void PDFInventario() { 
        Document documento = new Document();
        try{
        PdfWriter.getInstance(documento, new FileOutputStream("C:/Users/Elin/OneDrive/Datos adjuntos/Escritorio/ReporteInventario.pdf"));
        documento.open();
        PdfPTable tabla = new PdfPTable(4);
        tabla.addCell("ID");
        tabla.addCell("Nombre Articulo");
        tabla.addCell("Cantidad");
        tabla.addCell("Categoria");
        try{
            String sqlSelect = "select * from Articulos";
            PreparedStatement pst = conexion.prepareStatement(sqlSelect);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            do{
                tabla.addCell(rs.getString(1));
                tabla.addCell(rs.getString(2));
                tabla.addCell(rs.getString(3));
                tabla.addCell(rs.getString(4));
            }while(rs.next());
                documento.add(tabla);
            }
        } 
        catch(DocumentException | SQLException e){
        }
        documento.close();
        JOptionPane.showMessageDialog(null,"Reporte exportado a escritorio exitosamente.");
        }
        catch(DocumentException | HeadlessException | FileNotFoundException e){
        
        }
    }
    public void PDFPedidosDepartamento() { 
        Document documento = new Document();
        try{
        PdfWriter.getInstance(documento, new FileOutputStream("C:/Users/Elin/OneDrive/Datos adjuntos/Escritorio/ReportePedidosDepartamento.pdf"));
        documento.open();
        PdfPTable tabla = new PdfPTable(6);
        tabla.addCell("ID");
        tabla.addCell("Departamento");
        tabla.addCell("Fecha");
        tabla.addCell("Artículos Solicitados");
        tabla.addCell("Total de artículos");
        tabla.addCell("Estatus del pedido");
        try{
            String sqlSelect = "SELECT \n" +
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
                "    Pedidos.Id, Estado.Tipo, Usuarios.Nombre\n" +
                "ORDER BY\n" +
                "	Usuarios.Nombre;";
            PreparedStatement pst = conexion.prepareStatement(sqlSelect);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            do{
                tabla.addCell(rs.getString(1));
                tabla.addCell(rs.getString(2));
                tabla.addCell(rs.getString(3));
                tabla.addCell(rs.getString(4));
                tabla.addCell(rs.getString(5));
                tabla.addCell(rs.getString(6));
            }while(rs.next());
                documento.add(tabla);
            }
        } 
        catch(DocumentException | SQLException e){
        }
        documento.close();
        JOptionPane.showMessageDialog(null,"Reporte exportado a escritorio exitosamente.");
        }
        catch(DocumentException | HeadlessException | FileNotFoundException e){
        
        }
    }
        public void PDFPedidosFecha() { 
        Document documento = new Document();
        try{
        PdfWriter.getInstance(documento, new FileOutputStream("C:/Users/Elin/OneDrive/Datos adjuntos/Escritorio/ReportePedidosFecha.pdf"));
        documento.open();
        PdfPTable tabla = new PdfPTable(6);
        tabla.addCell("ID");
        tabla.addCell("Departamento");
        tabla.addCell("Fecha");
        tabla.addCell("Artículos Solicitados");
        tabla.addCell("Total de artículos");
        tabla.addCell("Estatus del pedido");
        try{
            String sqlSelect = "SELECT \n" +
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
                "    Pedidos.Id, Estado.Tipo, Usuarios.Nombre\n" +
                "ORDER BY\n" +
                "	Pedidos.Fecha;";
            PreparedStatement pst = conexion.prepareStatement(sqlSelect);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            do{
                tabla.addCell(rs.getString(1));
                tabla.addCell(rs.getString(2));
                tabla.addCell(rs.getString(3));
                tabla.addCell(rs.getString(4));
                tabla.addCell(rs.getString(5));
                tabla.addCell(rs.getString(6));
            }while(rs.next());
                documento.add(tabla);
            }
        } 
        catch(DocumentException | SQLException e){
        }
        documento.close();
        JOptionPane.showMessageDialog(null,"Reporte exportado a escritorio exitosamente.");
        }
        catch(DocumentException | HeadlessException | FileNotFoundException e){
        
        }
    }
}