
package Prueba;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Clase objeto1 = new Clase();
        Clase objeto2 = new Clase();
        //El objeto 3 es un objeto creado directamente con el constructor
        Clase objeto3 = new Clase("", 111,222);
        
        System.out.println("Ingrerse nombre, dni y peso");
        objeto1 = objeto1.crearObjetos(leer.next(), leer.nextInt(), leer.nextDouble());
        System.out.println("");
        System.out.println("Los datos ingresados son");
        objeto1.mostrarObjetos();
        System.out.println("");
        
        
        System.out.println("Ingrerse otro nombre, dni y peso");
        objeto2 = objeto2.crearObjetos(leer.next(), leer.nextInt(), leer.nextDouble());
        System.out.println("");
        System.out.println("Los datos ingresados son");
        objeto2.mostrarObjetos();
        System.out.println("");
        
        System.out.println("Modifique el nombre de los primeros datos ingrersados");
        objeto1.modificarObjeto(objeto1, leer.next());
         System.out.println("");
        System.out.println("Los datos ingresados son");
        objeto1.mostrarObjetos();
        System.out.println("");
        
        System.out.println("El programa modificara los datos por cuenta propia");
        objeto1.modificarObjeto(objeto1, "Raul", 123);
        objeto1.mostrarObjetos();
        
        objeto3.mostrarObjetos();
        
    }
    
}
