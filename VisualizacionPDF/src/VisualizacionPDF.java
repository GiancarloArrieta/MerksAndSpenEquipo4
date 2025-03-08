import javax.swing.*;
import java.awt.*;
import javax.swing.SwingUtilities;

public class VisualizacionPDF extends JFrame {
    public VisualizacionPDF() {
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
        panelLateral.setLayout(new GridLayout(8, 1, 10, 10));
        panelLateral.setBackground(Color.LIGHT_GRAY);
        panelLateral.setPreferredSize(new Dimension(170, getHeight()));

        panelLateral.add(new JLabel("  Visualización de archivos", SwingConstants.LEFT));

        JButton PDF = new JButton("Exportar PDF");
        panelLateral.add(PDF);
        add(panelLateral, BorderLayout.WEST);

        // Panel central con la tabla
        JPanel panelCentral = new JPanel(new BorderLayout());
        JLabel lblArticulos = new JLabel("  Artículos", SwingConstants.LEFT);
        lblArticulos.setFont(new Font("Arial", Font.BOLD, 14));
        panelCentral.add(lblArticulos, BorderLayout.NORTH);

        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VisualizacionPDF());
    }
}