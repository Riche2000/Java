package com.mycompany.programa26;

import java.util.Scanner;

public class Programa26 {

    public static void main(String[] args) {
        //Ciclo do while
        Scanner entrada = new Scanner(System.in);
        int i=1,contador;
        
        System.out.println("Digite la cantidad de terminos: ");
        contador = entrada.nextInt();   //Lo guardamos dentro de contador
        
        do //Evalua
        {
            System.out.println(i);
            //i++; //Aumentamos  la i de 1 en 1
            i+=3; //Podemos hacer que vaya de 3 en 3 
        }
        //Ejecuta la condicion
        while(i<=contador); //Esta condicion se va a cumplir ciempre y cuando i sea menor o igual al contador
    }
}
