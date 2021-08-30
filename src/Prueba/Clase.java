

package Prueba;

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
    
    

    /////////////////////
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
    
    //    METODOS
    
    public Clase crearObjetos (String nombre, Integer dni,double peso){
       
        Clase objeto = new Clase ();
        
        objeto.setNombre(nombre);
        objeto.setDni(dni);
        objeto.setPeso(peso);
                
                
        return objeto;      
    }
    
    /////////////
   public void mostrarObjetos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dni: " + getDni());
        System.out.println("Peso: " + getPeso());
        
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
   
}
