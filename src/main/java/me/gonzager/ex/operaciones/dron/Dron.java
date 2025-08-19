package me.gonzager.ex.operaciones.dron;

import me.gonzager.ex.operaciones.mision.Mision;

public abstract class Dron {
    private Double autonomia = 0.0;
    private Double procesamiento = 0.0;
    private Mision mision;

    public Double getProcesamiento() {
        return procesamiento;
    }

    public void setProcesamiento(Double procesamiento) {
        this.procesamiento = procesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }


    public double eficienciaOperativa() {
        return autonomia * 10 + mision.eficienciaOperativa();
    }
}
