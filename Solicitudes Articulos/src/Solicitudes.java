import javax.swing.*;
import java.awt.*;
public class Solicitudes {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SolicitidudArticulos());
    }
}
class SolicitidudArticulos extends JFrame {
    public SolicitidudArticulos() {
        setTitle("    Solicitudes de Artículos");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setBackground(Color.RED);
        panelSuperior.setPreferredSize(new Dimension(900, 80));

        JLabel Logo = new JLabel("   MERKS AND SPEN");
        Logo.setForeground(Color.WHITE);
        Logo.setFont(new Font("Tahoma", Font.BOLD, 16));
        panelSuperior.add(Logo, BorderLayout.WEST);

        JLabel admin = new JLabel("ADMIN  ", SwingConstants.RIGHT);
        admin.setForeground(Color.WHITE);
        admin.setFont(new Font("Tahoma", Font.BOLD, 14));
        panelSuperior.add(admin, BorderLayout.EAST);

        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelLateral = new JPanel();
        panelLateral.setBackground(new Color(240, 240, 240));
        panelLateral.setPreferredSize(new Dimension(200, 500));
        panelLateral.setLayout(new BoxLayout(panelLateral, BoxLayout.Y_AXIS));

        JLabel MENU = new JLabel("Solicitudes de articulos");
        MENU.setFont(new Font("Tahoma", Font.BOLD, 14));
        MENU.setOpaque(true);
        MENU.setBackground(Color.white);
        MENU.setForeground(Color.black);
        MENU.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton Generar = new JButton("Generar pedidos");
        Generar.setBackground(Color.white);
        Generar.setForeground(Color.BLACK);
        JButton Gestion = new JButton("Gestion de pedidos");
        Gestion.setBackground(Color.WHITE);
        Gestion.setForeground(Color.BLACK);
        JButton Estado = new JButton("Estado del pedido");
        Estado.setBackground(Color.WHITE);
        Estado.setForeground(Color.BLACK);
        JButton Lista = new JButton("Lista de solicitudes");
        Lista.setBackground(Color.WHITE);
        Lista.setForeground(Color.BLACK);

        panelLateral.add(MENU);
        panelLateral.add(Box.createVerticalStrut(10));
        panelLateral.add(Generar);
        panelLateral.add(Gestion);
        panelLateral.add(Estado);
        panelLateral.add(Lista);

        add(panelLateral, BorderLayout.WEST);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(220, 220, 220));
        panelPrincipal.setLayout(new BorderLayout());

        JLabel Titulo = new JLabel("Generar pedidos", SwingConstants.CENTER);
        Titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        panelPrincipal.add(Titulo, BorderLayout.NORTH);

        JPanel panelX = new JPanel();
        panelX.setLayout(new BoxLayout(panelX, BoxLayout.Y_AXIS));

        JTextField ID = new JTextField("Autogenerado",10);
        ID.setEditable(false);
        JTextField idArticulo = new JTextField("Valor",10);
        JTextField idUsuario = new JTextField("Valor",10);

        JButton Ad = new JButton("Agregar");
        Ad.setBackground(Color.BLACK);
        Ad.setForeground(Color.WHITE);
        JButton Guardar = new JButton("Guardar");
        Guardar.setBackground(Color.RED);
        Guardar.setForeground(Color.WHITE);

        panelX.add(new JLabel("ID del pedido"));
        panelX.add(ID);
        panelX.add(new JLabel("ID del articulo"));
        panelX.add(idArticulo);
        panelX.add(new JLabel("ID de usuario"));
        panelX.add(idUsuario);
        panelX.add(Ad);

        panelPrincipal.add(panelX, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(Guardar);
        panelPrincipal.add(bottomPanel, BorderLayout.SOUTH);

        add(panelPrincipal, BorderLayout.CENTER);

        setVisible(true);
    }
}
