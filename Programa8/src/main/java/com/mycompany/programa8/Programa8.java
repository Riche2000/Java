package com.mycompany.programa8;

import java.util.Scanner;   //Libreria para guardar datos desde la consola

public class Programa8 {

    public static void main(String[] args) {
        //OPERADORES
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,suma,resta,mult,div,resto;
        
        System.out.println("Digite dos números: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2; //Gracias a l operador de asignacion que es el = se guarda en la variable suma
        resta = numero1 - numero2;
        mult = numero1*numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2; //% Divide numero1 y numero2 y saca el residuo de la division
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La division es}: "+div);
        System.out.println("El residuo es: "+resto);
    }
}
