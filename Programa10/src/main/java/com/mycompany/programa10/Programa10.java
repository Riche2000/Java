package com.mycompany.programa10;

public class Programa10 {

    public static void main(String[] args) {
        //OPERADORES DE INCREMENTO Y DECREMENTO
        
        //x++; incremento Esto equivale a x = x + 1;
        //x--;  Decremento Esto equivale a x = x - 1;
        
        int x = 5, y;
        
        // y = x++; Primero asigna a y despues aumenta x+1
        y = ++x; //Incrementa el valor de x 1 y despues se lo asigna a y 
        
        System.out.println(y);
    }
}
