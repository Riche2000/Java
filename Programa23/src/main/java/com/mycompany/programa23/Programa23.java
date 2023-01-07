package com.mycompany.programa23;

import javax.swing.JOptionPane;

public class Programa23 {

    public static void main(String[] args) {
        //Calculadora aritmética
        int numero1,numero2,suma,resta,mul,div;
        char operacion;
        
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar: ").charAt(0);
        
        switch(operacion)
        {
           case's':
           case'S': suma = numero1+numero2;
               JOptionPane.showMessageDialog(null, "La suma es: "+suma);
               break;
           case 'r':
           case 'R': resta = numero1-numero2;
               JOptionPane.showMessageDialog(null, "La resta es: "+resta);
               break;
           case 'p':
           case 'P':
           case 'M':
           case 'm': mul = numero1*numero2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: "+mul);
                break;
           case 'd':
           case 'D': div = numero1/numero2;
                JOptionPane.showMessageDialog(null, "La divisiones: "+div);
                break;
           default: JOptionPane.showMessageDialog(null, "Error, se equivoco de operacion");
           break;
        }
    }
}
