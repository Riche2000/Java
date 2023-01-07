package com.mycompany.programa17;

import javax.swing.JOptionPane;

public class Programa17 {

    public static void main(String[] args) {
        //Condicionales, La sentencia switch
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
            break;
            case 2: JOptionPane.showMessageDialog(null, "Es el número 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "El número es 3");
            break;
            case 4: JOptionPane.showMessageDialog(null, "El número es 4");
            break;
            case 5: JOptionPane.showMessageDialog(null, "El número es 5");
            break;
            default: JOptionPane.showMessageDialog(null,"El número no esta en el rango de 1 a 5"); //Si no se cumple ninguno de los casos
        }
    }
}
