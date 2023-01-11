package com.mycompany.programa45;

import java.util.Scanner;

public class Programa45 {

    public static void main(String[] args) {
        //Arreglos - Arreglo en forma creciente o decreciente
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos el arreglo de 10 elementos Enteros
        boolean creciente = false, decreciente = false;
        
        //Le pedimos los elementos al usuario
        System.out.println("Llenar el arreglo");
        for(int i=0;i<10;i++)
        {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i]= entrada.nextInt();
        }
        
        //Para recorrer el arreglo 
        for(int i=0;i<9;i++)
        {
            //Para saber que estan de forma creciente
            if(arreglo[i] < arreglo[i+1]) //El "arreglo[i]" es menor al arreglo que le continua "arreglo[i+1]" 1-2-3-4-5 ...
            {
                creciente = true;
            }
            //Para saber que estan de forma decreciente
            if(arreglo[i] > arreglo[i+1]) //El "arreglo[i]" es mayor al arreglo que le continua "arreglo[i+1]" 5-4-3-2-1
            {
                decreciente = true;
            }
        }
        //Indicamos que tipo de serie es
        
        //El arreglo es Creciente
        if(creciente==true && decreciente==false) //Si creciente es igual true y ademas decreciente es igual a false
        {
            System.out.println("\nEl Arreglo esta de forma creciente");
        }
        //El arreglo es Decreciente
        else if(creciente==false && decreciente==true) //En caso contrario
        {
            System.out.println("\nEl arreglo esta de forma decreciente");
        }
        //El arreglo esta desordenado
        else if(creciente==true && decreciente==true) //En algunos momentos esta creciente y en algunos momentos esta decreciente
        {
            System.out.println("\nEl arreglo esta desordenado");
        }
        //El arreglo tiene todos los números iguales
        else if(creciente==false && decreciente==false)
        {
            System.out.println("\nTodos los números del arreglo son iguales");
        }
    }
}
