/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_7 {
      public void calcularCompra() {
        Scanner sc = new Scanner(System.in);

        final double PRECIO_ALIMENTOS = 5.00;
        final double PRECIO_VESTIMENTA = 20.00;
        final double PRECIO_ELECTRONICOS = 100.00;

        // Descuentos
        final double DESCUENTO_ALIMENTOS = 0.10; // 10%
        final double DESCUENTO_VESTIMENTA = 0.05; // 5%

        double totalSinDescuento = 0;
        double totalConDescuento = 0;

        boolean continuar = true;

        System.out.println(" Bienvenido a la tienda. Puede agregar varios productos a su compra.");

        while (continuar) {
            System.out.println("\nTipos de productos disponibles:");
            System.out.println("A - Alimentos (10% de descuento)");
            System.out.println("V - Vestimenta (5% de descuento)");
            System.out.println("E - Electrónicos (Sin descuento)");
            System.out.print("Ingrese el tipo de producto que desea comprar (A, V, E): ");
            char tipoProducto = sc.next().toUpperCase().charAt(0); 

            System.out.print("Ingrese la cantidad de unidades a comprar: ");
            int cantidad = sc.nextInt();

            if (cantidad <= 0) {
                System.out.println("❌ Error: La cantidad debe ser un número positivo.");
                continue; 
            }

            double precioBase = 0;
            double descuento = 0;

            switch (tipoProducto) {
                case 'A':
                    precioBase = PRECIO_ALIMENTOS;
                    descuento = DESCUENTO_ALIMENTOS;
                    break;
                case 'V':
                    precioBase = PRECIO_VESTIMENTA;
                    descuento = DESCUENTO_VESTIMENTA;
                    break;
                case 'E':
                    precioBase = PRECIO_ELECTRONICOS;
                    descuento = 0;
                    break;
                default:
                    System.out.println(" Error: Tipo de producto inválido.");
                    continue; 
            }

            double subtotal = cantidad * precioBase;
            double montoDescuento = subtotal * descuento;
            double totalProducto = subtotal - montoDescuento;

            totalSinDescuento += subtotal;
            totalConDescuento += totalProducto;

            System.out.println("\n Producto agregado correctamente.");
            System.out.printf("Subtotal: $%.2f\n", subtotal);
            System.out.printf("Descuento aplicado: $%.2f\n", montoDescuento);
            System.out.printf("Total por este producto: $%.2f\n", totalProducto);

            System.out.print("\n¿Desea agregar otro producto? (S/N): ");
            char respuesta = sc.next().toUpperCase().charAt(0);
            if (respuesta != 'S') {
                continuar = false;
            }
        }

        System.out.println("\n Factura Final:");
        System.out.println("--------------------------------------------------");
        System.out.printf("Total sin descuento: $%.2f\n", totalSinDescuento);
        System.out.printf("Total con descuentos aplicados: $%.2f\n", totalConDescuento);
        System.out.println("--------------------------------------------------");
        System.out.println("¡Gracias por su compra! ");
    }
}
