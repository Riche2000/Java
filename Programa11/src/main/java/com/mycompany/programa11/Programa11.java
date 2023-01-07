package com.mycompany.programa11;

import java.util.Scanner;

class Programa11 {

    public static void main(String[] args) {
        //CLASE MATH
        
        //La RAIZ de un número
        double raiz = Math.sqrt(36.67); //Sacar la raiz cuadrada de un número
        //La raiz de un número entero
        int raiz1 = (int)Math.sqrt(9); //Lo transforma a entero y lo guarda dentro de una variable entera
        
        //LA ELEVACION DE UN NUMERO A CIERTA POTENCIA
        double base = 4, exponente = 3;
        double resultado = Math.pow(base, exponente);
        
        //REDONDEAR
        double numero = 4.56;
        long resultadord = Math.round(numero);
        
        float numero1 = 7.89f;
        int resultadorf = Math.round(numero1);
        
        //RANDOM
        double numeroran = Math.random();
        
        
        System.out.println(raiz);
        System.out.println(raiz1);
        
        System.out.println(resultado);
        
        System.out.println(resultadord);
        
        System.out.println(resultadorf);
        
        System.out.println(numeroran);
    }
}
