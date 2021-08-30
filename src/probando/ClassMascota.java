package probando;

public class ClassMascota {

    
    ///////////////////////
    //ATRIBUTOS
    
    private String nombre;
    private String raza;
    private Integer peso;
    private Integer altura;
    private boolean vacuna;

    
    ////////////////////////
    // CONTRUCTORES
    
    public ClassMascota() {
    }
    
    
    public ClassMascota(String nombre, String raza, Integer peso, Integer altura, boolean vacuna) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.altura = altura;
        this.vacuna = vacuna;
    }

    
    public ClassMascota(String nombre, boolean vacuna) {
        this.nombre = nombre;
        this.vacuna = vacuna;
    }

    
    
    ///////////////////////////
   // GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        // ACA VAN LOS IF, FOR, ETC. //
        
        if (nombre.equals("")) {
            // System.out.println("El nombre es incorrecto")
            this.nombre = "El cacilleroe esta vacio";
        } 
        
        else {
            this.nombre = nombre;
        }

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

}
