package Controlador;

import Modelo.Cobro;
import Modelo.TipoCuenta;

public class Cuenta {
    private TipoCuenta tipoCuenta;
    private double saldo;
    private Cobro cobro;
    public Cuenta(TipoCuenta tipoCuenta, double saldo, Cobro cobro) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.cobro = cobro;
    }   

}
