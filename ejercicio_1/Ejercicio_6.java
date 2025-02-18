/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
          Scanner combinacion = new Scanner(System.in);

           double temperaturaMinima = 18.0;
        double temperaturaMaxima = 25.0;

        double umbralAlerta = 30.0;
        
        String respuesta;
        
        do {
            // Solicitar al usuario que ingrese la temperatura actual
            System.out.print("Ingrese la temperatura actual (°C): ");
            double temperatura = combinacion.nextDouble();
            
            // Verificar si la temperatura está dentro del rango aceptable
            if (temperatura >= temperaturaMinima && temperatura <= temperaturaMaxima) {
                // Si la temperatura es adecuada, solicitar el piso al que desea ir el usuario
                System.out.print("La temperatura es adecuada. ¿A qué piso desea ir? ");
                int pisoDeseado = combinacion.nextInt();
                
                // Verificar si la temperatura está por encima del umbral de alerta
                if (temperatura > umbralAlerta) {
                    System.out.println("¡ALERTA! La temperatura es demasiado alta para operar el ascensor.");
                } else {
                    System.out.println("El ascensor está en movimiento al piso " + pisoDeseado + ".");
                }
            } else {
                // Si la temperatura no es adecuada, no se mueve el ascensor
                System.out.println("La temperatura no es adecuada. El ascensor no puede moverse.");
            }
            
            // Preguntar al usuario si desea continuar
            System.out.print("¿Desea ingresar otra temperatura y piso? (s/n): ");
            respuesta = combinacion.next();
            
        } while (respuesta.equalsIgnoreCase("s"));
        
        // Despedida al usuario
        System.out.println("Programa terminado. ¡Adiós!");
        
        // Cerrar el objeto scanner
        combinacion.close();
    }
}