/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_14 {
public void solicitarImpresion() {
        Scanner sc = new Scanner(System.in);
        int capacidadPapel = 100;  
        int cantidadPapelRestante = capacidadPapel;
        int cantidad;

        System.out.println("Bienvenido al simulador de impresora");

        while (cantidadPapelRestante > 0) {
            System.out.print("\nIngrese la cantidad de páginas que desea imprimir: ");
            cantidad = sc.nextInt();

            if (cantidad < 0) {
                System.out.println("Error: La cantidad de páginas debe ser un valor positivo.");
            } else if (cantidad > cantidadPapelRestante) {
                System.out.println("No hay suficiente papel para imprimir esa cantidad de páginas.");
                System.out.println("Papel restante: " + cantidadPapelRestante + " páginas.");
            } else {
                cantidadPapelRestante -= cantidad;
                System.out.println("Se imprimieron " + cantidad + " páginas.");
                System.out.println("Papel restante: " + cantidadPapelRestante + " páginas.");
            }

            if (cantidadPapelRestante == 0) {
                System.out.println("No queda más papel en la impresora.");
                break;
            }

            System.out.print("¿Desea imprimir más páginas? (si/no): ");
            String respuesta = sc.next().toLowerCase();

            if (!respuesta.equals("si")) {
                break;  
            }
        }

        System.out.println("\nSimulación de impresión finalizada.");
        System.out.println("Papel restante en la impresora: " + cantidadPapelRestante + " páginas.");
    }
}

