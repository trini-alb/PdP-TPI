package Modelo;
public class TipoUsuario {
    private String tipo;
    private String descripcion; //puede que este mal

    public TipoUsuario(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double aplicarDescuento(double monto) {
        if (tipo != null && !tipo.isEmpty()) {
            return monto * 0.8; // No recordamos si aplica a alumno y profesor juntos
        }
        return monto;
    }
}

