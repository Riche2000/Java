package com.mycompany.programa12;

import java.util.Scanner;

public class Programa12 {

    public static void main(String[] args) {
        //Calcular la suma de 3 calificaciones
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        
        System.out.println("Digita 3 Calificacioens: ");
        
        //Guardamos las 3 calificaciones
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3; //Sumamos las 3 notas
        
        System.out.println("\n El resultado de la suma es: "+suma); // el \n da un salto de linea 
    }
}
