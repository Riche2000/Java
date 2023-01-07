package com.mycompany.programa13;

import java.util.Scanner;

public class Programa13 {

    public static void main(String[] args) {
        //Averiguar la cantidad de dinero
        Scanner entrada = new Scanner(System.in); 
        
        float guillermo,luis,juan,total;
        System.out.println("Digita la cantidad de dinero que tiene Guillermo");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2; //Luis tiene la mitad que guillermo       
        juan = (guillermo+luis)/2; //Juan tiene la mitad de lo que tiene Luis y Guillermo Jutnos
        
        total = guillermo+luis+juan;
        
        System.out.println("\n La cantidad de dinero entre los 3 es: "+total);
    }
}
