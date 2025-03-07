import javax.swing.*;
import java.awt.*;

public class ModuloInventario {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InventoryFrame());
    }
}

class InventoryFrame extends JFrame {
    public InventoryFrame() {
        setTitle("Módulo de Inventario");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.RED);
        topPanel.setPreferredSize(new Dimension(900, 80));

        JLabel logoLabel = new JLabel("   MERKS AND SPEN");
        logoLabel.setForeground(Color.WHITE);
        logoLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        topPanel.add(logoLabel, BorderLayout.WEST);

        JLabel userLabel = new JLabel("Nombre_Usuario  ", SwingConstants.RIGHT);
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        topPanel.add(userLabel, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);

        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(new Color(255, 255, 255));
        sidePanel.setPreferredSize(new Dimension(200, 500));
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));

        JLabel menuTitle = new JLabel("Modulo de inventario");
        menuTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
        menuTitle.setOpaque(true);
        menuTitle.setBackground(Color.WHITE);
        menuTitle.setForeground(Color.BLACK);
        menuTitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton btnPDF = new JButton("Generación de PDF");
        JButton btnGraphs = new JButton("Activar graficos");
        JButton btnData = new JButton("Consulta de datos");

        sidePanel.add(menuTitle);
        sidePanel.add(Box.createVerticalStrut(10));
        sidePanel.add(btnPDF);
        sidePanel.add(btnGraphs);
        sidePanel.add(btnData);

        add(sidePanel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("🔍");
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        centerPanel.add(searchPanel, BorderLayout.NORTH);

        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(1, 4, 10, 10));

        for (int i = 0; i < 4; i++) {
            JPanel productCard = new JPanel();
            productCard.setLayout(new BoxLayout(productCard, BoxLayout.Y_AXIS));
            productCard.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            JLabel imageLabel = new JLabel("[Imagen_Prodcuto]");
            imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel nameLabel = new JLabel("Nombre_Producto");
            nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel qtyLabel = new JLabel("#Cantidad");
            qtyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            productCard.add(imageLabel);
            productCard.add(nameLabel);
            productCard.add(qtyLabel);

            productPanel.add(productCard);
        }

        centerPanel.add(productPanel,BorderLayout.CENTER);

        add(centerPanel,BorderLayout.CENTER);

        setVisible(true);
    }
}
