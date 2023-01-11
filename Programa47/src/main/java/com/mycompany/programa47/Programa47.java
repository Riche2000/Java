package com.mycompany.programa47;

import java.util.Scanner;

public class Programa47 {

    public static void main(String[] args) {
        //Arreglos - Insertar un número en un arreglo ordenado
        Scanner entrada =  new Scanner(System.in);
        //Creamos el arreglo
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero,sitio_num=0,j=0;
        
        //Llenamos el arreglo
        System.out.println("Llenar el arreglo");
        do
        {
            //Llenando el arreglo
            for(int i=0;i<5;i++)
            {
                System.out.print((i+1)+". Digite un número: ");
                arreglo[i] = entrada.nextInt(); //Lo guardamos dentro del arreglo
            }
            //Nos aseguramos que el arreglo este ordenado de forma creciente
            for(int i=0;i<4;i++)
            {
                if(arreglo[i] < arreglo[i+1]) //Creciente 1-2-3-4
                {
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]) //Decreciente 4-3-2-1
                {
                    creciente = false;
                    break; //Nos termina con el bucle 
                }
            }
            if(creciente == false)
            {
                System.out.println("\nEl arreglo no esta ordenado de forma creciente, vuelva a digitar\n");
            }
        }
        //El do while se va a repetir hasta que creciente sea igual a false
        while(creciente == false);
        
        System.out.print("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();
        //En que posicion del arreglo va a ir el número
        while(arreglo[j]<numero && j<5)
        {
            sitio_num++;
            j++;
        }
        
        //Trasladamos una posicion en el arreglo a los elementos que van detras de numero
        for(int i=4;i>=sitio_num;i--) //Es el hueco
        {
            arreglo[i+1] = arreglo[i];
        }
        //Insertamos el número que el usuario puso
        arreglo[sitio_num] = numero;
        
        //Imprimimos el arreglo
        System.out.print("\nEl arreglo queda: ");
        for(int i=0;i<6;i++)
        {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
}
