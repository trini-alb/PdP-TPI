package Modelo;
import java.time.LocalDate;
import java.time.LocalTime;
public class Invitacion {
    private String invitado;
    private LocalDate fecha;
    private LocalTime hora;

    public Invitacion(String invitado, LocalDate fecha, LocalTime hora) {
        this.invitado = invitado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getInvitado() {
        return invitado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public boolean validarInvitado(String nombre) {
        return this.invitado != null && this.invitado.equalsIgnoreCase(nombre);
    }
}
