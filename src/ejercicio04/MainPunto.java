package ejercicio04;

import java.util.Scanner;

public class MainPunto {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        
        System.out.println("Ingrese las coordenadas del primer punto: ");
        ClassPunto punto1 = new ClassPunto(leer.nextInt(), leer.nextInt());
        
        
        System.out.println("Ingrese las coordenadas del segundo punto: ");
        ClassPunto punto2 = new ClassPunto(leer.nextInt(), leer.nextInt());
        
       //distancia = Math.srqrt(Math.pow(punto2.x-punto1.x) + Math.pow(y1-y, 2)
        
       double dist = Math.sqrt(Math.pow(punto2.getX()- punto1.getX(), 2) + Math.pow(punto2.getY()- punto1.getY(), 2) );
    
       System.out.println("La distancia es: "+ dist);
   

    }

}


