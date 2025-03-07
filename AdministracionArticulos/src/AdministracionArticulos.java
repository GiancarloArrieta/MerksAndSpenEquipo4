import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdministracionArticulos extends JFrame {
    // Lista para almacenar artículos
    private List<String> articulos = new ArrayList<>();

    private Map<String, Integer> inventario = new HashMap<>();


    private JTextField txtNombreArticulo, txtCantidad;
    private JTextArea areaResultado;
    private JButton btnAgregar, btnEliminar, btnModificar, btnActualizarInventario;

    public AdministracionArticulos() {

        setTitle("Administración de Artículos e Inventario");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(255, 0, 0));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel lblTitulo = new JLabel("Administración de Artículos e Inventario");
        lblTitulo.setFont(new Font(" ", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(50, 50, 50));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(lblTitulo, gbc);


        JLabel lblNombreArticulo = new JLabel("Nombre del Artículo:");
        lblNombreArticulo.setFont(new Font(" ", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblNombreArticulo, gbc);

        txtNombreArticulo = new JTextField(20);
        txtNombreArticulo.setFont(new Font(" ", Font.PLAIN, 14));
        txtNombreArticulo.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtNombreArticulo, gbc);


        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setFont(new Font(" ", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblCantidad, gbc);

        txtCantidad = new JTextField(20);
        txtCantidad.setFont(new Font(" ", Font.PLAIN, 14));
        txtCantidad.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtCantidad, gbc);


        btnAgregar = new JButton("Agregar Artículo");
        btnAgregar.setFont(new Font(" ", Font.BOLD, 14));
        btnAgregar.setBackground(new Color(255, 255, 255));
        btnAgregar.setForeground(Color.BLACK);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnAgregar, gbc);


        btnEliminar = new JButton("Eliminar Artículo");
        btnEliminar.setFont(new Font(" ", Font.BOLD, 14));
        btnEliminar.setBackground(new Color(255, 255, 255));
        btnEliminar.setForeground(Color.BLACK);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnEliminar, gbc);


        btnModificar = new JButton("Modificar Artículo");
        btnModificar.setFont(new Font(" ", Font.BOLD, 14));
        btnModificar.setBackground(new Color(255, 255, 255));
        btnModificar.setForeground(Color.BLACK);
        btnModificar.setFocusPainted(false);
        btnModificar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnModificar, gbc);


        btnActualizarInventario = new JButton("Actualizar Inventario");
        btnActualizarInventario.setFont(new Font(" ", Font.BOLD, 14));
        btnActualizarInventario.setBackground(new Color(255, 255, 255));
        btnActualizarInventario.setForeground(Color.BLACK);
        btnActualizarInventario.setFocusPainted(false);
        btnActualizarInventario.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnActualizarInventario, gbc);


        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        areaResultado.setFont(new Font(" ", Font.PLAIN, 14));
        areaResultado.setBackground(Color.WHITE);
        areaResultado.setForeground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(areaResultado);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel.add(scrollPane, gbc);


        add(panel);


        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarArticulo();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarArticulo();
            }
        });

        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarArticulo();
            }
        });

        btnActualizarInventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarInventario();
            }
        });
    }


    private void agregarArticulo() {
        String nombre = txtNombreArticulo.getText().trim();
        String cantidadStr = txtCantidad.getText().trim();

        if (nombre.isEmpty() || cantidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int cantidad = Integer.parseInt(cantidadStr);
        articulos.add(nombre);
        inventario.put(nombre, cantidad);

        areaResultado.setText("Artículo agregado: " + nombre + " - Cantidad: " + cantidad + "\n" + areaResultado.getText());
        limpiarCampos();
    }


    private void eliminarArticulo() {
        String nombre = txtNombreArticulo.getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del artículo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (articulos.contains(nombre)) {
            articulos.remove(nombre);
            inventario.remove(nombre);
            areaResultado.setText("Artículo eliminado: " + nombre + "\n" + areaResultado.getText());
        } else {
            JOptionPane.showMessageDialog(this, "El artículo no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        limpiarCampos();
    }


    private void modificarArticulo() {
        String nombre = txtNombreArticulo.getText().trim();
        String cantidadStr = txtCantidad.getText().trim();

        if (nombre.isEmpty() || cantidadStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (articulos.contains(nombre)) {
            int cantidad = Integer.parseInt(cantidadStr);
            inventario.put(nombre, cantidad);
            areaResultado.setText("Artículo modificado: " + nombre + " - Nueva cantidad: " + cantidad + "\n" + areaResultado.getText());
        } else {
            JOptionPane.showMessageDialog(this, "El artículo no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        limpiarCampos();
    }


    private void actualizarInventario() {
        areaResultado.setText("Inventario actual:\n");
        for (String articulo : articulos) {
            areaResultado.append(articulo + " - Cantidad: " + inventario.get(articulo) + "\n");
        }
    }


    private void limpiarCampos() {
        txtNombreArticulo.setText("");
        txtCantidad.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdministracionArticulos().setVisible(true);
            }
        });
    }
}