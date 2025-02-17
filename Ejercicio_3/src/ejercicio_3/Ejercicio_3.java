/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;
public class Ejercicio_3 {

   public static void ascensores() {
        Scanner LimitedePeso = new Scanner(System.in); 
        int pisoActual = 1;
        int pisoMin = -1;
        int pisoMax = 13;
        int pesoMaximo = 300; 

        System.out.println("Bienvenido al ascensor.");
        
        while (true) { 
            System.out.print("Ingresa tu peso en kg: ");
            int pesoUsuario = LimitedePeso.nextInt();

            if (pesoUsuario > pesoMaximo) {
                System.out.println("¡Sobrecarga! Peso maximo permitido: " + pesoMaximo + " kg. Intenta de nuevo.");
                continue; 
            }

            System.out.println("Estas en el piso " + pisoActual);
            System.out.print("Ingresa el piso al que deseas ir (entre " + pisoMin + " y " + pisoMax + "): ");
            
            int pisoDestino = LimitedePeso.nextInt();

            if (pisoDestino >= pisoMin) { 
                if (pisoDestino <= pisoMax) { 
                    System.out.println("Moviendo el ascensor...");
                    while (pisoActual < pisoDestino) {
                        pisoActual++;
                        System.out.println("Subiendo...piso  : " + pisoActual);
                    }
                    while (pisoActual > pisoDestino) {
                        pisoActual--;
                        System.out.println("Bajando... piso : " + pisoActual);
                    }
                    System.out.println("Has llegado al piso " + pisoActual + ". Puertas abiertas.");
                } else {
                    System.out.println("Error: Piso fuera de rango. Intenta de nuevo.");
                }
            } else {
                System.out.println("Error: Piso fuera de rango. Intenta de nuevo.");
            }
        }
    }
}
