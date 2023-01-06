package com.mycompany.programa7;

import javax.swing.JOptionPane; //Libreria JOptionPane para las ventanas emergentes

public class Programa7 {

    public static void main(String[] args) {
        //Entrada y salida de datos con JOptionPane
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        float flotante;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: "); //Para que salga el recuadro y guarde datos
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: ")); //Convierte toda la cadena a entero
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0); //Guardamos un caracter
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: ")); //Guardamos Double   
        flotante =Float.parseFloat(JOptionPane.showInputDialog("Digite un flotante")); //Guardamos float
        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        JOptionPane.showMessageDialog(null,"El flotante es: "+flotante);
    }
}
