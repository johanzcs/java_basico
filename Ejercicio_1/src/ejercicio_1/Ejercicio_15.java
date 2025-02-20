/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_15 {
   
public void simularViaje() {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        while (true) {

            System.out.print("\nIngrese la distancia total del viaje (en kilómetros): ");
            double distancia = sc.nextDouble();

            System.out.print("Ingrese la velocidad promedio del coche (en km/h): ");
            double velocidad = sc.nextDouble();

            if (distancia <= 0 || velocidad <= 0) {
                System.out.println("Error: La distancia y la velocidad deben ser valores positivos.");
                continue;  
            }

            double tiempo = distancia / velocidad;  
            System.out.printf("El tiempo estimado de viaje es: %.2f horas\n", tiempo);

            System.out.print("¿Desea simular otro viaje? (si/no): ");
            respuesta = sc.next().toLowerCase();

            if (!respuesta.equals("si")) {
                System.out.println("Gracias por usar el simulador de viajes. ¡Hasta luego!");
                break;  
            }
        }
}
}