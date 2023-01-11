package com.mycompany.programa44;

import java.util.Scanner;

public class Programa44 {

    public static void main(String[] args) {
        //Arreglos - Mezclar 2 arreglos
        Scanner entrada = new Scanner(System.in);
        //Creamos los 3 arreglos
        int a[],b[],c[];
        //Definimos el tamaño de cada uno de los arreglos
        a = new int[10]; //Arreglo a tiene 10 elementos 
        b = new int[10]; //Arreglo b tiene 10 elementros
        c = new int[20]; //Arreglo c tiene 20 elementos ya que a a guardar los de a y b
        
        //Pedimos el arreglo a
        System.out.println("Digite el primer arreglo: ");
        for(int i=0;i<10;i++)
        {
            //(i+1) sirve para que el usuario sepa en que iterador va el bucle
            System.out.print((i+1)+". Digite un número: ");
            a[i] = entrada.nextInt();
        }
        //Pedimos el arreglo b
        System.out.println("\nDigite el segundo arreglo: ");
        for(int i=0;i<10;i++)
        {
           //(i+1) sirve para que el usuario sepa en que iterador va el bucle
            System.out.print((i+1)+". Digite un número: ");
            b[i] = entrada.nextInt(); 
        }
        //Ahora vamos a mezclar los 2 arreglos en el arreglo c
        //vamos a  utilizar el iterador i para a y b
        // y el iterador j para el arreglo c
        int j=0;
        for(int i=0;i<10;i++)
        {
            c[j] = a[i]; //Primer elemento del a dentro del arreglo c
            j++; //Cada vez que se le agregue un uevo elemento aumenta
            c[j] = b[i]; //Primer elemento del b dentro de larreglo c
            j++; //Cada vez que se le agregue un uevo elemento aumenta
        }
        //Mostramos el arreglo c
        System.out.print("\n El tercer arreglo es: ");
        for(int i=0;i<20;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}
