package com.mycompany.programa52;

import javax.swing.JOptionPane;

public class Programa52 {

    public static void main(String[] args) {
        //Búsquedas - Búsqueda secuencial
        
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));
        
        //Busqueda secuencial
        //Para el bucle while tenemos que declarar el iterador fuera
        int i=0;
        //Mientras no hayamos terminado de recorrer todo el arreglo y no hemos encontrado el valor que estabamos buscando
        while(i<5 && band == false)
        {
            //Si el núemro del arreglo es igual al dato que estamos buscando
            if(arreglo[i] == dato)
            {
                band =true;
            }
            i++;
        }
        
        //Si no hemos encontrado el valor
        if(band == false)
        {
            JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo");
        }
        else
        {
            //La posicion i-1 es porque en el i++ le suma una 1 y en el el while hemos avanzado una posicion más
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posicion: "+(i-1));
        }
    }
}
