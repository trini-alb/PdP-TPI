package Modelo;
import java.util.ArrayList;
import java.util.List;

public class Estacionamiento {
    private String nombre;
    private String direccion;
    private List<Plaza> plazas;
    private int capacidadTotal;

    public Estacionamiento(String nombre, String direccion, int capacidadTotal) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadTotal = capacidadTotal;
        this.plazas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Plaza> getPlazas() {
        return plazas;
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void agregarPlaza(Plaza plaza) {
        plazas.add(plaza);
        capacidadTotal = plazas.size();
    }

    public void eliminarPlaza(Plaza plaza) {
        plazas.remove(plaza);
        capacidadTotal = plazas.size();
    }

    public Plaza conocerPlaza(int numero) {
        for (Plaza p : plazas) {
            if (p.getNumero() == numero) {
                return p;
            }
        }
        return null;
    }
}
