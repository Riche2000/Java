package com.mycompany.programa43;

import java.util.Scanner;

public class Programa43 {

    public static void main(String[] args) {
        //Arreglos - Promedios en un arreglo
        Scanner entrada = new Scanner(System.in);
        //Arreglo de tipo float
        float numeros[] = new float[5];
        float suma_positivos=0,suma_negativos=0,media_positivos,media_negativos;
        int conteo_positivos=0,conteo_negativos=0,conteo_ceros=0;
        
        System.out.println("Guardnado los números en el arreglo");
        for(int i=0;i<5;i++)
        {
            //El (i+1) es para que el usuario sepa en que numero va
            System.out.print((i+1)+". Digite un número: ");
            //Lo guardamos dentro de larreglo con el iterador
            numeros[i] = entrada.nextFloat();
            //Si el número que el usuario digito es 0
            if(numeros[i] == 0)
            {
                //El conteo de 0 va a eumentar en 1
                conteo_ceros++;
            }
            //Si el número que el usuario digito es mayor a 0 
            else if(numeros[i]>0)
            {
                //Una suma iterativa
                suma_positivos += numeros[i];
                //El conteo de positivos aumenta en 1
                conteo_positivos++;
            }
            //Si el número no es 0 ni es positivo
            else
            {
                //Haacemos una suma iterativa
                suma_negativos += numeros[i];
                //El conteo de negativos aumenta en 1
                conteo_negativos++;
            }
        }
        //Pasara sacar la media necesitamos el conteo y la suma total
        //Media de los números positivos
        if(conteo_positivos == 0) //Si el conteo de los positivos es giual a cero no se pude sacar la media
        {
            System.out.println("No se puede sacar la media de los números positivos");
        }
        else
        {
            media_positivos = suma_positivos/conteo_positivos;
            System.out.println("La media de los números positivos es: "+media_positivos);
        }
        //Media de los números negativos
        if(conteo_negativos == 0)
        {
            System.out.println("No se puede sacar la media de los números negativos");
        }
        else
        {
            media_negativos = suma_negativos/conteo_negativos;
            System.out.println("La media de los números negativos es: "+media_negativos);
        }
        //Contabilizar el núemro de ceros
        System.out.println("La cantdad de ceros es: "+conteo_ceros);
    }
}
