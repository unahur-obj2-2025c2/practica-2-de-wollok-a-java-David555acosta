package me.gonzager.ex.operaciones.mision;
import me.gonzager.ex.operaciones.dron.Dron;

public abstract interface Mision {
    public Double eficienciaOperativa();
    public Boolean esAvanzadoSegunMision(Dron dron);
} 