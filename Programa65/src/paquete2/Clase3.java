package paquete2;
//Para instanciar objetos de otras clase que esten en otro paquete, lo importamos
import paquete1.Clase1;

public class Clase3 {
    //Método main
    public static void main(String[] args){
    Clase1 objeto1 = new Clase1();
    
    objeto1.atributo1 = 15;
    }
}
