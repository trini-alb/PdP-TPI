package Controlador;

import Modelo.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    
    // --- MÉTODOS PARA GESTIÓN DE CUENTAS ---

    public String crearCuenta(String txtN , String txtA, String txtD, String txtV, String txtP){
        if(txtN.length()>0 && txtA.length()>0 && txtD.length()>0 && txtV.length()>0 && txtP.length()>0){
           // Nota: Aquí faltaría guardar el vehículo y la patente en algún lado si el modelo lo requiere
           CuentaUsuario crearCuenta = new CuentaUsuario(txtN,txtA,txtD,0.0,null,null,null);
           crearCuenta.registrarCuenta();
           return "¡¡Su cuenta ha sido creada con éxito!!";
       } else {
           return "Por favor, complete los campos correspondientes.";
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

    /**
     * Método para verificar si una cuenta existe y obtener sus datos básicos.
     * Retorna un objeto CuentaUsuario si existe, o null si no.
     */
    public CuentaUsuario verificarCuenta(String documento) {
        if (documento == null || documento.trim().isEmpty()) {
            return null;
        }
        try {
            // Reutilizamos la lógica de consultarSaldo del modelo, pero necesitamos recuperar el nombre también.
            // Como el método consultarSaldo solo devuelve el saldo, vamos a usar el método buscarCuentaCompleta
            // que agregaremos en CuentaUsuario, o simulamos la búsqueda aquí.
            // Para mantenerlo simple y usar lo que tienes, crearemos un método en CuentaUsuario que devuelva el objeto.
            return CuentaUsuario.buscarCuenta(documento);
        } catch (IOException e) {
            System.err.println("Error al verificar cuenta: " + e.getMessage());
            return null;
        }
    }

    public String cargarSaldo(String documento, String montoStr) {
        if (documento.isEmpty() || montoStr.isEmpty()) {
            return "⚠️ Faltan datos.";
        }
        try {
            double monto = Double.parseDouble(montoStr);
            if (monto <= 0) return "⚠️ Monto inválido.";

            boolean exito = CuentaUsuario.recargarSaldo(documento, monto);
            return exito ? "✅ Saldo actualizado." : "❌ Cuenta no encontrada.";
        } catch (NumberFormatException e) {
            return "❌ Monto no numérico.";
        } catch (IOException e) {
            return "❌ Error de archivo.";
        }
    }
}