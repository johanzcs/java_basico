/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    
    public void generarFactura() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        
        System.out.print("Ingrese el tipo de cliente (A, B, C, etc.): ");
        char tipoCliente = sc.next().charAt(0);
        
        System.out.print("Ingrese el producto comprado: ");
        sc.nextLine(); 
        String producto = sc.nextLine();
        
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();
        
        System.out.print("Ingrese el precio unitario del producto: ");
        double precioUnitario = sc.nextDouble();
        
        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();
        
        double subtotal = cantidad * precioUnitario;
        double impuesto = esEstudiante ? subtotal * 0.05 : subtotal * 0.13;
        double total = subtotal + impuesto;
        
        System.out.println("\n========= FACTURA =========");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + impuesto + " (" + (esEstudiante ? "5%" : "13%") + ")");
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("============================\n");
    }
}

    

