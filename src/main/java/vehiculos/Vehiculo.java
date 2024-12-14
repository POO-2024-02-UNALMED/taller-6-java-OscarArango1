package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
    
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    protected static int cantidadVehiculos;
    protected static ArrayList<Vehiculo> listadoVehiculos = new ArrayList<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos++;
    }

    public String getPlaca() {
        return this.placa;
    }
    public void setPlaca(String nuevaPlaca) {
        this.placa = nuevaPlaca;
    }

    public int getPuertas() {
        return this.puertas;
    }
    public void setPuertas(int value) {
        this.puertas = value;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public void setVelocidadMaxima(int value) {
        this.velocidadMaxima = value;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String value) {
        this.nombre = value;
    }

    public int getPrecio() {
        return this.precio;
    }
    public void setPrecio(int value) {
        this.precio = value;
    }

    public int getPeso() {
        return this.peso;
    }
    public void setPeso(int value) {
        this.peso = value;
    }

    public String getTraccion() {
        return this.traccion;
    }
    public void setTraccion(String value) {
        this.traccion = value;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }
    public void setFabricante(Fabricante value) {
        this.fabricante = value;
    }

    public static int getCantidadVehiculos(){
        return Vehiculo.cantidadVehiculos;
    }
    public static void setCantidadVehiculos(int nuevoNumero){
        Vehiculo.cantidadVehiculos = nuevoNumero;
    }

    public static ArrayList<Vehiculo> getListadVehiculos(){
        return Vehiculo.listadoVehiculos;
    }

    public String vehiculosPorTipo(){
        String mensaje = "Automoviles: "+ Automovil.listado.size() + "\nCamionetas: " + Camioneta.listado.size() + "\nCamiones: " + Camion.listado.size();
        return mensaje;
    }
}
