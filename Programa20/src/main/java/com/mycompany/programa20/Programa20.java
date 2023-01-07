package com.mycompany.programa20;

import javax.swing.JOptionPane;

public class Programa20 {

    public static void main(String[] args) {
        //Salario semanal de un obrero
        int horasTrabajadas;
        float salarioTotal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de horas trabajadas"));
        
        if (horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
        }
        else{                           //horas extras
            salarioTotal = (40*16) + ((horasTrabajadas-40) * 20);
        }
        
        JOptionPane.showMessageDialog(null, "El salario total es: "+ salarioTotal+ " Dolares");
    }
}
