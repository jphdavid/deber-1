/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class ejercicio5 {

        /*
    Igrese el precio de un articulo y su respectivo descuento(expresado en %).
    Muestre el precio total a pagar cnsiderando el descuento y el IGV respectivos(IGV: impuesto general a las ventas = 19%)
    
    */
    public static void main(String[] args) {
        
        double precio, descuento, precioTotal;
        
        precio=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRECIO DEL ARTICULO : "));
        descuento=Double.parseDouble(JOptionPane.showInputDialog("ingrese el descuento en %: "));
        
        precioTotal= (precio - (precio*descuento)/100)*1.19;
        
        JOptionPane.showMessageDialog(null, "el precio total a pagar es : "+ precioTotal);
        
}
}