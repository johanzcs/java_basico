/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_12 {
    
    public void operarCajero() {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000000; 
        double monto;

        System.out.println("Bienvenido al Cajero Automático");

        while (true) {
            System.out.println("\nSaldo disponible: $" + saldo);
            System.out.print("Ingrese el monto que desea retirar (o 0 para salir): ");
            monto = sc.nextDouble();

            if (monto == 0) {
                System.out.println("Gracias por usar el cajero automático.");
                break;
            } else if (monto > saldo) {
                System.out.println("Error: Fondos insuficientes. Intente con un monto menor.");
            } else if (monto < 0) {
                System.out.println("Error: No puede retirar montos negativos.");
            } else {
                saldo -= monto;
                System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
            }
        }
    }
}

