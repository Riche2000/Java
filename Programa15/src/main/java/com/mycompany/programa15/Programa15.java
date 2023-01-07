package com.mycompany.programa15;

import java.util.Scanner;

public class Programa15 {

    public static void main(String[] args) {
        //Calcular semanas, días y horas
        Scanner entrada = new Scanner(System.in);
        int horasTotales,semanas,dias,horas;
        System.out.println("Digite el número de horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println("\n El equivalente es: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
    }
}
