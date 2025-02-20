/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;

public class Ejercicio_4 {

    public void verificarTemperatura() {
        Scanner sc = new Scanner(System.in);

        final int TEMP_MINIMA = 18;
        final int TEMP_MAXIMA = 25;

        System.out.println("Bienvenido al sensor de temperatura.");
        System.out.print("Ingrese la temperatura actual en °C: ");
        int temperatura = sc.nextInt();

        if (temperatura >= TEMP_MINIMA) {
            if (temperatura <= TEMP_MAXIMA) {
                System.out.println(" La temperatura es adecuada: " + temperatura + "°C.");
            } else {
                System.out.println(" Advertencia: La temperatura está por encima del rango deseado (" + TEMP_MINIMA + "°C - " + TEMP_MAXIMA + "°C).");
            }
        } else {
            System.out.println("️ Advertencia: La temperatura está por debajo del rango deseado (" + TEMP_MINIMA + "°C - " + TEMP_MAXIMA + "°C).");
        }
    }
}