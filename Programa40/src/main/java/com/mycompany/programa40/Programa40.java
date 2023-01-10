package com.mycompany.programa40;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa40 {

    public static void main(String[] args) {
        //Arreglos - Llenar un arreglo
        Scanner entrada = new Scanner(System.in); //Guardamos todos los caracteres que vaya digitando
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        
        char[] letras = new char[nElementos]; //Tenemos un arreglo de tipo caracter con números de elementos que establezca el usuario
        System.out.println("Digite los elementos del arreglo: ");
        
        for(int i=0;i<nElementos;i++)
        {
            System.out.println((i+1)+" Digite un caracter: "); //le ponemos i+1 para contabilizar en que caracter vamos
            letras[i] =entrada.next().charAt(0); //El charAt(0) es para que guarde el primer caracter que encuentre
        }
        
        System.out.println("\nLos caracteres del arreglo son: ");
        for(int i=0;i<nElementos;i++) //Inicializamos en 0 hasta que sea menor al número de elementos que el usuario ha digitado
        {
            System.out.print(letras[i]+" "); //imprimimos el arreglo letras con el iterador i
        }
    }
}

