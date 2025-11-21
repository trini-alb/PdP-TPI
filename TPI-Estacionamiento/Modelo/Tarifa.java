package Modelo;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date; // Este import se puede borrar si ya no usas Date

public  class Tarifa {
    
    // Esta es la constante de precio que movimos del Controlador
    private static final double PRECIO_POR_DIA = 1000.0;

    // Atributos que tenías (los dejamos por si los usas a futuro)
    private TipoUsuario tipoUsuario;
    private double monto;
    private Date fechaDesde;
    private Date fechaHasta;

    // Constructor que tenías
    public Tarifa() {
        this.tipoUsuario = null;
        this.monto = 0;
        this.fechaDesde = null;
        this.fechaHasta = null;
    }

    // --- MÉTODOS ANTIGUOS ELIMINADOS ---
    // Se eliminó public double calcularTarifa(...) 
    // Se eliminó public double calcularTotal(...) 
    // (Eran los que causaban los 4 errores de compilación)

    // --- Getters que tenías ---
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