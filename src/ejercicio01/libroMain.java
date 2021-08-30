/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 Autor, Número de páginas, y un constructor que inicialice esos atributos con los
 valores pasados como parámetros. Definir una instancia para cargar un libro y
 luego informar mediante otro método el número de ISBN, el título y el autor del
 libro.*/
package ejercicio01;

import java.util.Scanner;

public class libroMain {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         // contructor vacio que llenamos en el main a continuacion unoa  uno
        libroClass libro1 = new libroClass();

        libro1.autor = "Fran";
        libro1.paginas = 145;
        System.out.println("LIBRO1");
        libro1.mostrarLibro();

        System.out.println("");

        // otro constructor vacio que llenamos a continuacion
        libroClass libro2 = new libroClass();
        libro2.isbn = 1234;
        System.out.println("LIBRO2");
        libro2.mostrarLibro();

        System.out.println("");

        libroClass libro3 = new libroClass(321, "JFZaina", "Franchesco", 565);
        System.out.println("LIBRO3");
        libro3.mostrarLibro();

        System.out.println("");
        System.out.println("llenar libro 4");

        libroClass libro4 = new libroClass();

        libro4.isbn = leer.nextInt();
        libro4.titulo = leer.next();
        libro4.autor = leer.next();
        libro4.paginas = leer.nextInt();

        libro4.mostrarLibro();
        
        System.out.println("");
        
        libroClass libro5 = new libroClass("robertititutlo");
        libro1.paginas = 145;
        
        libro5.mostrarLibro();
        

    }

}
