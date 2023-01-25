package Paquete1;
//Clase Estatico
public class Estatico {
    //POO - Miembros estáticos de una clase
    
    private static String frase = "Primera frase";
    
    //Método
    public static int sumar(int n1,int n2){
        int suma = n1+n2;
        return suma;
    }
    //Método main
    public static void main(String[] args){
    
        System.out.println(Estatico.frase);
        System.out.println("La suma es: "+Estatico.sumar(3,4));
    }
}
