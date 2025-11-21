package Modelo;

// imports eliminados porque no se usan

public class Cuenta {
    private TipoCuenta tipoCuenta;
    private double saldo;
    private Cobro cobro;
    
    public Cuenta(TipoCuenta tipoCuenta, double saldo, Cobro cobro) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.cobro = cobro;
    }   

    public double getSaldo() {
        return saldo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public Cobro getCobro() {
        return cobro;
    }

    public void registrarCuenta() {
        // Notificar registro de cuenta (Vista debe encargarse de mostrar mensajes)
    }

    public void recargarMonto(double monto) {
        if (monto > 0) {
            saldo += monto;
            // Notificar recarga exitosa (Vista debe encargarse de mostrar mensajes)
        } else {
            // Notificar monto inválido (Vista debe encargarse de mostrar mensajes)
        }
    }

    public void descontarMonto(double monto) {
        if (monto <= 0) {
            // Notificar monto inválido (Vista debe encargarse de mostrar mensajes)
            return;
        }
        if (saldo >= monto) {
            saldo -= monto;
            // Notificar descuento exitoso (Vista debe encargarse de mostrar mensajes)
        } else {
            // Notificar saldo insuficiente (Vista debe encargarse de mostrar mensajes)
        }
    }

    public void conocerCobroSaldo() {
        // La vista debe encargarse de mostrar el cobro asociado y el saldo actual
    }

    public TipoCuenta conocerTipoCuenta() {
        return tipoCuenta;
    }


    //El metodo registrar vehiculo nos dijo laura que no lo hiciermos
}
