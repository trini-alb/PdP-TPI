package Modelo;
import java.util.Date;
public class Cobro {
    private double monto;
    private Date fecha;
    private String metodoPago;

    public Cobro(double monto, Date fecha, String metodoPago) {
        this.monto = monto;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String generarTicket() {
        return "Ticket - Monto: " + monto + ", Fecha: " + fecha + ", Metodo de Pago: " + metodoPago;
    }

    public void registrarPago() {
        System.out.println("Pago registrado: " + generarTicket()); //Simulacion
    }
}
