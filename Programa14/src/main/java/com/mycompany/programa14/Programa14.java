package com.mycompany.programa14;

import java.util.Scanner;

public class Programa14 {

    public static void main(String[] args) {
        //Calificación final de un estudiante
        Scanner entrada = new Scanner(System.in);
        
        //Con float se gasta menos memoria
        float participacion,primerExamen,segundoExamen,examenFinal,notaFinal;
        
        //Pedir los datos necesarios
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        
        System.out.println("Digite la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();
        
        System.out.println("Digite la nota del segundo examen parcial: ");
        segundoExamen = entrada.nextFloat();
        
        System.out.println("Digite la nota del examen final");
        examenFinal = entrada.nextFloat();
        
        //Sacamos los calculos
        participacion *= 0.10f; //10%
        primerExamen *= 0.25f; //25%
        segundoExamen *= 0.25f; //25%
        examenFinal *= 0.40f; //40%
        
        //Sacamos las notas
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("La calificacion final es: "+notaFinal);
    }
}
