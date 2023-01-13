package com.mycompany.programa54;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa54 {

    public static void main(String[] args) {
        //Matrices - Definición de matriz con datos del usuario
        
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        //Definimos la matriz
        matriz = new int[nFilas][nCol];
        
        //Le pedimos todos los elementos al usuario
        System.out.println("Digite la matriz: ");
        for(int i=0;i<nFilas;i++) //Número de filas
        {
            for(int j=0;j<nCol;j++)//Número de columnas
            {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es:");
        
        for(int i=0;i<nFilas;i++) //Numero de filas
        {
            for(int j=0;j<nCol;j++)//Numero de columnas
            {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
