/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_7 {

    public static void main(String[] args){
        Scanner tienda = new Scanner(System.in);
         double precioA = 50.0; 
        double precioV = 30.0; 
        double precioE = 100.0; 
        
    double totalA = 0.0; 
        double totalV = 0.0; 
        double totalE = 0.0; 
        double totalCompra = 0.0; 
        String respuesta = null;
        
        do {
            System.out.print("Ingrese el tipo de producto que desea comprar (A: Alimentos, V: Vestimenta, E: Electrónicos): ");
            char tipoProducto = tienda.next().toUpperCase().charAt(0);

            System.out.print("Ingrese la cantidad de unidades: ");
            int cantidad = tienda.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser un número positivo.");
            } else {
                double costoConDescuento = 0.0;
                double descuento = 0.0;

                switch (tipoProducto) {
                    case 'A': 
                        costoConDescuento = precioA * cantidad;
                        descuento = 0.10; 
                        costoConDescuento = costoConDescuento * (1 - descuento);
                        totalA += costoConDescuento;
                        break;
                    case 'V': 
                        costoConDescuento = precioV * cantidad;
                        descuento = 0.05; 
                        costoConDescuento = costoConDescuento * (1 - descuento);
                        totalV += costoConDescuento;
                        break;
                    case 'E': 
                        costoConDescuento = precioE * cantidad;
                        descuento = 0.0; 
                        totalE += costoConDescuento;
                        break;
                    default:
                        System.out.println("Producto no válido.");
                        continue;
                }
                totalCompra += costoConDescuento;
            }

            System.out.print("¿Desea agregar más productos a su compra? (s/n): ");
            respuesta = tienda.next();
            
        } while (respuesta.equalsIgnoreCase("s"));
        
        // Mostrar el desglose de la compra
        System.out.println("Total de productos A (Alimentos): " + totalA + " unidades monetarias.");
        System.out.println("Total de productos V (Vestimenta): " + totalV + " unidades monetarias.");
        System.out.println("Total de productos E (Electrónicos): " + totalE + " unidades monetarias.");

        System.out.print("¿Desea finalizar la compra? (s/n): ");
        String finalizarCompra = tienda.next();
        
        if (finalizarCompra.equalsIgnoreCase("s")) {
            System.out.println("El total de su compra es: " + totalCompra );
            System.out.println("Gracias por su compra. ¡Hasta pronto!");
        } else {
            System.out.println("Programa terminado. ¡Adiós!");
        }

        tienda.close();
    }
}
           
          
     
