import java.sql.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartPanel;

public class Grafica {

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
                	SUM(ArticulosPedidos.cantidad) > 100
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
}