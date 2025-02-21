/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_23 {
     public void registrarVentas() {
        Scanner sc = new Scanner(System.in);
        String resumenVentas = "";
        double totalVentas = 0;
        String producto;
        double precio;
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del producto vendido: ");
            producto = sc.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            while (!sc.hasNextDouble()) {
                System.out.println(" Error: Ingrese un precio válido.");
                sc.next(); 
            }
            precio = sc.nextDouble();
            sc.nextLine(); 

            resumenVentas += " Producto: " + producto + " | Precio: $" + precio + "\n";

            totalVentas += precio;

            System.out.print("¿Desea registrar otra venta? (si/no): ");
            respuesta = sc.nextLine().toLowerCase();

        } while (respuesta.equals("si"));

        System.out.println("\n Resumen de Ventas:");
        if (resumenVentas.isEmpty()) {
            System.out.println("No se han registrado ventas.");
        } else {
            System.out.println(resumenVentas);
            System.out.println(" Monto total de ventas: $" + totalVentas);
        }
    }
}
