package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo{
    protected int ejes;
    protected static ArrayList<Camion> listado = new ArrayList<>();

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Camion.listado.add(this);
        Vehiculo.listadoVehiculos.add(this);
    }

    public int getEjes() {
        return this.ejes;
    }
    public void setEjes(int value) {
        this.ejes = value;
    }
}