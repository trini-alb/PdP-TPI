package Vista;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import Controlador.Controlador;
public class MainGUI {

    private Controlador controlador;
    private JFrame frame;
    private JButton btnCancelar, btnCalcular, btnGuardar;
    private JLabel lblPlazas;
    private JTextField txtUsuario;
    private JComboBox<String> comboPlazas;
    private JLabel lblIngreso;
    private JLabel lblEgreso;
    private JLabel lblTarifa;

    public MainGUI() {
        controlador = new Controlador();

        frame = new JFrame("Estacionamiento");
        frame.setSize(420, 220);
        // Se define el tamaño una sola vez
        frame.setSize(420, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // Centra la ventana

        JLabel lblTitulo = new JLabel("Estacionamiento UTN✯");
        lblTitulo.setBounds(120, 10, 200, 30);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        frame.add(lblTitulo);

        JLabel lblUsuario = new JLabel("Ingresar Usuario:");
        lblUsuario.setBounds(20, 50, 120, 25);
        frame.add(lblUsuario);
        JTextField txtUsuario = new JTextField();
        txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 50, 230, 25);
        frame.add(txtUsuario);

        JLabel lblPlaza = new JLabel("Seleccionar plaza:");
        lblPlaza.setBounds(20, 85, 120, 25);
        frame.add(lblPlaza);

        String[] plazas = {"Plaza 1", "Plaza 2", "Plaza 3"};
        JComboBox<String> comboPlazas = new JComboBox<>(plazas);
        comboPlazas = new JComboBox<>(plazas);
        comboPlazas.setBounds(150, 85, 230, 25);
        frame.add(comboPlazas);
        JLabel lblIngreso = new JLabel("Fecha - Hora de ingreso: " + fechaHoraEntrada);

        // Estas fechas deberían ser actualizadas por el controlador.
        // Por ahora, las inicializamos con texto de ejemplo.
        lblIngreso = new JLabel("Fecha - Hora de ingreso: (esperando)");
        lblIngreso.setBounds(20, 120, 360, 25);
        frame.add(lblIngreso);
        JLabel lblEgreso = new JLabel("Fecha - Hora de egreso: " + fechaHoraSalida);

        lblEgreso = new JLabel("Fecha - Hora de egreso: (esperando)");
        lblEgreso.setBounds(20, 145, 360, 25);
        frame.add(lblEgreso);
        JLabel lblTarifa = new JLabel("Tarifa a cobrar: $000000.00");

        lblTarifa = new JLabel("Tarifa a cobrar: $0.00");
        lblTarifa.setBounds(20, 170, 360, 25);
        frame.add(lblTarifa);
        JButton btnGuardar = new JButton("Guardar");

        // Usamos las variables de la clase, no creamos nuevas
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(60, 200, 120, 30);
        btnGuardar.setBackground(Color.GREEN);
        frame.add(btnGuardar);
        JButton btnCancelar = new JButton("Cancelar");

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(220, 200, 120, 30);
        btnCancelar.setBackground(Color.RED);
        frame.add(btnCancelar);

        frame.setVisible(true); // Hacemos visible la ventana al final
    }
}
