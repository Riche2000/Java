package com.mycompany.programa42;

import java.util.Scanner;

public class Programa42 {

    public static void main(String[] args) {
        //Arreglos - Imprimir en orden 5 números de un arreglo
        //Creamos nuestro arreglo
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        //Para guardar los datos del arreglo vamos a usar un bucle
        for(int i=0;i<5;i++)
        {   //Le ponemos un contador con i+1 esto lo hacemos porque el usuario no esta acostumbrado al 0 a 4 y así es 1 a 5
            System.out.print((i+1)+" Digite un número: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");
        //Usamos un for each
        for(float i:numeros)
        {
            System.out.println(i);
        }
    }
}
