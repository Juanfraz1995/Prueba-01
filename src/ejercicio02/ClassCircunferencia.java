
package ejercicio02;


public class ClassCircunferencia {
    
    //ATRIBUTOS
    
    private Integer radio;

    //METODO CONSTRUCTOR
    public ClassCircunferencia(Integer radio) {
        this.radio = radio;
    }
    
    //METODO GET Y SET
    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }
    
    //METODO PARA CALCULAR EL AREA   area = pi * radio al cuadrado
    public void mostrarArea(){
            System.out.println("El area es; "+ Math.PI * Math.pow(radio, 2));
        
    }
    
     //METODO PARA CALCULAR EL PERIMTRO
    
     public void mostrarPerimetro(){
            System.out.println("El perimetro es: "+ 2*Math.PI*radio);
        
    }
    
    
}
