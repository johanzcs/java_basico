/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_13 {
     public void realizarCompra() {
        Scanner sc = new Scanner(System.in);
        double costoTotal = 0;
        String respuesta;

        System.out.println("Bienvenido a la tienda en línea");

        while (true) {
            System.out.print("\nIngrese el precio del producto: ");
            double precio = sc.nextDouble();

            System.out.print("Ingrese la cantidad que desea comprar: ");
            int cantidad = sc.nextInt();

            if (precio < 0) {
                System.out.println("Error: El precio debe ser un valor positivo.");
            } else {
                if (cantidad < 0) {
                    System.out.println("Error: La cantidad debe ser un valor positivo.");
                } else {
                    double costoProducto = precio * cantidad;
                    costoTotal += costoProducto;

                    System.out.println("Costo de este producto: $" + costoProducto);
                    System.out.println("Costo total acumulado: $" + costoTotal);
                }
            }

            System.out.print("¿Desea agregar otro producto? (si/no): ");
            respuesta = sc.next().toLowerCase();

            if (!respuesta.equals("si")) {
                break; 
            }
        }

        System.out.println("\nCompra finalizada.");
        System.out.println("Costo total de la compra: $" + costoTotal);
    }
}
