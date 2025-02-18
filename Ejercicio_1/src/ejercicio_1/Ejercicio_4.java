/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_4 {
     public static void main(String[] args) {
         Scanner sensor = new Scanner(System.in);

        double temperaturaMinima = 18.0;
        double temperaturaMaxima = 25.0;

        String respuesta;
        do {

            System.out.print("Ingrese la temperatura actual (°C): ");
            double temperatura = sensor.nextDouble();

            if (temperatura >= temperaturaMinima && temperatura <= temperaturaMaxima) {
                System.out.println("La temperatura es adecuada.");
            } else {
                System.out.println("La temperatura está fuera del rango deseado.");
            }

            System.out.print("¿Desea ingresar otra temperatura? (s/n): ");
            respuesta = sensor.next();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Programa terminado. ¡Adiós!");

        sensor.close();
    }
}