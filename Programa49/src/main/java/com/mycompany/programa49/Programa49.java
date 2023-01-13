package com.mycompany.programa49;

import java.util.Scanner;

public class Programa49 {

    public static void main(String[] args) {
        //Arreglos - Buscar un elemento en un arreglo ordenado
        Scanner entrada = new Scanner(System.in);
        int arreglo[],numero;
        boolean creciente = true;
        
        arreglo = new int[10]; //Creamos el arreglo con 10 posiciones
        
        do //El arrreglo debe estar ordenado crecientemente
        {
            //Pedimos el arreglo
            System.out.println("Rellene el areglo:");
            for(int i=0;i<10;i++)
            {
                System.out.print((i+1)+". Digite un número: ");
                arreglo[i] = entrada.nextInt(); //Guardamos cada número que el usuario digite dentro del arreglo
            }
            //Verificar si el arreglo esta ordenado crecientemente
            for(int i=0;i<9;i++)
            {
                if(arreglo[i] < arreglo[i+1]) //El arreglo esta de forma creciente 1,2,3...
                {
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]) //El arreglo esta e ofrma decreciente 3,2,1
                {
                    creciente = false;
                    break;
                }
            }
            if(creciente == false)
            {
                System.out.println("\nEl arreglo esta desordenado, digite nuevamente de manera creciente: \n");
            }
        }while(creciente == false);
                
                //Pedomos el número a buscar en el arreglo
                System.out.print("\nDigite el número a buscar en el arreglo: ");
                numero = entrada.nextInt();
                
                //Buscamos el número en el arrelo
                int i=0;
                //4
                //1-2-3-4-5-6-7-8-9-10
                while(i<10 && arreglo[i]<numero) //Minetras el iterador es menor a 10 y el numero del arreglo en el que vamos sea menor al número que estamos buscando
                {
                    i++;
                }
                
                if(i==10) //Hemos recorrido todo el arreglo y no encontramos nada
                {
                    System.out.println("\nNúmero no encontrado");
                }
                else
                {
                    if(arreglo[i] == numero)
                    {
                        System.out.println("\nNúmero encontrado, en la posición: "+i);
                    }
                    else
                    {
                        System.out.println("\nNúmero no encontrado");
                    }
                }
    }
}
