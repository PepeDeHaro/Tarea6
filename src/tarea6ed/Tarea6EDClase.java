/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author Jose
 */
public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos){     double TotalRefactor;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            TotalRefactor = precioProducto*descuento_menor;
            Imprime(TotalRefactor);
        }else {
            TotalRefactor = precioProducto*descuento_mayor;
            Imprime(TotalRefactor);
        }   

    }
    private static final double descuento_mayor = 0.95;
    private static final double descuento_menor = 0.8;

    private void Imprime(double TotalRefactor) {
        System.out.println("El total a pagar es:"+TotalRefactor);
        System.out.println("Enviado");
    }
}

