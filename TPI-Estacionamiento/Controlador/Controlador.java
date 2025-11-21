package Controlador;

import Modelo.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Controlador {

    private List<Plaza> plazas;
    private static final double TARIFA_POR_DIA = 1000.0;

    public Controlador() {
        plazas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            plazas.add(new Plaza(Estado.DISPONIBLE, i, null, null, null));
        }
    }

    public LocalDateTime ocuparPlaza(int numeroPlaza, String usuario) {
        Plaza plaza = buscarPlaza(numeroPlaza);

        if (plaza == null) {
            System.out.println("No existe esa plaza.");
            return null;
        }

        if (plaza.conocerEstado() == Estado.OCUPADA) {
            System.out.println("La plaza ya está ocupada.");
            return null;
        }

        EntradaSalida es = new EntradaSalida(LocalDateTime.now(), null, null);
        plaza.ocupar(es);

        System.out.println("Plaza " + numeroPlaza + " ocupada por " + usuario);
        return es.getFechaHoraEntrada();
    }

    public Object[] liberarPlaza(int numeroPlaza) {
        Plaza plaza = buscarPlaza(numeroPlaza);

        if (plaza == null) {
            System.out.println("No existe esa plaza.");
            return null;
        }

        if (plaza.conocerEstado() == Estado.DISPONIBLE) {
            System.out.println("La plaza ya está libre.");
            return null;
        }

        plaza.liberar();

        LocalDateTime entrada = plaza.getEntradaSalida().getFechaHoraEntrada();
        LocalDateTime salida = plaza.getFechaHoraDesocupacion();

        long minutos = ChronoUnit.MINUTES.between(entrada, salida);
        double costo = 0;

        if (minutos >= 5) {
            long dias = ChronoUnit.DAYS.between(entrada.toLocalDate(), salida.toLocalDate()) + 1;
            costo = dias * TARIFA_POR_DIA;
        }

        System.out.println("Plaza " + numeroPlaza + " liberada. Costo: $" + costo);

        return new Object[]{salida, costo};
    }

    public void mostrarPlazas() {
        for (Plaza p : plazas) {
            System.out.println("Plaza " + p.getNumero() + ": " + p.conocerEstado());
        }
    }

    private Plaza buscarPlaza(int numeroPlaza) {
        for (Plaza p : plazas) {
            if (p.getNumero() == numeroPlaza) {
                return p;
            }
        }
        return null;
    }
}
