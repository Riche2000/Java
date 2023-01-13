package com.mycompany.programa53;

public class Programa53 {

    public static void main(String[] args) {
        //Matrices - Definición de matriz 
        //Son arreglos bidimencionales osea tienen 2 dimensiones
        //Las matrizes tienen 2[][] corchetes, mientras que los arreglos solo tienen 1[]
        //POnemos entre llaves el número de filas que va a tener ejemplo {{},{},{}} y luego las columnas que va a tener cada fila ejemplo {{1,2,3},{4,5,6},{7,8,9}}
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        //Imprimios la matriz que acabamos de rellenar
        //El primer for es para el número de filas en este casto tenemos 3 filas
        for(int i=0;i<3;i++)
        {   //El segundo for es para el número de columnas
            for(int j=0;j<3;j++)
            {
                //i Son las filas y j Son las columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
    }
}
