package com.mycompany.programa50;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa50 {

    public static void main(String[] args) {
        //Ordenamientos - Método Burbuja
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        
        arreglo = new int[nElementos]; //Le asignamos el número de elementos al arreglo
        
        //Usamos el for para pedirle todos los elementos al usuario
        for(int i=0;i<nElementos;i++)
        {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Metodo burbuja para ordenar el arreglo
        //Este fdor le dice al programa cuantas vueltas tiene que dar
        for(int i=0;i<(nElementos-1);i++)
        {
            //Este for nos sirve para ordenar el arreglo
            for(int j=0;j<(nElementos-1);j++)
            {
                if(arreglo[j]>arreglo[j+1]) //Si número actual es mayor a número siguiente
                {
                    //Intercambiamos los valores
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        //Mostramos el arreglo ordenado en forma creciente
        System.out.println("\nAreglo ordenado en forma creciente: ");
        for(int i=0;i<nElementos;i++)
        {
            System.out.print(arreglo[i]+" - ");
        }
        
        //Mostranos el arreglo de forma decreciente
        System.out.println("\nArreglo ordenado de forma decreciente: ");
        for(int i=(nElementos-1);i>=0;i--)
        {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
}
