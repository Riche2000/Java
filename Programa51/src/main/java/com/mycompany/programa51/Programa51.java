package com.mycompany.programa51;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa51 {

    public static void main(String[] args) {
        //Ordenamientos - Ordenamiento por Inserción
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo"));
        
        //Le asignamos al arreglo cuantos elementos va a tener 
        arreglo = new int[nElementos];
        
        System.out.println("Digite el arreglo: ");
        for(int i=0;i<nElementos;i++)
        {
            System.out.print((i+1)+". Digite un número: ");
            //Los elementos del arreglo los guardamos 
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por Insercion
        for(int i=0;i<nElementos;i++)
        {
            pos = i;
            aux = arreglo[i]; //Aux va a valer el elemento del arreglo en el cual vamos comprobando
            
            //Mientras que la posicion sea mayor a 0 y que el número de la izquierda sea mayor al actual
            while((pos>0) && (arreglo[pos-1] > aux))
            {
                //El número actual lo igualamos al número que estaba a la izquierda
                arreglo[pos] = arreglo[pos-1];
                //pos-- es para que vaya comprobando con los número que hay a la izquierda hasta que llegue a la  posicion 1
                pos--;
            }
            //Refrescamos el número actual
            arreglo[pos] = aux;
        }
        //Imprimimos los elementos del arreglo en orden ascendente
        System.out.print("\nOrden Ascendente: ");
        for(int i=0;i<nElementos;i++)
        {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
        
        //Imprimimos los elementos del arreglo en orden descendente
        System.out.print("\nOrden Descendente: ");
        //Empezamops por el ultimo elemento del arreglo
        for(int i=(nElementos-1);i>=0;i--)
        {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
}
