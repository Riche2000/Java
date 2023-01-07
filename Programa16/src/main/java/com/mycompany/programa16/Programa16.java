package com.mycompany.programa16;

import javax.swing.JOptionPane; //Libreria para ventanas

public class Programa16 {

    public static void main(String[] args) {
        //Condicionales, La sentencia if else
        int numero, dato=5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));
        
        //Operador de igualdad == , operador de desigualdad o distinto !=
        if(numero == dato) //Si el número es igual a 5
        {
            JOptionPane.showMessageDialog(null,"El número es 5");
        }
        else //Si el número no es igual a 5
        {
            JOptionPane.showMessageDialog(null, "El número es diferente de 5");          
        }
        
    }
}
