package com.mycompany.programa34;

import javax.swing.JOptionPane;

public class Programa34 {

    public static void main(String[] args) {
       //Ciclos - Media de positivos, negativos y conteo de ceros 
       int numero,suma_pos=0,conteo_pos=0,suma_neg=0,conteo_neg=0,conteo_ceros=0;
       float media_pos,media_neg;

       for(int i=1;i<=10;i++)
       {
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
           if(numero == 0) //Si el número es 0
           {
               conteo_ceros++; //Aumentamo en 1 el conteo de 0 
           }
           else if(numero>0) //Si el numero es positivo
           {
               suma_pos += numero; //Suma iterativa de positivos
               conteo_pos++;
           }
           else //Si el numero no es 0 y no es positivo osea es un número negativo
           {
               suma_neg += numero; //Suma iterativa de los números negativos
               conteo_neg++;
           }
       }
       //Tratamos con la media de los positivos
       if(conteo_pos == 0)//Si no hay positivos
       {
            System.out.println("No se puede sacar la media de los positivos");
       }
       else //Si, si hay números positivos
       {
           media_pos = (float) suma_pos/conteo_pos;//Nos da un dato flotante
           System.out.println("La medio de los números positivos es: "+media_pos);
       }
       //Tratamos con la media de los negativos
       if (conteo_neg == 0)
       {
           System.out.println("No se puede sacar la media de los negativos");
       }
       else
       {
           media_neg = (float) suma_neg/ conteo_neg;
           System.out.println("La media de los negativos es: "+media_neg);
       }
        System.out.println("La cantidad de ceros es: "+conteo_ceros);
    }
}