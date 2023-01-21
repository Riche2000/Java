package paquete1;

public class Persona {
    //POO - Constantes
    
    //Atributos de mi clase Persona
    //Encapsulamiento 
    //Esto es una variable ya que va cambiando
    private int edad; 
    //Esto es una constante (final es para las constantes)
    private final String nombre; 
    
    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodo mostrarDatos
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    //Setter
    public void setEdad(int edad){
        this.edad = edad;
    }
    //Getter
    public int getEdad(){
        return edad;
    }
}
