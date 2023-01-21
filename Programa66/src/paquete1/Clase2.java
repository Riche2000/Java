package paquete1;

public class Clase2 {
    //Clase main
    public static void main(String[] args){
        //Creamos un objeto de la clase 1
        Clase1 objeto1 = new Clase1();
        //Gracias al método Setter le podemos establecer una edad
        objeto1.setEdad(22);
        System.out.println("La edad es: "+objeto1.getEdad());
        
        //Le establecemos un nombre
        objeto1.setNombre("Ricardo");
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
}
