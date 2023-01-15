package ClasesYObjetos;

public class Persona {
    //POO - Método Constructor
    
    //Atributos
    String nombre;
    int edad;
    
    //Métodos
    //Método constructor (No se le debe de poner el metodo de retorno)
    //Nos ayuda a inicializar los atribuos de la clase Persona
    //Método constructor     Parametros
    public Persona(String _nombre,int _edad){
        nombre = _nombre;
        edad = _edad;   
    }
    
    /* Otra forma de  crear constructores
    //Método constructor     Parametros
    public Persona(String nombre,int edad){
    //  Atrubutos    Parametros
        this.nombre = nombre;
        this.edad = edad;   
    }
    */
    
    //Método
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
}
