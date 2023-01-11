package com.mycompany.programa48;

import java.util.Scanner;

public class Programa48 {

    public static void main(String[] args) {
        //Arreglos - Separar los números pares e impares de un arreglo
        Scanner entrada = new Scanner(System.in);
        //Creamos el arreglo
        int arreglo[] = new int[10]; //Este arreglo tiene 10 elementois enteros
        int conteo_pares=0,conteo_impares=0;
        
        //Solicitamos lso numeros al usuario y los guardamos
        System.out.println("Llenar el arreglo");
        for(int i=0;i<10;i++)
        {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
            
            if(arreglo[i] % 2==0) //Si el numero es Par
            {
                conteo_pares++; //El conteo de pares aumenta en 1
            }
            else //De lo contraro 
            {
                conteo_impares++; //El conteo de impares aumenta en 1
            }
        }
        //Creamos Arreglo para que almacene los números pares
        int par[] = new int[conteo_pares];
        //Creamos Arreglo para que almacene los números impares
        int impar[] = new int[conteo_impares];
        
        //Almacenamos los números a sus arreglos correspondinetes (pares y impares)
        conteo_pares=0;
        conteo_impares=0;
        
        for(int i=0;i<10;i++)
        {   //Si el númer del arreglo en el que vamos es par  
            if(arreglo[i] % 2 == 0) // Si lo divido entre 2 y su residuo me da 0
            {
                par[conteo_pares] = arreglo[i]; //A mi arreglo par con el iterador "conteo_pares sea igual al arreglo i"
                conteo_pares++; //Conteo pares aumenta en 1
            }
            else //Si el número es impar
            {
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }
        
        System.out.print("\nArreglo pares: ");
        for(int i=0;i<conteo_pares;i++)
        {
            System.out.print(par[i]+" - ");
        }
        System.out.println("");
        
        System.out.print("\nArreglo impares: ");
        for(int i=0;i<conteo_impares;i++)
        {
            System.out.print(impar[i]+" - ");
        }
        System.out.println("");
        
    }
}
