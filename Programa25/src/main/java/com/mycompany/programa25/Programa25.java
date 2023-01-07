package com.mycompany.programa25;

import java.util.Scanner;

public class Programa25 {

    public static void main(String[] args) {
        //Ciclo while
        
       /* int i=1;
        int itd=10;
        
        while(i<=10) //Mientras i sea menor a 10
        {
            System.out.println(i); //1 2 ... 10
            i++; //Cuando i llegue a 11 se detine
        }
        while(itd>=1) //Decrementar
        {
            System.out.println(itd); 
            itd--; 
        }
        */
       Scanner entrada = new Scanner(System.in);
       int i=1, contador;
       
        System.out.println("Digite cuantos números quiere en pantalla: ");
        contador = entrada.nextInt();
        
        while(i<=contador)
        {
            System.out.println(i);
            //i++; //Para que avancen de 1 en 1
            i += 2; //Para que salgan de 2 en 2
        }
    }
}
