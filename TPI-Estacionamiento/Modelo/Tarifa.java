package Modelo;
import java.util.Date;
public  class Tarifa {
    private TipoUsuario tipoUsuario;
    private double monto;
    private Date fechaDesde;
    private Date fechaHasta;

    public Tarifa(TipoUsuario tipoUsuario, double monto, Date fechaDesde, Date fechaHasta) {
        this.tipoUsuario = tipoUsuario;
        this.monto = monto;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public double calcularTotal() { //creemos que el diagrama de clases esta mal en esta parte
    double total = monto;
    if (tipoUsuario != null) {
        total = tipoUsuario.aplicarDescuento(total);
    }
    return total;
    }
    
    public TipoUsuario conocerTipoUsuario() {
        return tipoUsuario;
    }
}
