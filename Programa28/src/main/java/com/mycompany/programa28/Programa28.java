package com.mycompany.programa28;

import javax.swing.JOptionPane;

public class Programa28 {

    public static void main(String[] args) {
        //Ciclos - cuadrado de números
        int numero,cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero >= 0) //Mientras el numero sea 0 o positivo
        {
            cuadrado = (int)Math.pow(numero, 2); //Pasamos de double a entero con (int)
            
            JOptionPane.showMessageDialog(null, "El numero "+numero+" elevando al cuadrado es: "+cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));

        }//Una vez digites un número negativo el programa se cierra
    
    }
}
