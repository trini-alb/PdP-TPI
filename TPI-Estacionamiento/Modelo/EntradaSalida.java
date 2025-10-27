package Modelo;
import java.time.LocalDateTime;
import java.time.Duration;
public class EntradaSalida {
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;
    private Duration duracion;
    private Tarifa tarifa;

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

    public double calcularCosto() {
        return tarifa.calcularTotal(); //Revisar
    }

    public void registrarEntrada() {
        fechaHoraEntrada = LocalDateTime.now();
        System.out.println("Entrada registrada en " + fechaHoraEntrada);
    }

    public void registrarSalida() {
        fechaHoraSalida = LocalDateTime.now();
        if (fechaHoraEntrada != null && fechaHoraSalida != null) {
            duracion = Duration.between(fechaHoraEntrada, fechaHoraSalida);
        }
        System.out.println("Salida registrada en " + fechaHoraSalida + ", Duracion: " + (duracion != null ? duracion.toHours() : 0) + " horas");
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

    // Si necesitas asociar una plaza, descomenta la variable plaza y este método
    // public Plaza conocerPlaza() {
    //     return plaza;
    // }
