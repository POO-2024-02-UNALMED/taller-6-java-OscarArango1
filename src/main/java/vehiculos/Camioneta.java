package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo{
    protected boolean volco;
    protected static ArrayList<Camioneta> listado = new ArrayList<>();

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.listado.add(this);
        Vehiculo.listadoVehiculos.add(this);
    }

    public boolean isVolco() {
        return this.volco;
    }
    public void setVolco(boolean value) {
        this.volco = value;
    }
}
