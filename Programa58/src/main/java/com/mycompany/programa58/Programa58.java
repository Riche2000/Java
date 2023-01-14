package com.mycompany.programa58;

public class Programa58 {

    public static void main(String[] args) {
        //Matrices - Hacer una matriz marco con 1 y 0
        int matriz[][] = new int[5][5];
        
        //Rellenando la matriz
        for(int i=0;i<5;i++) //Filas
        {
            for(int j=0;j<5;j++) //Columnas
            {   //Si el iterador i es igual a 0 o sea igual a 4 significa que estamos en el marco de las columnas
                if(i==0 || i==4) //Controla los 1 de las columnas
                {
                    matriz[i][j] = 1;
                }
                else if(j==0 || j==4) //Controla los 1 de las filas
                {
                    matriz[i][j] = 1;
                }
                else //Todo lo que no este en el marco de las filas o de las columnas va a ser 0
                {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("La matriz es: \n");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }            
}
