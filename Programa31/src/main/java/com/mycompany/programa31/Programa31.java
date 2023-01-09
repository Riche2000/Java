package com.mycompany.programa31;

import javax.swing.JOptionPane;

public class Programa31 {

    public static void main(String[] args) {
        //Ciclos - Calcular el promedio de N números
        int numero,elementos = 0, suma = 0 ;
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        while(numero >= 0)//Mientras número sea mayor o igual a 0
        {
            suma += numero; //Hacemos una suma iterativa
            elementos++; //Cada vez que se cumpla esta condicion a elementos le sumamos 1
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        //Sacamos la media
        if(elementos == 0) //Si elementos es igual a 0 entonces la divison no existe
        {
            System.out.println("¡Error! La division entre 0 no existe");
        }
        else
        {
            media = (float) suma/elementos;//Sacamos la media y convertimos a float
            System.out.println("La media es: "+media);
        }
    }
}
