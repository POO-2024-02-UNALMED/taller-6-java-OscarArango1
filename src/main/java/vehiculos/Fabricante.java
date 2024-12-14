package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
    protected String nombre;
    protected Pais pais;

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public Pais getPais(){
        return this.pais;
    }
    public void setPais(Pais nuevoPais){
        this.pais = nuevoPais;
    }

    public static Fabricante fabricaMayorVentas(){
        
        Fabricante fabricanteVendedor = null;
        ArrayList<Fabricante> fabricantesArrayList = new ArrayList<>();
        ArrayList<String> nombresFabricantes = new ArrayList<>();
        String fabricanteMasRepetido = null;
        String fabricanteActual = null;
        int cuentaMaxima = 0;
        int cuentaActual = 0;

        for (Vehiculo vehiculo : Vehiculo.getListadVehiculos()){
            fabricantesArrayList.add(vehiculo.getFabricante());
        }

        for (Fabricante elementoFabricante : fabricantesArrayList){
            nombresFabricantes.add(elementoFabricante.getNombre());
        }

        Collections.sort(nombresFabricantes);

        for (String fabrianteEnLista : nombresFabricantes){
            if (fabrianteEnLista.equals(fabricanteActual)){
                cuentaActual++;
                if (cuentaActual > cuentaMaxima){
                    cuentaMaxima = cuentaActual;
                    fabricanteMasRepetido = fabrianteEnLista;
                }
            }
            else{
                fabricanteActual = fabrianteEnLista;
                cuentaActual = 1;
            }
        }

        for (Fabricante elemento : fabricantesArrayList){
            if (elemento.getNombre().equals(fabricanteMasRepetido)){
                fabricanteVendedor = elemento;
                break;
            }
        }

        return fabricanteVendedor;
    }

}
