package me.gonzager.ex.operaciones.mision;

import me.gonzager.ex.operaciones.dron.Dron;

public class Transporte implements Mision {

    @Override
    public Double eficienciaOperativa() {
        // TODO Auto-generated method stub
        return 100.0;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        // TODO Auto-generated method stub
        return dron.getAutonomia() >= 50;
    }

}
