package Controlador;

public class Controlador {

    private int plazasDisponibles = 10;

    public void registrarEntrada() {
        if (plazasDisponibles > 0) {
            plazasDisponibles--;
            System.out.println("Entrada registrada. Plazas restantes: " + plazasDisponibles);
        } else {
            System.out.println("No hay plazas disponibles.");
        }
    }

    public void registrarSalida() {
        plazasDisponibles++;
        System.out.println("Salida registrada. Plazas disponibles: " + plazasDisponibles);
    }

    public void mostrarPlazas() {
        System.out.println("Plazas disponibles: " + plazasDisponibles);
    }

    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }
}