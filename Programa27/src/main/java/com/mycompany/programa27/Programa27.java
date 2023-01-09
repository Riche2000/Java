package com.mycompany.programa27;

import java.util.Scanner;

public class Programa27 {

    public static void main(String[] args) {
        //Ciclo for
        /*
        for(inicialización; condicion; aumento o decremento){
        Instrucciones;
        }
         */
        /*
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        */
        /*
        for(int i=10; i>=0; i--){
            System.out.println(i);
        }
        */
        /*
        Scanner entrada = new Scanner(System.in);
        int contador;
                System.out.println("Digite la cantidad de terminos: ");
                contador = entrada.nextInt();
                
                for(int i=1; i<=contador; i++){
                 System.out.println(i);
                }
        */
        //Sacar numeros pares
        Scanner entrada = new Scanner(System.in);
        int contador;
                System.out.println("Digite la cantidad de terminos: ");
                contador = entrada.nextInt();
                
                for(int i=2; i<=contador; i+=2){
                 System.out.println(i);
                }
    }
}
