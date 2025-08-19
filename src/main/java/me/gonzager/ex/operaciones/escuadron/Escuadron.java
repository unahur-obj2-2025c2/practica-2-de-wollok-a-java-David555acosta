package me.gonzager.ex.operaciones.escuadron;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.TreeUI;

import me.gonzager.ex.operaciones.ciudad.Ciudad;
import me.gonzager.ex.operaciones.dron.Dron;
import me.gonzager.ex.operaciones.zona.Zona;

public class Escuadron {
    List<Dron> drones = new ArrayList<>();

    public void  agregarUnDron(Dron dronX) {
        int capacidadMaxima = Ciudad.getIsnstance().getCantidadMaximaDeDrones();
        if (this.drones.size() > capacidadMaxima) {
            throw new RuntimeException("No se puede agregar más drones");
        } else {
            this.drones.add(dronX);
        }
    }

    private int eficienciaOperativa() {

        int total = 0;
        for (Dron d : drones) {
            total += d.eficienciaOperativa();
        }
        return total;
    }


    private boolean alMenosUnoAvanzado() {
        return drones.stream().anyMatch(d -> d.esAvanzado());
    }

    public boolean puedeOperar(Zona zonaX) {
        return this.alMenosUnoAvanzado() && this.eficienciaOperativa() * 1.5 > zonaX.getTamaño();
    }

    public void Operar(Zona zonaX) {
        if (this.puedeOperar(zonaX)) {
            zonaX.recibirOperacion();
            for (Dron drones : drones) {
                drones.disminuirAutonomia();
            }
        }
    }
}
