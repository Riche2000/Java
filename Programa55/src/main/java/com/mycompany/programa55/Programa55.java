package com.mycompany.programa55;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa55 {

    public static void main(String[] args) {
        //Matrices - Determinar si una matriz es simétrica o no
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol;
        boolean simetrica = true;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        //La matriz va a tener el número de filas y columas que el usuario digite
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite una matriz: ");
        //Le pedimos los datos de la matriz
        for(int i=0;i<nFilas;i++) //Número de filas
        {
            for(int j=0;j<nCol;j++)// Número de columnas
            {
                //Para que el usuario sepa en que lugar de la matriz esta digitando los elementos
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Matriz simetrica
        if(nFilas == nCol) //Si el número de filas es igual al número de columnas
        {
            int i,j;
            i=0;
            while(i<nFilas && simetrica==true)
            {
                j=0;
                while(j<i && simetrica==true)
                {
                    if(matriz[i][j]!=matriz[j][i]) //Si algun elemento de la matriz normal y la transpuesta son diferentes
                    {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            //Detectamos si la matriz es simetrica
            if(simetrica==true)
            {
                JOptionPane.showMessageDialog(null, "La matriz es simétrica");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La martiz no es simétrica");
            }    
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
        }
    }
}
