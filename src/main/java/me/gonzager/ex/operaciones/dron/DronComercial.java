package me.gonzager.ex.operaciones.dron;

public class DronComercial extends Dron {

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
