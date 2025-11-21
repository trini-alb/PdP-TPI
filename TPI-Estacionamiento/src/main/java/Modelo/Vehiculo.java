package Modelo;
// import Modelo.Cuenta; // innecesario, ya está en el mismo paquete
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private Invitacion invitacion;
    private CuentaUsuario cuenta;

    public Vehiculo(String patente, String marca, String modelo, Invitacion invitacion, CuentaUsuario cuenta) {
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

    public CuentaUsuario getCuenta() {
        return cuenta;
    }
    


    public void setCuenta(CuentaUsuario cuenta) {
        this.cuenta = cuenta;
    }

    public void setInvitacion(Invitacion invitacion) {
        this.invitacion = invitacion;
    }

    public boolean conocerInvitacion() {
        return this.invitacion != null;
    }

    public boolean conocerCuenta() {
        return this.cuenta != null;
    }
}