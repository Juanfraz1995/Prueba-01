

package Prueba2;

import Prueba.*;

public class Clase {
    
    private String nombre;
    private Integer dni;
    private double peso;

    //CONSTRUCTORES
    
    public Clase(String nombre, Integer dni, double peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.peso = peso;
    }

    
    public Clase() {
    }
    
   
    // GETTER Y SETTER
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
   
   
}
