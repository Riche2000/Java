package com.mycompany.programa37;

import javax.swing.JOptionPane;

public class Programa37 {

    public static void main(String[] args) {
        //Ciclos - Contar alumnos aprobados, suspensos y condicionados
        float nota;
        int aprobados=0,condicionados=0,suspensos=0;
        
        //Pedimos 6 notas desde un bucle
        for(int i=1;i<=6;i++)
        {
            do
            {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10: "));
            }while(nota<0 || nota>10); //Mientras la nota sea menor a 0 o la nota sea mayor a 10
             
            if(nota == 4) //Si nota es igual a 4 los condicionados de alumnos aumenta
            {
                condicionados++;
            }  
            else if(nota>=5) //Si la nota es mayor o igual a 5 los aprobados aumentan
            {
                aprobados++;
            }
            else    //Si no se cumple la nota igual a 4 o la nota sea de 5 hacia arriba los suspensos aumenta
            {
                suspensos++;
            }
        }  
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("Cantidad de condicionados: "+condicionados);
        System.out.println("Cantidad de suspensos o reprobados: "+suspensos);
    }
}
