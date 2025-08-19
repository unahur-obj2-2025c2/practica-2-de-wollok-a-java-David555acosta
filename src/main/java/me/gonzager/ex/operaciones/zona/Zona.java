package me.gonzager.ex.operaciones.zona;
import me.gonzager.ex.operaciones.dron.Dron;

public class Zona {
    private int tamaño;

    public int getTamaño() {
        return tamaño;
    }

    private int cantidadOperaciones = 0;

    public void recibirOperacion() {
        this.cantidadOperaciones += 1;
    }
    
}
