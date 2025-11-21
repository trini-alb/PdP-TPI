package Vista;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import Controlador.Controlador;
// Imports necesarios para manejar fechas y formato
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainGUI {

    private Controlador controlador;
    private JFrame frame;
    // CORRECCIÓN: Renombrados para mayor claridad
    private JButton btnOcupar, btnLiberar; 
    private JTextField txtUsuario;
    private JComboBox<String> comboPlazas;
    private JLabel lblIngreso;
    private JLabel lblEgreso;
    private JLabel lblTarifa;

    // Formateador para mostrar la fecha/hora de forma amigable
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public MainGUI() {
        controlador = new Controlador();

        frame = new JFrame("Estacionamiento");
        // CORRECCIÓN: Eliminada la línea duplicada setSize(420, 220)
        frame.setSize(420, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); 

        JLabel lblTitulo = new JLabel("Estacionamiento UTN✯");
        lblTitulo.setBounds(120, 10, 200, 30);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        frame.add(lblTitulo);

        JLabel lblUsuario = new JLabel("Ingresar Usuario:");
        lblUsuario.setBounds(20, 50, 120, 25);
        frame.add(lblUsuario);
        
        // CORRECCIÓN DE SCOPE: 
        // No se pone "JTextField" al inicio. Se asigna al miembro de la clase.
        txtUsuario = new JTextField(); 
        txtUsuario.setBounds(150, 50, 230, 25);
        frame.add(txtUsuario);

        JLabel lblPlaza = new JLabel("Seleccionar plaza:");
        lblPlaza.setBounds(20, 85, 120, 25);
        frame.add(lblPlaza);

        // NOTA: Esto funciona porque tu controlador también crea 3 plazas.
        String[] plazas = {"Plaza 1", "Plaza 2", "Plaza 3"};
        
        // CORRECCIÓN DE SCOPE: 
        comboPlazas = new JComboBox<>(plazas);
        comboPlazas.setBounds(150, 85, 230, 25);
        frame.add(comboPlazas);
        
        // CORRECCIÓN DE ERROR: 
        // Las variables 'fechaHoraEntrada' no existen. Se inicia el texto por defecto.
        lblIngreso = new JLabel("Fecha - Hora de ingreso: (esperando)");
        lblIngreso.setBounds(20, 120, 360, 25);
        frame.add(lblIngreso);

        // CORRECCIÓN DE ERROR: 
        lblEgreso = new JLabel("Fecha - Hora de egreso: (esperando)");
        lblEgreso.setBounds(20, 145, 360, 25);
        frame.add(lblEgreso);

        // CORRECCIÓN DE SCOPE: 
        lblTarifa = new JLabel("Tarifa a cobrar: $0.00");
        lblTarifa.setBounds(20, 170, 360, 25);
        frame.add(lblTarifa);

        // CORRECCIÓN: Botón "Guardar" ahora es "Ocupar"
        btnOcupar = new JButton("Ocupar Plaza");
        btnOcupar.setBounds(60, 200, 120, 30);
        btnOcupar.setBackground(Color.GREEN);
        frame.add(btnOcupar);
        
        // CORRECCIÓN: Botón "Cancelar" ahora es "Liberar"
        btnLiberar = new JButton("Liberar Plaza");
        btnLiberar.setBounds(220, 200, 120, 30);
        btnLiberar.setBackground(Color.RED);
        frame.add(btnLiberar);

        // --- LÓGICA MVC AÑADIDA ---
        // Se añaden los ActionListeners para que los botones hagan algo.
        
        // Listener para el botón OCUPAR
        btnOcupar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. La Vista (GUI) recoge los datos
                String usuario = txtUsuario.getText();
                int plazaNum = comboPlazas.getSelectedIndex() + 1; // +1 porque el índice es 0, 1, 2

                // Validación simple en la Vista
                if (usuario.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Debe ingresar un nombre de usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // 2. La Vista llama al Controlador
                LocalDateTime horaEntrada = controlador.ocuparPlaza(plazaNum, usuario);

                // 3. La Vista reacciona a la respuesta del Controlador
                if (horaEntrada != null) {
                    // Éxito: Actualizar labels y mostrar mensaje
                    lblIngreso.setText("Fecha - Hora de ingreso: " + horaEntrada.format(formatter));
                    lblEgreso.setText("Fecha - Hora de egreso: (ocupado)");
                    lblTarifa.setText("Tarifa a cobrar: $0.00");
                    JOptionPane.showMessageDialog(frame, "Plaza " + plazaNum + " ocupada por " + usuario + ".");
                } else {
                    // Fracaso: (Controlador devolvió null)
                    JOptionPane.showMessageDialog(frame, "Error: La plaza no existe o ya está ocupada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Listener para el botón LIBERAR
        btnLiberar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. La Vista recoge los datos
                int plazaNum = comboPlazas.getSelectedIndex() + 1;

                // 2. La Vista llama al Controlador
                Object[] resultado = controlador.liberarPlaza(plazaNum);

                // 3. La Vista reacciona a la respuesta del Controlador
                if (resultado != null) {
                    // Éxito: Desempaquetar datos y actualizar labels
                    LocalDateTime horaSalida = (LocalDateTime) resultado[0];
                    double costo = (double) resultado[1];

                    lblEgreso.setText("Fecha - Hora de egreso: " + horaSalida.format(formatter));
                    lblTarifa.setText("Tarifa a cobrar: $" + String.format("%.2f", costo));
                    JOptionPane.showMessageDialog(frame, "Plaza " + plazaNum + " liberada. Costo: $" + String.format("%.2f", costo));
                    
                    // Limpiamos el ingreso para el próximo ciclo
                    lblIngreso.setText("Fecha - Hora de ingreso: (esperando)");
                    txtUsuario.setText("");
                } else {
                    // Fracaso: (Controlador devolvió null)
                    JOptionPane.showMessageDialog(frame, "Error: La plaza no existe o ya está libre.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainGUI(); 
            }
        });
    }
}