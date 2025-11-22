package Controlador;

import Modelo.*;
import Vista.VehiculoIGU;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class Controlador {

    private List<Plaza> plazas;
    private Tarifa tarifaVigente; 
    private int cantidadPlazas;

    public Controlador() {
        plazas = new ArrayList<>();
        tarifaVigente = new Tarifa(); 
        cantidadPlazas = 10;
        for (int i = 1; i <= cantidadPlazas; i++) {
            plazas.add(new Plaza(Estado.DISPONIBLE, i, null, null, null));
        }
    }

    public LocalDateTime ocuparPlaza(int numeroPlaza, String usuario) {
        Plaza plaza = buscarPlaza(numeroPlaza);
        if (plaza == null) return null;
        if (plaza.conocerEstado() == Estado.OCUPADA) return null;

        EntradaSalida es = new EntradaSalida(LocalDateTime.now(), null, tarifaVigente);
        plaza.ocupar(es);
        return es.getFechaHoraEntrada();
    }

    public Object[] liberarPlaza(int numeroPlaza) {
        Plaza plaza = buscarPlaza(numeroPlaza);
        if (plaza == null || plaza.conocerEstado() == Estado.DISPONIBLE) return null;

        EntradaSalida es = plaza.getEntradaSalida();
        plaza.liberar();

        LocalDateTime entrada = es.getFechaHoraEntrada();
        LocalDateTime salida = es.getFechaHoraSalida(); 
        double costo = tarifaVigente.calcularCosto(entrada, salida);

        return new Object[]{salida, costo};
    }

    public List<Plaza> obtenerPlazas() {
        return plazas;
    }

    private Plaza buscarPlaza(int numeroPlaza) {
        for (Plaza p : plazas) {
            if (p.getNumero() == numeroPlaza) return p;
        }
        return null;
    }
    
    // --- MÉTODOS PARA GESTIÓN DE CUENTAS DE USUARIO ---

    public String crearCuenta(String txtN , String txtA, String txtD, String txtTC, String txtTU){
        if(txtN.length()>0 && txtA.length()>0 && txtD.length()>0 && txtTC.length()>0 && txtTU.length()>0){
           // Nota: Aquí faltaría guardar el vehículo y la patente en algún lado si el modelo lo requiere
           TipoCuenta tipoDeCuenta = new TipoCuenta(txtTC);
           TipoUsuario tipoDeUsuario = new TipoUsuario(txtTU);
           CuentaUsuario crearCuenta = new CuentaUsuario(txtN,txtA,txtD,0.0,tipoDeUsuario,tipoDeCuenta,null);
           crearCuenta.registrarCuenta();
           return "¡¡Su cuenta ha sido creada con éxito!!";
       } else {
           return "Por favor, complete los campos correspondientes.";
       }
    }
    
    public CuentaUsuario verificarCuenta(String documento) {
        if (documento == null || documento.trim().isEmpty()) {
            return null;
        }
        try {
            // Llama al método estático del modelo que busca el objeto completo.
            // NOTA: Debes asegurarte de que CuentaUsuario tenga el método buscarCuenta.
            // Si no lo tiene, te daré el código para CuentaUsuario también.
            return CuentaUsuario.buscarCuenta(documento);
        } catch (IOException e) {
            return null;
        }
    }
    
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\Rodrigo\\Desktop\\TPI-Estacionamiento\\TPI-Estacionamiento\\src\\main\\java\\Recursos\\RegistroDeInvitado.txt";
    public String crearInvitacion(String documento){
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        if(documento.length() > 0){
            Invitacion cuentaInvitado = new Invitacion(documento, fecha, hora);
            // 1. Formatear la línea de datos para guardar. Usamos la coma (,) como separador.
            String lineaDatos = documento + "," +
                                fecha.toString() + "," +
                                hora.toString();


            // 2. Lógica de escritura del archivo
            try (PrintWriter writer = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO, true))) {

                // El 'true' en FileWriter(NOMBRE_ARCHIVO, true) indica modo de APENDIZADO (añadir al final)
                // Esto evita que se sobrescriban los datos existentes.

                writer.println(lineaDatos); //Escribimos
                return "Creado con Exito";

            } catch (IOException e) {
                return "❌ ERROR al guardar la cuenta en el archivo: ";
            }
            }else{
                return "Complete los campos";
            }
        
    }
    
    public String consultarSaldo(String documento){
        if(documento.isEmpty()){
            return "¡Ingrese Documento!";
        } else {
            try {
                Double saldoEncontrado = CuentaUsuario.consultarSaldo(documento);
                if (saldoEncontrado != null) {
                    return String.valueOf(saldoEncontrado);
                } else {
                    return "No encontrado";
                }
            } catch (IOException e) {
                return "Error I/O";
            }
        }
    }

      
    public String sumSaldo(String monto, String documento){
        // 1. Validación de campos vacíos
        if (documento.trim().isEmpty() || monto.trim().isEmpty()) {
            // Asumo que tienes un campo para mensajes de error, si no, usa System.out.println
            // Por ejemplo, usando tu campo de creación de cuenta
            return "⚠️ Debe ingresar el Documento y el Monto.";
        }

        double montoAAgregar;
        try {
            // 2. Validación de formato numérico
            montoAAgregar = Double.parseDouble(monto);

            if (montoAAgregar <= 0) {
                return "⚠️ El monto a sumar debe ser mayor a cero.";
               
            }

            // 3. Llamada al Modelo para actualizar el saldo
            boolean exito = CuentaUsuario.recargarSaldo(documento, montoAAgregar);

            // 4. Actualización de la Vista (Mensaje de resultado)
            if (exito) {
                return "✅ Saldo agregado con éxito al Documento: " + documento;
            } else {
                // El Modelo retornó 'false' (Cuenta no encontrada)
                return "❌ Error: No se encontró la cuenta con el Documento ingresado.";
            }

        } catch (NumberFormatException e) {
            // Error capturado si el texto en txtAgregarSaldo no es un Double válido
            return "❌ Error: Ingrese un monto numérico válido.";

        } catch (java.io.IOException e) {
            // Error capturado si falla la lectura/escritura del archivo
            return "❌ ERROR I/O: Fallo al guardar en el archivo. Revise la ruta y permisos.";
            
        }
    }
    
    
    // --- MÉTODOS PARA GESTIÓN DE VEHICULOS ---
    private static final String NOMBRE_ARCHIVOs = "C:\\Users\\Rodrigo\\Desktop\\TPI-Estacionamiento\\TPI-Estacionamiento\\src\\main\\java\\Recursos\\RegistroDeVehiculo.txt";
    public String registrarVehiculo(String documento, String patente, String marca, String modelo, String invitado, String DocInvitador){
        if(documento.length() > 0 && patente.length() > 0 && marca.length() > 0 && modelo.length() > 0 && invitado.length() > 0){
            
            // 1. Formatear la línea de datos para guardar. Usamos la coma (,) como separador.
            String lineaDatos = documento + "," +
                                patente + "," +
                                marca+ "," +
                                modelo+ "," +
                                invitado+ "," +
                                DocInvitador;


            // 2. Lógica de escritura del archivo
            try (PrintWriter writer = new PrintWriter(new FileWriter(NOMBRE_ARCHIVOs, true))) {

                // El 'true' en FileWriter(NOMBRE_ARCHIVO, true) indica modo de APENDIZADO (añadir al final)
                // Esto evita que se sobrescriban los datos existentes.

                writer.println(lineaDatos); //Escribimos
                return "Creado con Exito";

            } catch (IOException e) {
                return "❌ ERROR al guardar la cuenta en el archivo: ";
            }
            }else{
                return "Complete los campos";
            }
        
    }
    
    // Este método es llamado desde la vista (VehiculoIGU)
    public static void manejarCambioInvitado(VehiculoIGU vistaVehiculo) {
        String opcionSeleccionada = vistaVehiculo.getOpcionInvitado();

        // La lógica de negocio vive aquí
        if ("Si".equals(opcionSeleccionada)) {
            vistaVehiculo.mostrarCampoInvitador(true);  
        } else {
            vistaVehiculo.mostrarCampoInvitador(false);
        }
    }
}