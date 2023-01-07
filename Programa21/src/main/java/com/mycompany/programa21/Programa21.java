package com.mycompany.programa21;

import javax.swing.JOptionPane;

public class Programa21 {

    public static void main(String[] args) {
        //Ordenar 3 números de mayor a menor
        int n1,n2,n3;
        
                n1= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
                n2= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
                n3= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
                
                /*Si n1 es mayor a n2 y además numero 2 es mayor a nuemero 3
                   Operador AND && para que sea verdadero ambas partes deben ser verdaderas*/
                if((n1>n2) && (n2>n3))
                {
                    JOptionPane.showMessageDialog(null, "Orden: "+n1+" - "+n2+" - "+n3);
                }
                else if((n1>n3) && (n3>n2))
                {
                    JOptionPane.showMessageDialog(null, "Orden: "+n1+" - "+n3+" - "+n2);
                }
                //En caso de que el númnero mayor sea el número 2
                else if((n2>n1) && (n1>n3))
                {
                    JOptionPane.showMessageDialog(null, "Orden: "+n2+" - "+n1+" - "+n3);
                }
                else if((n2>n3) && (n3>n1))
                {
                    JOptionPane.showMessageDialog(null, "Orden: "+n2+" - "+n3+" - "+n1);
                }
                //En caso de que el número mayor sea el número 3
                else if((n3>n1) && (n1>n2))
                {
                    JOptionPane.showMessageDialog(null, "Orden: "+n3+" - "+n1+" - "+n2);
                }
                //En el caso de que ninguno de los anteriores se cumpla
                else
                {
                    JOptionPane.showMessageDialog(null, "Orden: "+n3+" - "+n2+" - "+n1);
                }
    }
}
