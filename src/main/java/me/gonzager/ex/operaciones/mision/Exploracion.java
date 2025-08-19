package me.gonzager.ex.operaciones.mision;

import me.gonzager.ex.operaciones.dron.Dron;

public class Exploracion implements Mision {

    @Override
    public Double eficienciaOperativa() {
        // TODO Auto-generated method stub
        return 0.0;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        // TODO Auto-generated method stub
        return dron.eficienciaOperativa() % 2 == 0;
    }

}
