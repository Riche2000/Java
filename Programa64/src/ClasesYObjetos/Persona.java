package ClasesYObjetos;

public class Persona {
    //POO - Sobrecarga de Métodos
    
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Métodos
    //Sobre carga de constructores se le llama cuando hay más de un Constructor
    //Método constructor
                        //Parametros
    public Persona(String nombre, int edad){
      //Atributos    Parametros
        this.nombre = nombre;
        this.edad = edad;
    }
    //Método constructor
                  //Parametro
    public Persona(String dni){
      //Atributo   Parametro
        this.dni = dni;
    }
    
    //Sobrecarga de métodos
    //Diferenciamos a los metodos por los parametros (cantidad o tipo)
    //Método
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton");
    }
    //Método
                    //Parametro
    public void correr(int km){
        System.out.println("He corrido "+km+" kilmetros");
    }
}
