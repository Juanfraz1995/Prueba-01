

package ejercicio07;


public class ClassRectangulo {
    
    private Integer alto;
    private Integer largo;
    
    // CONSTRUCTORES 
    public ClassRectangulo(Integer alto, Integer largo) {
        this.alto = alto;
        this.largo = largo;
    }
    
    // GETTER Y SETTER
    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    // METODO AREA  
    
    public void calcularArea () {
        System.out.println("El area del rectangulo es de: "+ alto*largo);
    }
    
    // METODO PERIMETRO
    public void calcularPerimetro (){
        System.out.println("El perimetro del recangulo es: "+ (alto+largo)*2);
    }
    
    // METODO DESPLAZAMIENTO
    
    
    
    // METODO DIBUJAR
    
    public void dibujarRectangulo () {
        
        for (int i = 1 ; i<=alto ; i++){
            
            
            for (int j=1 ; j<=largo; j++){
                
                if (j==1 || j==largo || i==1 || i==alto ){
                    
                    System.out.print("*");
                    
                }
                
                else {
                    System.out.print(" ");
                }
                
                
            }
            
            System.out.println(" ");
        }
        
        
        
        
    }
    
    
}
