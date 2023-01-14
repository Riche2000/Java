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
                     //Argumentos
        op.sumar(n1, n2);
        //Resta
                        //Argumentos
        op.restar(n1, n2);
        //Multiplicar
                            //Argumentos
        op.multiplicar(n1, n2);
        //Dividir
                        //Argumentos
        op.dividir(n1, n2);
        
        //Mostramos los resultados
        op.mostrarResultados();
    }
    
}
