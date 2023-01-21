package paquete1;

public class Clase1 {
    //POO - Encapsulamiento y métodos accesores (Getters y Setters)
    //Encapsulameiento, Se encarga de ocultar nuestros atributos y metodos para que solo puedan ser accedidos desde la misma clase
    
    //Encapsulamiento es ocultar para que solo puedan ser utilizados por metodos de la misma clase
    //EL atributo edad solo puede ser tomado por esta clase
    private int edad;
    private String nombre;
    //Metodos accesores (Getters y Setters)
    
    //Método Setter: Establecer
    //Establecemos un valor para el atributo (Establecemos la edad que nos manda el usuario)
    public void setEdad(int edad){
        this.edad = edad;
    }
    //Método Getter: Obtener
    //Mostramos la edad
    public int getEdad(){
        return edad;
    }
    //Método Setter: Establecer
    //Establecemos un valor para el atributo
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Método Getter: Obtener
    //Mostramos el nombre
    public String getNombre(){
        return nombre;
    }
}
