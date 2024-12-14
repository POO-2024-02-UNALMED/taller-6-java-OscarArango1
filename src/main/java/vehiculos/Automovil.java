package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
    protected int puestos;
    protected static ArrayList<Automovil> listado = new ArrayList<>();

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Automovil.listado.add(this);
        Vehiculo.listadoVehiculos.add(this);
    }
    

    public int getPuestos() {
        return this.puestos;
    }
    public void setPuestos(int value) {
        this.puestos = value;
    }
}
