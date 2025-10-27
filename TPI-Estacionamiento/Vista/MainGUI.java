package Vista;

import javax.swing.*;
import java.awt.event.*;
import Controlador.Controlador;

public class MainGUI {

    private Controlador controlador;
    private JFrame frame;
    private JButton btnEntrada, btnSalida, btnMostrar;
    private JLabel lblPlazas;

    public MainGUI() {
        controlador = new Controlador();

        frame = new JFrame("Estacionamiento");
        frame.setSize(420, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        btnEntrada = new JButton("Registrar Entrada");
        btnEntrada.setBounds(20, 20, 170, 30);
        btnEntrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.registrarEntrada();
                actualizarPlazas();
            }
        });

        btnSalida = new JButton("Registrar Salida");
        btnSalida.setBounds(210, 20, 170, 30);
        btnSalida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.registrarSalida();
                actualizarPlazas();
            }
        });

        btnMostrar = new JButton("Mostrar Plazas");
        btnMostrar.setBounds(20, 70, 360, 30);
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarPlazas();
                actualizarPlazas();
            }
        });

        lblPlazas = new JLabel("Plazas disponibles: " + controlador.getPlazasDisponibles());
        lblPlazas.setBounds(20, 120, 360, 30);

        frame.add(btnEntrada);
        frame.add(btnSalida);
        frame.add(btnMostrar);
        frame.add(lblPlazas);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void actualizarPlazas() {
        lblPlazas.setText("Plazas disponibles: " + controlador.getPlazasDisponibles());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainGUI();
            }
        });
    }
}