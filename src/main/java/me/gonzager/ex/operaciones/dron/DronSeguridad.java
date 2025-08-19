package me.gonzager.ex.operaciones.dron;

public class DronSeguridad extends Dron {

    @Override
    public Boolean esAvanzadoSegunTipo() {
        // TODO Auto-generated method stub
        return this.getProcesamiento() > 50;
    }

}
