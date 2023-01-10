package com.mycompany.programa36;

import javax.swing.JOptionPane;

public class Programa36 {

    public static void main(String[] args) {
        //Ciclos - Resumen de ventas de una empresa
        //Los conteos se inicializan en 0
        int codigo,litros,litrosArticulo1=0,conteoMas600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
        
        for(int i=1;i<=5;i++)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo Numero: "+i+"\nDigite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo Numero: "+i+"\nDigite la cantidad en litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo Numero: "+i+"\nDigite el precio por litro: "));
            
            importeFactura = (float) litros * precioLitro; //Importe por factura
            facturacionTotal += importeFactura; //Suma iterativa de lasfacturas
            
            if(codigo==1)
            {
                litrosArticulo1 += litros;
            }
            if(importeFactura > 600)
            {
                conteoMas600++;
            }
        }   
        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
    }
}
