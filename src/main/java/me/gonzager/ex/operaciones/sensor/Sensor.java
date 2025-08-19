package me.gonzager.ex.operaciones.sensor;

public class Sensor {
    private int capacidad;
    private int durabilidad;
    private Boolean mejorasTecnologicas;

    
    public Sensor(int capacidad, int durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public Boolean getMejorasTecnologicas() {
        return mejorasTecnologicas;
    }

    public void setMejorasTecnologicas(Boolean mejorasTecnologicas) {
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public int eficienciaOperativa() {
        if (this.mejorasTecnologicas) {
            return this.capacidad * 2;
        } else {
           return this.capacidad;
        }
    }

    public Boolean esDuradero() {
        return this.durabilidad > 2 * this.capacidad;
    }
}
