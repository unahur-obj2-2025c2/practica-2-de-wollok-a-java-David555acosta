package me.gonzager.ex.operaciones.dron;

import me.gonzager.ex.operaciones.mision.Mision;

public class DronSeguridad extends Dron {

    public DronSeguridad(Double procesamiento, Mision mision) {
        super(procesamiento, mision);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Boolean esAvanzadoSegunTipo() {
        // TODO Auto-generated method stub
        return this.getProcesamiento() > 50;
    }

}
