import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class SolicitudArticulosUsuario extends JFrame {
    public SolicitudArticulosUsuario() {
        setTitle("Solicitudes de Artículos");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel superior con título
        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(Color.RED);
        panelSuperior.setLayout(new BorderLayout());
        panelSuperior.setPreferredSize(new Dimension(getWidth(), 100));
        JLabel lblTitulo = new JLabel("   MERKS AND SPEN", SwingConstants.LEFT);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(Color.WHITE);
        JLabel lblAdmin = new JLabel("Usuario   ", SwingConstants.RIGHT);
        lblAdmin.setFont(new Font("Arial", Font.BOLD, 14));
        lblAdmin.setForeground(Color.WHITE);
        panelSuperior.add(lblTitulo, BorderLayout.WEST);
        panelSuperior.add(lblAdmin, BorderLayout.EAST);
        add(panelSuperior, BorderLayout.NORTH);

        // Panel lateral con botones
        JPanel panelLateral = new JPanel();
        panelLateral.setLayout(new GridLayout(10, 1, 10, 10));
        panelLateral.setBackground(Color.LIGHT_GRAY);
        panelLateral.setPreferredSize(new Dimension(150, getHeight()));

        JButton btnBuscarArticulo = new JButton("Buscar artículo");

        panelLateral.add(new JLabel("  Solicitudes de artículos", SwingConstants.LEFT));
        panelLateral.add(btnBuscarArticulo);

        add(panelLateral, BorderLayout.WEST);

        // Panel central con la tabla
        JPanel panelCentral = new JPanel(new BorderLayout());
        JLabel lblArticulos = new JLabel("  Artículos", SwingConstants.LEFT);
        lblArticulos.setFont(new Font("Arial", Font.BOLD, 14));
        panelCentral.add(lblArticulos, BorderLayout.NORTH);

        // Crear la tabla
        String[] columnas = {"ID", "Nombre del Artículo", "Cantidad", "Estado"};
        Object[][] datos = {
                {1, "Producto 1", 10, "Disponible"},
                {2, "Producto 2", 15, "Disponible"},
                {3, "Producto 3", 5, "Agotado"},
                {4, "Producto 4", 3, "Agotado"}
        };

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);

        panelCentral.add(scrollPane, BorderLayout.CENTER);
        add(panelCentral, BorderLayout.CENTER);

        setVisible(true);
    }
}