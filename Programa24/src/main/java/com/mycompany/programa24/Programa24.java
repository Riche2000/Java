package com.mycompany.programa24;

import javax.swing.JOptionPane;

public class Programa24 {

    public static void main(String[] args) {
        //Cajero automático con menú
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso,saldoActual,retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico \n"
        +"1. Ingresar dinero a la cuenta\n"
        +"2. Retirar dinero de la cuenta\n"
        +"3. Salir"));
        
        switch(opcion)
        {
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta:"));
                saldoActual = saldo_inicial+ingreso;
                JOptionPane.showMessageDialog(null, "Su saldo actual es: "+saldoActual);
            break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));
                if(retiro>saldo_inicial) //Si tiene menos dinero de lo que tiene como saldo
                {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro");
                }
                else
                {
                    saldoActual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
                }
            break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null, "Su opcion no es valida"); break;
        }         
    }
}
