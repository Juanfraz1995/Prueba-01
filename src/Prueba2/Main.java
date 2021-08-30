
package Prueba2;

import Prueba.*;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
     
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // esta es una forma de crear objetos con contructores vacios
        Clase objeto1;
        Clase objeto2 = new Clase();
        //El objeto 3 es un objeto creado directamente con el constructor
        Clase objeto3 = new Clase("", 111,222);
        
        // CREAMOS EL SERVICE
        
        Servicio servicio = new Servicio();
        
        
        // EMPEZAMOS A EJECUTAR EL PROGRAMA
        
        System.out.println("Ingrerse nombre, dni y peso");
        objeto1 = servicio.crearObjetos(leer.next(), leer.nextInt(), leer.nextDouble());
        System.out.println("");
        System.out.println("Los datos ingresados son");
        servicio.mostrarObjetos(objeto1);
        System.out.println("");
        
        
        System.out.println("Ingrerse otro nombre, dni y peso");
        objeto2 = servicio.crearObjetos(leer.next(), leer.nextInt(), leer.nextDouble());
        System.out.println("");
        System.out.println("Los datos ingresados son");
        servicio.mostrarObjetos(objeto2);
        System.out.println("");
        
        //MODIFICACION DE DATOS DE OBJETO 2
        System.out.println("Modifique el nombre");
        objeto2 = servicio.modificarObjeto(objeto2, leer.next());
        System.out.println("Los datos ingresados son");
        servicio.mostrarObjetos(objeto2);
        System.out.println("");
        
        // ELIMINAMOS UN OBJETO
        servicio.eliminarObjeto(objeto1);
        
        //MOSTRAMOS LO QUE QUEDA
        servicio.mostrarObjetos(objeto3);
        servicio.mostrarObjetos(objeto2);
        
        //////////////////////////////////////////////////////////////////////
        ///////////////    OTRA FORMA DE CREAR    ////////////////////////////
        
        Clase otraForama1 = new Clase();
        
        servicio.crearDeOtraForma(otraForama1);
        
        servicio.mostrarObjetos(otraForama1);
        
        //////////////////////////////////////////////////////////////////////
        ////////////   METODOS QUE MANEJAN VARIABLES   ///////////////////////
        
        
        servicio.tipoDni(objeto1.getDni());
        
        servicio.tipoDni(otraForama1.getDni());
        
        
    }
    
}
