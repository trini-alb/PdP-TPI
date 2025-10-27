package Modelo;
// import Modelo.Cuenta; // innecesario, ya está en el mismo paquete
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private Invitacion invitacion;
    private Cuenta cuenta;

    public Vehiculo(String patente, String marca, String modelo, Invitacion invitacion, Cuenta cuenta) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.invitacion = invitacion;
        this.cuenta = cuenta;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Invitacion getInvitacion() {
        return invitacion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void setInvitacion(Invitacion invitacion) {
        this.invitacion = invitacion;
    }

    public boolean concocerInvitacion() {
        return this.invitacion != null;
    }

    public boolean conocerCuenta() {
        return this.cuenta != null;
    }
}