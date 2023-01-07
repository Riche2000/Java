package com.mycompany.programa22;

import javax.swing.JOptionPane;

public class Programa22 {

    public static void main(String[] args) {
        //Determinar si una fecha es correcta
        int  dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        //Si el dia es de 1 a 30
        if((dia>=1) && (dia<=30)) //Si el día es correcto
        {
            if((mes>=1) && (mes<=12)) //El mes comienza desde 1 y debe llegar hasta 12
            {
                if(año !=0) //Si año diferente de 0 
                {
                    JOptionPane.showMessageDialog(null, "La fecha correcta");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta, año incorrecto");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta, mes incorrecto");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, día incorrecto");
        }
    }
}
