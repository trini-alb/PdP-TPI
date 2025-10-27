package Modelo;
// import java.util.Date; // innecesario
import java.time.LocalDateTime;
public class Plaza {
    private Estado estado;
    private int numero;
    private EntradaSalida entradaSalida;
    private LocalDateTime fechaHoraOcupacion;
    private LocalDateTime fechaHoraDesocupacion;

    public Plaza(Estado estado, int numero, EntradaSalida entradaSalida, LocalDateTime fechaHoraOcupacion, LocalDateTime fechaHoraDesocupacion) {
        this.estado = estado;
        this.numero = numero;
        this.entradaSalida = entradaSalida;
        this.fechaHoraOcupacion = fechaHoraOcupacion;
        this.fechaHoraDesocupacion = fechaHoraDesocupacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    public EntradaSalida getEntradaSalida() {
        return entradaSalida;
    }

    public LocalDateTime getFechaHoraOcupacion() {
        return fechaHoraOcupacion;
    }

    public LocalDateTime getFechaHoraDesocupacion() {
        return fechaHoraDesocupacion;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean liberar() {
        if (estado == Estado.OCUPADA) {
            this.estado = Estado.DISPONIBLE;
            this.fechaHoraDesocupacion = LocalDateTime.now();
            if (entradaSalida != null) entradaSalida.registrarSalida();
            System.out.println("Plaza " + numero + " liberada en " + fechaHoraDesocupacion);
            return true;
        } else {
            System.out.println("Plaza " + numero + " no está ocupada"); 
            return false;
        }
    }

    public boolean ocupar(EntradaSalida entradaSalida) {
        if (estado == Estado.DISPONIBLE) {
            this.entradaSalida = entradaSalida;
            this.estado = Estado.OCUPADA;
            this.fechaHoraOcupacion = LocalDateTime.now();
            System.out.println("Plaza " + numero + " ocupada en " + fechaHoraOcupacion);
            return true;
        } else {
            System.out.println("Plaza " + numero + " no está disponible"); 
            return false;
        }
    }

    public void consultarEstado() {
        System.out.println("Plaza " + numero + " estado: " + estado);
    }

    public void actualizarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Plaza " + numero + " actualizado a estado: " + estado);
    }

    public Estado conocerEstado() {
        return estado;
    }
}
