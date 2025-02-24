/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_28 {
        public void procesoVentas() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos productos has vendido? ");
        int cantidadVentas = sc.nextInt();
        sc.nextLine(); 

        String[] productos = new String[cantidadVentas];
        double[] precios = new double[cantidadVentas];
        int[] cantidades = new int[cantidadVentas];
        double totalVentas = 0;

        for (int i = 0; i < cantidadVentas; i++) {
            System.out.println("\nVenta " + (i + 1));

            System.out.print("Ingrese el nombre del producto: ");
            productos[i] = sc.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Error: Por favor, ingrese un precio válido.");
                sc.next(); 
                System.out.print("Ingrese el precio del producto: ");
            }
            precios[i] = sc.nextDouble();
            sc.nextLine(); 

            System.out.print("Ingrese la cantidad vendida: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Por favor, ingrese una cantidad válida.");
                sc.next(); 
                System.out.print("Ingrese la cantidad vendida: ");
            }
            cantidades[i] = sc.nextInt();
            sc.nextLine(); 

            totalVentas += precios[i] * cantidades[i];
        }

        System.out.println("\nResumen de ventas:");

        for (int i = 0; i < cantidadVentas; i++) {
            System.out.println("Producto: " + productos[i] + " | Precio: $" + precios[i] + " | Cantidad: " + cantidades[i] + " | Total: $" + (precios[i] * cantidades[i]));
        }

        System.out.println("\nEl total de ventas es: $" + totalVentas);
    }
}
