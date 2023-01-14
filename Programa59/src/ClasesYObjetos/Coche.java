package ClasesYObjetos;

public class Coche {
    //POO - Creación de clases y objetos
    //Una clase debe contener atributos y metodos
    
    //Atributos(Caracteristicas)
    String color;
    String marca;
    int km;
    
    //Metodos(Acciones)
    public static void main(String [] args){
        //Dentro del metodo main vamos a crear objetos de la clase Coche
        
        //Creamos un objeto
        Coche coche1 = new Coche();
        
        //Llenamos los atributos del objeto
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche1 es: "+coche1.km);
        
        //Creamos un segundo objeto
        Coche coche2 = new Coche();
        
        //Llenamos los atributos del objeto
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
        System.out.println("\nEl color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche2 es: "+coche2.km);
    }
    
}

