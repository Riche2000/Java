package com.mycompany.programa46;

import java.util.Scanner;

public class Programa46 {

    public static void main(String[] args) {
        //Arreglos - Desplazar una posición en un arreglo
        Scanner entrada= new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos el arreglo con espacio de 10 elementos enteros
        int ultimo;
        
        //Pedomos al usuario los 10 elementos
        System.out.println("Llenar el arrelgo");
        for(int i=0;i<10;i++)
        {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        //Guardamos el ultimo elemento del arreglo
        ultimo = arreglo[9];
        //Hacer que todos los elementos del arreglo avancen una posicion hacia abajo
        for(int i=8;i>=0;i--)
        { 
            arreglo[i+1] = arreglo[i]; // Hacemos que los elementos avancen una posición más en el arreglo
        }
        //Hacemos que el ultimo elemento del arreglo pase a ser el primero
        arreglo[0] = ultimo;
        //Mostramos el numero arreglo
        System.out.println("\nEl numero arreglo es: ");
        for(int i=0;i<10;i++)
        {
            System.out.println((i+1)+". Número: "+arreglo[i]);
        }
    }
}
