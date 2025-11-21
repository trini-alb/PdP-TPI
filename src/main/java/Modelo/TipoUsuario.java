package Modelo;
public class TipoUsuario {
    private String tipo;

    public TipoUsuario(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public double aplicarDescuento(double monto) {
        if (tipo != null && !tipo.isEmpty()) {
            return monto * 0.8; // No recordamos si aplica a alumno y profesor juntos
        }
        return monto;
    }
}

