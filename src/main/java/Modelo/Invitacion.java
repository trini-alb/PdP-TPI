package Modelo;
import java.util.Date;
import java.time.LocalTime;
public class Invitacion {
    private String invitado;
    private Date fecha;
    private LocalTime hora;

    public Invitacion(String invitado, Date fecha, LocalTime hora) {
        this.invitado = invitado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getInvitado() {
        return invitado;
    }

    public Date getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public boolean validarInvitado(String nombre) {
        return this.invitado != null && this.invitado.equalsIgnoreCase(nombre);
    }
}
