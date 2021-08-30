
package Prueba2;

import java.util.Scanner;


public class Servicio {
    
    
     //    METODOS
    
    public Clase crearObjetos (String nombre, Integer dni,double peso){
       
        Clase objeto = new Clase ();
        
        objeto.setNombre(nombre);
        objeto.setDni(dni);
        objeto.setPeso(peso);
                
                
        return objeto;      
    }
    
    /////////////
    
   public void mostrarObjetos(Clase objeto) {
        System.out.println("Nombre: " + objeto.getNombre());
        System.out.println("Dni: " + objeto.getDni());
        System.out.println("Peso: " + objeto.getPeso());
        
    }
    
    /////////////
   
   public Clase modificarObjeto(Clase objeto, String nombre){
       
       objeto.setNombre(nombre);
       return objeto;
   }
    
     /////////////
   
   public Clase modificarObjeto(Clase objeto, String nombre, double peso){
       
       objeto.setNombre(nombre);
       objeto.setPeso(peso);
       return objeto;
   }
    
    /////////////
   
   public void eliminarObjeto (Clase objeto){
       objeto = null;
      // mostrarObjetos(objeto); si dejamos esto no funciona el objeto ya que no intentara
       //mostrar el elemento que eliminamos
   }
    
   
    //////////////////////////////////////////////////////////////////////
    ///////////////    OTRA FORMA DE CREAR    ////////////////////////////
   
   public Clase crearDeOtraForma (Clase otraForma){
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Ingrerse un ultimo nombre, dni y peso");
       
       otraForma.setNombre(leer.next());
       otraForma.setDni(leer.nextInt());
       otraForma.setPeso(leer.nextDouble());
       
       
       return otraForma;
   }
   
   
   //////////////////////////////////////////////////////////////////////
   ////////////   METODOS QUE MANEJAN VARIABLES   ///////////////////////
   
   public void tipoDni (Integer dni){
       
       
       if (dni>100000){
           System.out.println("Es un Dni de una persona joven");
           
       }else {
           System.out.println("El DNI es de una persona mayor");
       }
        
   }
   
   
   
   
}
