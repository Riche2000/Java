package com.mycompany.programa35;

import javax.swing.JOptionPane;

public class Programa35 {

    public static void main(String[] args) {
        //Ciclos - Promedio de edades, estaturas y conteos
        int edad,sumaEdad=0, conteoMayor18=0,contadorMayor175=0;
        float altura,sumaAltura=0,mediaEdad,mediaAltura;
        
        for(int i=1; i<=5; i++)
        {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+" \nDigite su edad: "));
            altura =     Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+" \nDigite su Estatura: "));        
        
            sumaEdad += edad; //Suma iterativa de edades
            sumaAltura += altura; //Suma iterativa de las alturas
            
            if(edad > 18) //Si detecta que la edad que digito el usuario es mayor a 18 años
            {
                conteoMayor18++; //Si la edad es mayor a 18 el conteo aumenta
            }
            if(altura > 1.75) //Si la altura es mayor a 1.75
            {
                contadorMayor175++; //Si la altura es mayor a 1.75 el contador aumenta
            }
        }
        mediaEdad = (float) sumaEdad/5;
        mediaAltura = (float) sumaAltura/5;
        
        System.out.println("La edad promedio es: "+mediaEdad);
        System.out.println("La estatura promedio es: "+mediaAltura);
        System.out.println("Cantidad de alumnos mayores a 18 años:"+conteoMayor18);
        System.out.println("La cantidad de alumnos que miden más de 1.75: "+contadorMayor175);
    }
}
