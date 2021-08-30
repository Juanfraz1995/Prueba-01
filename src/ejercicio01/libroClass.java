package ejercicio01;

public class libroClass {

    Integer isbn;
    String titulo;
    String autor;
    Integer paginas;

    //constructor vacio tenemos que llenarlo nosotros en el main
    public libroClass() {
    }


    public libroClass(String titulo) {
        this.titulo = titulo;
    
    }
    
    

    public libroClass(Integer isbn, String titulo, String autor, Integer paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    

    public void mostrarLibro() {
        System.out.println("Autor: " + autor);
        System.out.println("Isbn: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Paginas: " + paginas);
        
        
        
    }
}
