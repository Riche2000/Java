package com.mycompany.programa19;

import javax.swing.JOptionPane;

public class Programa19 {

    public static void main(String[] args) {
        //Determinar si una letra es mayúscula o no
        char letra;
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0); //Lo convertimos en caracter
        
        if(Character.isUpperCase(letra))//El metodo isUpperCase nos ayuda a comprobar la mayuscula y nos regresa un true o un false
        {
        JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else{
        JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
}
