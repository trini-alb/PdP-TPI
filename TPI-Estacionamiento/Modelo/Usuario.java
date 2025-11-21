package Modelo;
// import Modelo.Cuenta; // innecesario, ya está en el mismo paquete
public class Usuario {
    private String nombre;
    private String apellido;
    private String documento;
    private TipoUsuario tipoUsuario;
    private Cuenta cuenta;

    public Usuario(String nombre, String apellido, String documento, TipoUsuario tipoUsuario, Cuenta cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.tipoUsuario = tipoUsuario;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setCuenta(Cuenta cuenta) { //Por las dudas preguntar
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void pagar(Cobro cobro) {
        if (cuenta != null) {
            if (cuenta.getSaldo() >= cobro.getMonto()) {
                cuenta.descontarMonto(cobro.getMonto());
                cobro.registrarPago();
                // Notificar pago realizado (Vista debe encargarse de mostrar mensajes)
            } else {
                // Notificar saldo insuficiente (Vista debe encargarse de mostrar mensajes)
            }
        } else {
            // Notificar cuenta no disponible (Vista debe encargarse de mostrar mensajes)
        }
    }

    public TipoUsuario conocerTipoUsuario() {
        return tipoUsuario;
    }

    public Cuenta conocerCuenta() {
        return cuenta;
    }

    /*public void consultarAfiliadoUTN() {
        // Simulación de consulta
        // La vista debe encargarse de mostrar mensajes de consulta y verificación de afiliación
        afiliadoUTN = true;
    }*/
}
