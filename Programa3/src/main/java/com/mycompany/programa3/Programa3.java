package com.mycompany.programa3;

public class Programa3 {

    public static void main(String[] args) {
        //Variables 
        //Una variable es un espacio de memoria donde tu alamcenas un valor
        
        //ENTEROS
        //byte 8 bits de memoria puede usar los datos desde -128 hasta 127
        byte entero = 12; //Le asignamos el valor 12 a la variable entero
        //short 16 bits de memoria puede usar -32,768 hasta 32,767
        short entero1 = 12456;
        //int 32 bits de memoria puede usar -2,147,483,648 hasta 2,147,483,647 
        int entero2 = 1245656;
        //long 64 bits de memoria puede usar -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807
        long entero3 = 1245656215;
        
        //DECIMAL
        //float 64 bits de memoria puede usar 4.9e-324 a 1.8e+308
        float decimal = 3.45f; //Le tienes que poner una f despues del número para indicarle a la maquina que es un float
        //double 32 bits de memoria puede usar 1.4e-0.45 a 3.4e+038
        double decima2 = 3.345465412; //Con el double no hay necesidad de poner la f
        
        //CARACTER
        //char es para tipo caracterers Todo lo que encuentres en tu teclado es un caracter
        char caracter = 'a';
        char caracter1 = '4';
        
        //BOOLEANO
        //Puede ser true o false se usa en condicionales
        boolean decision1 = true;
        boolean decision2 = false;
        
        System.out.println("Número entero: "+entero);
        System.out.println("Número entero: "+entero1);
        System.out.println("Número entero: "+entero2);
        System.out.println("Número entero: "+entero3);
        
        System.out.println("Número decimal: "+decimal);
        System.out.println("Número decimal: "+decima2);
        
        System.out.println("El caracter es: "+caracter);
        System.out.println("El caracter es: "+caracter1);
        
        System.out.println("La decision es: "+decision1);
        System.out.println("La decision es: "+decision2);
    }
}
