package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //POO - Concepto y creación de métodos
    //Una clase tiene Atributos y Métodos
    
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    //Método para pedirle al usuario que nos digite 2 números
    //El metodo es de tipo public, el metodo no va a retornar nada (void), su nombre es leerNumeros y no tiene ningun argumento
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    }
    //Método para sumar 2 números
    public void sumar(){
        suma = numero1+numero2;
    }
    //Método para restar dos números
    public void restar(){
        resta = numero1-numero2;
    }
    //Método para multiplicar dos números
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }
    //Método para dividir dos números
    public void dividir(){
        division = numero1/numero2;
    }
    //Método para mostrar los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multipliacaion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
