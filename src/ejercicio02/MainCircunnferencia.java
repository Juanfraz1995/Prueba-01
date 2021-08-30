

package ejercicio02;

import java.util.Scanner;


public class MainCircunnferencia {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el perimetro de la circunferencia");
        
        ClassCircunferencia circunferencia1 = new ClassCircunferencia(leer.nextInt());
        
         System.out.println("Ingrese el perimetro de la segunda circunferencia");
        
        ClassCircunferencia circunferencia2 = new ClassCircunferencia(leer.nextInt());
        
        
        
        circunferencia1.mostrarArea();
        circunferencia1.mostrarPerimetro();
        
        circunferencia2.mostrarArea();
        circunferencia2.mostrarPerimetro();
        
        
        
    }
    
}
