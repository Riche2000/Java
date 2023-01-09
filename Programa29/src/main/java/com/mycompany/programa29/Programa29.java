package com.mycompany.programa29;

import javax.swing.JOptionPane;

public class Programa29 {

    public static void main(String[] args) {
        //Ciclos  - Números pares e impares
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero != 0) //Mientras el numero sea distinto de 0 corre
        {
            if(numero %2 == 0) //Si el número es par
            {
                System.out.println("El número "+numero+" es PAR");
            }
            else
            {
                System.out.println("El número "+numero+" es IMPAR");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
    }
}
