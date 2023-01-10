package com.mycompany.programa41;

public class Programa41 {

    public static void main(String[] args) {
        /*Arreglos - Bucle for each
          Nos sirve para mostrar todo el contenido que puede tener un arreglo pero de una manera más sencilla y más rapida
          Creamos un arreglo de tipo String.*/
        String[] nombres = {"Ricardo","Alejandro","Luis","Maria","Jorge","Falcon","Roberto","Flor","Jessica"};
        
        //for(int i=0;i<6;i++) //Creamos un bucle for
        //Cuando no sabemso cuantos elementos hay en un arreglo ponemos el nombre del arreglo y el metodo length lo cual nos imprime l longitud o el numero de elementos que tiene el arreglo
        //.length se usa cuando no se sabe cuantos elementos hay en el arreglo
        /*for(int i=0;i<nombres.length;i++)
        {
            System.out.println(nombres[i]); //Nos imprime todos los nombres que hay dentro de mi arreglo
        }*/
        
        //for each
        //for(Tipo_de_dato_igual_que_el_del_arreglo nombre:nombre_del_arreglo)
        for(String i:nombres)
        {
            System.out.println("Nombre: "+i);
        }
    }
}
