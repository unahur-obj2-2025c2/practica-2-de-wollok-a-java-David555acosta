package me.gonzager.ex.operaciones.ciudad;

public class Ciudad {
    private static Ciudad isnstance = new Ciudad();

    private int cantidadMaximaDeDrones = 10;

    public Ciudad() {}

    public static Ciudad getIsnstance () {
        return isnstance;
    }

    public static void setIsnstance(Ciudad isnstance) {
        Ciudad.isnstance = isnstance;
    }

    public int getCantidadMaximaDeDrones() {
        return cantidadMaximaDeDrones;
    }

    public void setCantidadMaximaDeDrones(int cantidadMaximaDeDrones) {
        this.cantidadMaximaDeDrones = cantidadMaximaDeDrones;
    }
}
