package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
    
    protected String nombre;

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public static Pais paisMasVendedor(){
        
        Pais paisVendedor = null;
        ArrayList<Pais> paisesFabricantes = new ArrayList<>();
        ArrayList<String> nombresPaises = new ArrayList<>();
        String PaisMasRepetido = null;
        String PaisActual = null;
        int cuentaMaxima = 0;
        int cuentaActual = 0;

        for (Vehiculo vehiculo : Vehiculo.getListadVehiculos()){
            paisesFabricantes.add(vehiculo.fabricante.getPais());
        }

        for (Pais pais : paisesFabricantes){
            nombresPaises.add(pais.getNombre());
        }

        Collections.sort(nombresPaises);

        for (String paisEnLista : nombresPaises){
            if (paisEnLista.equals(PaisActual)){
                cuentaActual++;
                if (cuentaActual > cuentaMaxima){
                    cuentaMaxima = cuentaActual;
                    PaisMasRepetido = paisEnLista;
                }
            }
            else{
                PaisActual = paisEnLista;
                cuentaActual = 1;
            }
        }

        for (Pais elemento : paisesFabricantes){
            if (elemento.getNombre().equals(PaisMasRepetido)){
                paisVendedor = elemento;
                break;
            }
        }

        return paisVendedor;
    }
}
