
package ejercicio07;

import java.util.Scanner;


public class MainRectangulo {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el alto y lago del rectangulo");
        
        ClassRectangulo rectangulo1 = new ClassRectangulo(leer.nextInt(), leer.nextInt());
        
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        rectangulo1.dibujarRectangulo();
        
        
        
     
    }
    
}
