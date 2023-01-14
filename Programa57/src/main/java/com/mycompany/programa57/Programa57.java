package com.mycompany.programa57;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa57 {

    public static void main(String[] args) {
        //Matrices - Sumar cada fila y columna de una matriz
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol,sumaFilas,sumaCol;
        
        //le pedimos al uisuario cual sera el número de filas
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        //le pedimos al uisuario cual sera el número de columnas
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        //Definimos la matriz
        matriz = new int[nFilas][nCol];
        //Le pedimos los elementos de la matriz
        System.out.println("Digite la matriz");
        for(int i=0;i<nFilas;i++)
        {
            for(int j=0;j<nCol;j++)
            {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Mostramos la matriz que el usuario digito
        System.out.println("\nLa matriz es: ");
        for(int i=0;i<nFilas;i++)
        {
            for(int j=0;j<nCol;j++)
            {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        //Ahora procedemos a sumar las filas
        for(int i=0;i<nFilas;i++)
        {
            sumaFilas = 0;
            for(int j=0;j<nCol;j++)
            {
                //Suma iterativa de todos los elementos de la matriz
                sumaFilas +=matriz[i][j]; 
            }
            System.out.print("\nLa suma de la fila ["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
        
        //Sumamos las columnas
        for(int j=0;j<nCol;j++)
        {
            sumaCol = 0;
            for(int i=0;i<nFilas;i++)
            {
                sumaCol += matriz[i][j];
            }
            System.out.print("\nLa suma de la columna ["+j+"] es: "+sumaCol);
        }
        System.out.println("");
    }
}
