package com.mycompany.programa38;

import javax.swing.JOptionPane;

public class Programa38 {

    public static void main(String[] args) {
        // Ciclos - Pedir 10 números e indicar si hay algún negativo
        int numero;
        boolean hay_negativos = false;
        
        for(int i=1;i<=10;i++) //Se va a repetir 10 veces
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            
            if(numero < 0) //Si el número es negativo
            {
                hay_negativos = true;
            }
        }
        if(hay_negativos == true) //Si hay negativos es igual a verdadero
        {
            System.out.println("Si existe al menos un número negativo");
        }
        else
        {
            System.out.println("No existe ningun número negativo");
        }
    }
}
