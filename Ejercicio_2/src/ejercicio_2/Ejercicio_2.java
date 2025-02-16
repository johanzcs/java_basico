/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import java.util.Scanner;
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner Ascensor = new Scanner(System.in); 
        int pisoActual = 1; 
        int pisoMin = -2;
        int pisoMax = 14;

        System.out.println("Bienvenido al ascensor.");
        
        while (true) { 
            System.out.println("Estas en el piso " + pisoActual);
            System.out.print("Ingresa el piso al que deseas ir (entre " + pisoMin + " y " + pisoMax + "): ");
            
            int pisoDestino = Ascensor.nextInt();

            if (pisoDestino >= pisoMin) { 
                if (pisoDestino <= pisoMax) { 
                    System.out.println("Moviendo el ascensor...");
                    while (pisoActual < pisoDestino) {
                        pisoActual++;
                        System.out.println("Subiendo... Piso : " + pisoActual);
                    }
                    while (pisoActual > pisoDestino) {
                        pisoActual--;
                        System.out.println("Bajando... Piso : " + pisoActual);
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


    

