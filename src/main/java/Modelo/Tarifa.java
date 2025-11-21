package Modelo;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public  class Tarifa {
    // Esta es la constante de precio que movimos del Controlador
    private static final double PRECIO_POR_DIA = 1000.0; 
    
    private TipoUsuario tipoUsuario;
    private double monto;
    private Date fechaDesde;
    private Date fechaHasta;

    public Tarifa() {
        this.tipoUsuario = null;
        this.monto = 0;
        this.fechaDesde = null;
        this.fechaHasta = null;
    }
    public double calcularTarifa(CuentaUsuario usuario, Plaza plaza) {
        EntradaSalida es = plaza.getEntradaSalida();
        LocalDateTime entrada = es.getFechaHoraEntrada();
        LocalDateTime salida = LocalDateTime.now();
        es.setFechaHoraSalida(salida);
        long minutos = ChronoUnit.MINUTES.between(entrada, salida);
        // Invitados no pagan
        if (usuario.getTipoUsuario() != null) {
            return 0;
        }
        // Menos de 5 minutos no pagan
        if (minutos < 5) {
            return 0;
        }
        // Acá usás la lógica de tu tipo de cuenta o tipo de usuario
        double total = this.monto * (minutos / 60.0);
        return total;
    }


    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public double calcularTotal() { //creemos que el diagrama de clases esta mal en esta parte
    double total = monto;
    if (tipoUsuario != null) {
        total = tipoUsuario.aplicarDescuento(total);
    }
    return total;
    }
    
    public TipoUsuario conocerTipoUsuario() {
        return tipoUsuario;
    }

    // --- MÉTODO NUEVO Y CORRECTO ---
    /**
     * Este es el único método que el Controlador usará para calcular
     * el costo del estacionamiento.
     */
    public double calcularCosto(LocalDateTime entrada, LocalDateTime salida) {
        
        // Validaciones iniciales
        if (entrada == null || salida == null) {
            return 0.0;
        }

        // Lógica de minutos (movida desde el controlador)
        long minutos = ChronoUnit.MINUTES.between(entrada, salida);

        // Regla de negocio: Menos de 5 min es gratis (movida desde el controlador)
        if (minutos < 5) {
            return 0.0;
        }

        // Lógica de cobro por día (movida desde el controlador)
        long dias = ChronoUnit.DAYS.between(entrada.toLocalDate(), salida.toLocalDate()) + 1;
        
        // Retorna el costo calculado
        return dias * PRECIO_POR_DIA;
    }
}
