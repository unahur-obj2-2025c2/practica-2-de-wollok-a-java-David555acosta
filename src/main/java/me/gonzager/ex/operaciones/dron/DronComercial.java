package me.gonzager.ex.operaciones.dron;

import me.gonzager.ex.operaciones.mision.Mision;

public class DronComercial extends Dron {

    public DronComercial(Double procesamiento, Mision mision) {
        super(procesamiento, mision);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double eficienciaOperativa() {
        // TODO Auto-generated method stub
        return super.eficienciaOperativa() * 1.1;
    }

    @Override
    public Boolean esAvanzadoSegunTipo() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
