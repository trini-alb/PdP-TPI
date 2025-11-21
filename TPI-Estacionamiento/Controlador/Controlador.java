package Controlador;

import Modelo.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Controlador {

    private List<Plaza> plazas;
    private Tarifa tarifaVigente; 

    public Controlador() {
        plazas = new ArrayList<>();
        tarifaVigente = new Tarifa(); 

        for (int i = 1; i <= 3; i++) {
            plazas.add(new Plaza(Estado.DISPONIBLE, i, null, null, null));
        }
    }

    public LocalDateTime ocuparPlaza(int numeroPlaza, String usuario) {
        Plaza plaza = buscarPlaza(numeroPlaza);

        // Validaciones
        if (plaza == null) {
            return null;
        }

        if (plaza.conocerEstado() == Estado.OCUPADA) {
            return null; // La plaza ya está ocupada
        }

        EntradaSalida es = new EntradaSalida(LocalDateTime.now(), null, tarifaVigente);
        
        // Ocupamos la plaza en el Modelo
        plaza.ocupar(es);

        return es.getFechaHoraEntrada();
    }

    public Object[] liberarPlaza(int numeroPlaza) {
        Plaza plaza = buscarPlaza(numeroPlaza);

        // Validaciones
        if (plaza == null || plaza.conocerEstado() == Estado.DISPONIBLE) {
            return null;
        }

        EntradaSalida es = plaza.getEntradaSalida();
        
        plaza.liberar();

        LocalDateTime entrada = es.getFechaHoraEntrada();
        LocalDateTime salida = es.getFechaHoraSalida(); 

        double costo = tarifaVigente.calcularCosto(entrada, salida);

        return new Object[]{salida, costo};
    }

    public List<Plaza> obtenerPlazas() {
        return plazas;
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