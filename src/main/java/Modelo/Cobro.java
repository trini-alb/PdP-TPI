package Modelo;
import java.time.LocalDateTime; // Usar el API de tiempo moderno

public class Cobro {
    private double monto;
    private LocalDateTime fecha; // Cambiado de Date a LocalDateTime
    private String metodoPago;
    private boolean pagado; // Añadir un estado de pago

    // Constructor actualizado
    public Cobro(double monto, LocalDateTime fecha, String metodoPago) {
        this.monto = monto;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.pagado = false; // Inicialmente no pagado
    }

    // [GETTERS]
    public Double getMonto(){
        return monto;
    }
    
    // Método que registra el pago (cambia el estado interno)
    public void registrarPago() {
        this.pagado = true;
    }
    
    // Nuevo getter
    public boolean isPagado() {
        return pagado;
    }

    // Usar toString para la representación de texto (simplifica 'generarTicket')
    @Override
    public String toString() {
        return "Monto: " + monto + 
               ", Fecha: " + fecha.toString().substring(0, 19) + // Formato simple
               ", Metodo de Pago: " + metodoPago + 
               ", Estado: " + (pagado ? "PAGADO" : "PENDIENTE");
    }
    
    // El método generarTicket ya no es necesario, se usa toString()
    // El método registrarPago ahora es void y actualiza el estado
}