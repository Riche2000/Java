package com.mycompany.programa56;

import java.util.Scanner;

public class Programa56 {

    public static void main(String[] args) {
        //Matrices - Hallar la matriz transpuesta
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        System.out.println("Digite la matriz");
        //Pedimos los elementos
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Imprimimos los elementos de la matriz
        System.out.println("\nMatriz original: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Transponiendo la matriz
        int aux;
        for(int i=0;i<3;i++) //Filas 
        {
            for(int j=0;j<i;j++) //Columnas
            {
                //Hacemos un cambio de la matriz normal a la transpuesta
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        //Imprimimos la matriz transpuesta
        System.out.println("\nLa matriz transpuesta es: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
