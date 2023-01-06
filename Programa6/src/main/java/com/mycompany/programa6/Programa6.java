package com.mycompany.programa6;

import java.util.Scanner;   //Libreria de Java para usar Scanner

public class Programa6 {

    public static void main(String[] args) {
        //ENTRADA Y SALIDA DE DATOS POR CONSOLA
        Scanner entrada1 = new Scanner(System.in);  //En el foco importamos java.util.Sacnner
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        Scanner entrada5 = new Scanner(System.in);
        Scanner entrada6 = new Scanner(System.in);
        
        int numero;
        float numerof;
        double numerod;
        String cadena;
        String cadena1;
        char letra;
        
        System.out.println("Digite un número entero: ");
        numero = entrada1.nextInt(); //Guardamos datos de tipo entero
        
        System.out.println("Digite un número flotante");
        numerof = entrada2.nextFloat(); //Guarda números con punto decimal Ejemplo 14.15
        
        System.out.println("Digite un número double");
        numerod = entrada3.nextDouble();
        
        System.out.println("Digite una cadena");
        cadena = entrada4.next(); //.next es para guardar una cadena sin espacios
        
        System.out.println("Digite una cadena de más lineas");
        cadena1 = entrada5.nextLine(); //.nextLine es para guardar una cadena con espacios
        
        System.out.println("Digite una letra");
        letra = entrada6.next().charAt(0); //Tipo caracter
        //Con .next() guarda hasta que haya un espacio y con .charAt(0) hace que solo lea un solo caracter      
        
        System.out.println("El numero es: "+numero);
        System.out.println("El numero es: "+numerof);
        System.out.println("El numero es: "+numerod);
        System.out.println("La cadena es: "+cadena);
        System.out.println("La cadena de más lineas es: "+cadena1);
        System.out.println("El caracter es: "+letra);
        
    }
}
