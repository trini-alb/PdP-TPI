package Modelo;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public  class Tarifa {
    private TipoUsuario tipoUsuario;
    private double monto;
    private Date fechaDesde;
    private Date fechaHasta;

    public Tarifa() {
        this.tipoUsuario = null;
        this.monto = 0;
        this.fechaDesde = null;
        this.fechaHasta = null;
    }
    public double calcularTarifa(Usuario usuario, Plaza plaza) {
        EntradaSalida es = plaza.getEntradaSalida();
        LocalDateTime entrada = es.getFechaHoraEntrada();
        LocalDateTime salida = LocalDateTime.now();
        es.setFechaHoraSalida(salida);
        long minutos = ChronoUnit.MINUTES.between(entrada, salida);
        // Invitados no pagan
        if (usuario instanceof Invitacion) {
            return 0;
        }
        // Menos de 5 minutos no pagan
        if (minutos < 5) {
            return 0;
        }
        // Acá usás la lógica de tu tipo de cuenta o tipo de usuario
        Tarifa tarifa = usuario.getTarifa(); // Debe existir en Usuario
        return tarifa.calcular(minutos);
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
