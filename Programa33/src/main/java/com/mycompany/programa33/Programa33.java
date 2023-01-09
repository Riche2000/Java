package com.mycompany.programa33;

public class Programa33 {

    public static void main(String[] args) {
        //Ciclos - Producto de los 10 primeros números impares
        long producto = 1;//Long es una variable de tipo entera pero con bastante espacio
        
        for(int i=1; i<=20; i+=2)
        {
            producto *= i;
        }
        System.out.println("El producto es: "+producto);
    }
}
