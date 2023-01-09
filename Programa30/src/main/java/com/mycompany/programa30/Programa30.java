package com.mycompany.programa30;

import javax.swing.JOptionPane;

public class Programa30 {

    public static void main(String[] args) {
        //Ciclos - Adivinar un número aleatorio
        int numero,aleatorio,contador = 0;
        
        //Math.random genera un número aleatorio entre 0 y 1
        aleatorio = (int)(Math.random()*100); //Convertimos el resultado a entero con (int) y ahora genera un número aleatorio entre 0 y 100
        
        do
        {
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 0- 100: ")); 
          if(aleatorio > numero) //Si el numero aleatorio es mayor al número del usuario
          {
              System.out.println("Digite un número mayor");
          }
          else
          {
              System.out.println("Digite un número menor");
          }
          contador++; //Aumentamos en 1 el contador cada vez que el usuario digite un núevo número
        }
        while(numero != aleatorio); //Lo anterior se repitira mientras número sea diferente de aleatorio
        {
            System.out.println("\n ¡Genial! Adivinaste el número en el intento: "+contador);
        }
    }
}
