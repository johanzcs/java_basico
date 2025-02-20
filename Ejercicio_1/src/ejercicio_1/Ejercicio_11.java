/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_11 {
     public void menuRestaurante() {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        String opcion;

        System.out.println("️ Bienvenido al Restaurante ️");

        do {
            System.out.println("\nMenú:");
            System.out.println("1 - Hamburguesa ($15.000)");
            System.out.println("2 - Pizza ($8.000)");
            System.out.println("3 - Ensalada ($4.500)");
            System.out.println("4 - Bebida ($2.000)");
            System.out.println("0 - Finalizar pedido");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    total += 15000;
                    System.out.println(" Agregaste una Hamburguesa.");
                    break;
                case "2":
                    total += 8000;
                    System.out.println("Agregaste una Pizza.");
                    break;
                case "3":
                    total += 4500;
                    System.out.println(" Agregaste una  Ensalada.");
                    break;
                case "4":
                    total += 2000;
                    System.out.println(" Agregaste una  Bebida.");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("️ Opción no válida. Inténtalo de nuevo.");
            }

        } while (!opcion.equals("0"));

        System.out.println("\n Total antes de descuento: $" + total);

        System.out.println("\nMétodos de pago:");
        System.out.println("1 - Efectivo (10 por ciento de descuento)");
        System.out.println("2 - Tarjeta de crédito (5 por ciento de descuento)");
        System.out.println("3 - Cheque (sin descuento)");
        System.out.print("Seleccione su método de pago: ");
        String metodoPago = sc.nextLine();

        switch (metodoPago) {
            case "1":
                total *= 0.90;
                System.out.println(" Pagando con efectivo. Descuento del 10% aplicado.");
                break;
            case "2":
                total *= 0.95;
                System.out.println(" Pagando con tarjeta. Descuento del 5% aplicado.");
                break;
            case "3":
                System.out.println(" Pagando con cheque. No se aplica descuento.");
                break;
            default:
                System.out.println("️ Método de pago no válido. Se mantiene el precio original.");
        }

        System.out.println("\n Total a pagar: $" + total);
        System.out.println(" Gracias por su compra. ¡Disfrute su comida! ️");
    }
}
