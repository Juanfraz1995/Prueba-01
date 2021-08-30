
package probando;


public class Mascota {

  
    public static void main(String[] args) {
        
        ClassMascota mascota1 = new ClassMascota();
        
        mascota1.setNombre("");
        mascota1.setRaza("tito");
        mascota1.setPeso(48);
        mascota1.setAltura(25);
        mascota1.setVacuna(true);
        
        
        System.out.println("NOMBRE: "+ mascota1.getNombre() );
        System.out.println("RAZA: "+ mascota1.getRaza() );
        System.out.println("PESO: "+ mascota1.getPeso() );
        System.out.println("ALTURA: "+ mascota1.getAltura() );
        System.out.println("VACUNA: "+ mascota1.isVacuna() );
        
        
    }
    
}
