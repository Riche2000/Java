package com.mycompany.programa18;

import javax.swing.JOptionPane;

public class Programa18 {

    public static void main(String[] args) {
        //Condicionales, Determinar si un número es múltiplo de 10
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if(numero%10 == 0){
        JOptionPane.showMessageDialog(null, "El número "+numero+" Es múltiplo de l0");
        }
        else{
        JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10");
        }
    }
}
