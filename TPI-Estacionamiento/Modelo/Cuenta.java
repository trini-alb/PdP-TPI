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
        System.out.println("Registrando cuenta...");
    }

    public void recargarMonto(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Monto recargado exitosamente. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto inválido. La recarga debe ser mayor a cero.");
        }
    }

    public void descontarMonto(double monto) {
        if (monto <= 0) {
            System.out.println("Monto inválido. La descontación debe ser mayor a cero.");
            return;
        }
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Monto descontado exitosamente. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para descontar el monto solicitado.");
        }
    }

    public void conocerCobroSaldo() {
        System.out.println("Cobro asociado: " + (cobro != null ? cobro.getMonto() : "Ninguno")); //Por las dudas para saber el cobro y el saldo y la diferencia
        System.out.println("Saldo actual: " + saldo);
    }

    public TipoCuenta conocerTipoCuenta() {
        return tipoCuenta;
    }


    //El metodo registrar vehiculo nos dijo laura que no lo hiciermos
}
