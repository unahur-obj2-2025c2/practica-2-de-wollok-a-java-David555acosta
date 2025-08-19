package me.gonzager.ex.operaciones.mision;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.dron.Dron;
import me.gonzager.ex.operaciones.sensor.Sensor;

public class Vigilancia implements Mision {

    List<Sensor> sensores = new ArrayList()List<Sensor>;
    @Override
    public Double eficienciaOperativa() {
        double sum = 0;
        // TODO Auto-generated method stub
        for (Sensor e : sensores) {
            
            sum = sum + e.eficienciaOperativa();
        }
        return sum;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        // TODO Auto-generated method stub
        return null;
    }

}
