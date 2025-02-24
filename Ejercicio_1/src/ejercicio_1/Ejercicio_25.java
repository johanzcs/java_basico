/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_25 {
    
public void realizarCompra() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos productos desea agregar a su carrito? ");
        int cantidadProductos = sc.nextInt();
        sc.nextLine(); 

        String resumenProductos = "";
        double totalCompra = 0;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("\nProducto " + i);

            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = sc.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Error: Ingrese un precio válido.");
                sc.next(); 
            }
            double precioProducto = sc.nextDouble();
            sc.nextLine(); 

            resumenProductos += "Producto: " + nombreProducto + " | Precio: $" + precioProducto + "\n";
            totalCompra += precioProducto; 
        }

        System.out.println("\nResumen de su compra:");
        if (resumenProductos.isEmpty()) {
            System.out.println("No se ha agregado ningún producto.");
        } else {
            System.out.println(resumenProductos);
            System.out.println("Total de la compra: $" + totalCompra);
        }
    }

}
