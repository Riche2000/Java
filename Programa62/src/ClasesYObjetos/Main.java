package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        //Le pedimos al usuario que digite los números
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        //Creamos un objeto
        //Clase  nombre objeto
        Operacion op = new Operacion();
        //Sumamos 2 numeros
        //Nos entrega un resultado 
                                //Argumentos
        int suma = op.sumar(n1, n2);
        //Resta
                                  //Argumentos
        int resta = op.restar(n1, n2);
        //Multiplicar
                                   //Argumentos
        int mult = op.multiplicar(n1, n2);
        //Dividir
                                //Argumentos
        int div = op.dividir(n1, n2);
        
        //Mostramos los resultados
                                     //Argumentos
        op.mostrarResultados(suma, resta, mult, div);
        
        //Igualemnet podemos imprimir los resultados de la siguiente manera:
        //System.out.println("La suma es: "+op.sumar(n1, n2));
    }
    
}
