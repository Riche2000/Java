package paquete1;

public class Principal {
    //Clase main
    public static void main(String[] args){
        //Creamos un objeto de la clase Persona
        Persona persona1 = new Persona("Ricardo",22);
        //A lo largo del programa la podemos ir cambiado gracias a los getter y setter ya que igual es una variable
        persona1.setEdad(23);
        
        persona1.mostrarDatos();
        
    }
}
