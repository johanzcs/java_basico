/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_19 {
     public void MenuComidaRrapidas() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double total = 0;
        String continuar;
        
        do {
            System.out.println("\n--- Menú de Comidas Rápidas ---");
            System.out.println("1. Hamburguesa - $5.00");
            System.out.println("2. Papas Fritas - $2.50");
            System.out.println("3. Refresco - $1.50");
            System.out.println("4. Nuggets - $3.00");
            System.out.println("5. Helado - $2.00");
            System.out.print("Seleccione una opción (1-5): ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    total += 15.000;
                    System.out.println("Agregaste una Hamburguesa.");
                    break;
                case 2:
                    total += 2.500;
                    System.out.println("Agregaste Papas Fritas.");
                    break;
                case 3:
                    total += 1.500;
                    System.out.println("Agregaste un Refresco.");
                    break;
                case 4:
                    total += 30.000;
                    System.out.println("Agregaste Nuggets.");
                    break;
                case 5:
                    total += 2.000;
                    System.out.println("Agregaste un Helado.");
                    break;
                default:
                    System.out.println(" Opción no válida, intente nuevamente.");
            }

            System.out.print("¿Desea agregar otro producto? (si/no): ");
            sc.nextLine(); 
            continuar = sc.nextLine();
            
        } while (continuar.equalsIgnoreCase("si")); 

        System.out.println("\nTotal a pagar: $" + total);
        System.out.println("¡Gracias por su compra! ");
    }
}
