package com.mycompany.programa39;

public class Programa39 {

    public static void main(String[] args) {
        /*Arreglos - Definición de Arreglos
          Arreglo es una conexion de datos del mismo tipo, en un arreglo se pueden almacenar muchos datos del mismo tipo
          Arreglo unidimensional    Tipo_de_vatiable[] Nombre_del_array = new Tipo_de_variable[dimension]; 
          La dimension se trata de cuantos valores va a tener el arreglo. En un arreglo las posiciones siempre empiezan desde 0 */
        int [] numeros = new int [3]; //Este arreglo de tipo entero llamado numeros tiene 3 elementos de tipo entero
        
        numeros[0] = 7; //Mi arreglo numeros en la posicion 0 va a tener el número 7
        numeros[1] = 10;
        numeros[2] = 13;
        
        //System.out.println(numeros[0]); //Imprimios el arreglo numeros en su posicion 0
        //System.out.println(numeros[2]); //Imprimios el arreglo numeros en su posicion 2
        
        //Imprimir todo el arreglo
        for(int i=0;i<3;i++)//Utilizando bucles debe ser inicializado en 0 y termina en la posicion final del arreglo
        {
            System.out.println(numeros[i]); //Ponemos el arreglo y adentro el iterador
        }      
    }
}
