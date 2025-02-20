/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_6 {

    public void ascensorConTemperatura() {
        Scanner sc = new Scanner(System.in);

        final int TEMP_MINIMA = 18;
        final int TEMP_MAXIMA = 25;

        final int PISO_MINIMO = 1;
        final int PISO_MAXIMO = 10;

        System.out.println("Bienvenido al ascensor con verificación de temperatura.");
        System.out.print("Ingrese la temperatura ambiente en °C: ");
        int temperatura = sc.nextInt();

        if (temperatura >= TEMP_MINIMA) {
            if (temperatura <= TEMP_MAXIMA) {

                System.out.print("Ingrese el piso al que desea ir (1 - 10): ");
                int piso = sc.nextInt();

                if (piso >= PISO_MINIMO) {
                    if (piso <= PISO_MAXIMO) {
                        System.out.println(" La temperatura es adecuada (" + temperatura + "°C). Moviendo el ascensor al piso " + piso + "...");
                    } else {
                        System.out.println(" Error: El piso ingresado es inválido. Solo se permiten pisos entre " + PISO_MINIMO + " y " + PISO_MAXIMO + ".");
                    }
                } else {
                    System.out.println(" Error: El piso ingresado es inválido. Solo se permiten pisos entre " + PISO_MINIMO + " y " + PISO_MAXIMO + ".");
                }
                
            } else {
                System.out.println("️ Advertencia: La temperatura está demasiado alta (" + temperatura + "°C). El ascensor no puede moverse.");
            }
        } else {
            System.out.println("️ Advertencia: La temperatura está demasiado baja (" + temperatura + "°C). El ascensor no puede moverse.");
        }
    }
}