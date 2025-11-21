package Modelo;
import java.time.LocalDateTime;
import java.time.Duration;

public class EntradaSalida {
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;
    private Duration duracion;
    private Tarifa tarifa; // La tarifa que se aplicará

    public EntradaSalida(LocalDateTime fechaHoraEntrada, LocalDateTime fechaHoraSalida, Tarifa tarifa) {
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida = fechaHoraSalida;
        this.duracion = (fechaHoraEntrada != null && fechaHoraSalida != null) ? Duration.between(fechaHoraEntrada, fechaHoraSalida) : null;
        this.tarifa = tarifa;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * ¡MÉTODO CORREGIDO!
     * Ahora este método es el responsable de calcular el costo.
     * Utiliza la tarifa que se le inyectó y sus propias fechas.
     */
    public double calcularCosto() {
        if (tarifa == null) {
            // Si no tiene tarifa asignada, no puede cobrar.
            return 0.0;
        }
        
        // Delega el cálculo a la tarifa, usando sus propias fechas de entrada y salida
        return tarifa.calcularCosto(this.fechaHoraEntrada, this.fechaHoraSalida);
    }

    public void registrarEntrada() {
        fechaHoraEntrada = LocalDateTime.now();
        // (Los comentarios de notificación se eliminan porque la Vista no debe estar aquí)
    }

    /**
     * Este método es llamado por Plaza.java
     * Establece la hora de salida y calcula la duración final.
     */
    public void registrarSalida() {
        fechaHoraSalida = LocalDateTime.now();
        if (fechaHoraEntrada != null && fechaHoraSalida != null) {
            duracion = Duration.between(fechaHoraEntrada, fechaHoraSalida);
        }
    }

    public Duration calcularDuracion() {
        if (fechaHoraEntrada != null && fechaHoraSalida != null) {
            return Duration.between(fechaHoraEntrada, fechaHoraSalida);
        }
        return null;
    }

    public Tarifa concocerTarifa() {
        return tarifa;
    }
}