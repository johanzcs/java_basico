/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_3 {

    public void simularAscensorConPeso() {
        Scanner sc = new Scanner(System.in);

        final int PISO_MINIMO = 1;
        final int PISO_MAXIMO = 10;
        final double PESO_MAXIMO = 200.0; 
        
        int pisoActual = 1; 

        System.out.println("Bienvenido al simulador de ascensor con límite de peso.");
        System.out.print("Ingrese su peso en kg: ");
        double pesoUsuario = sc.nextDouble();

        if (pesoUsuario > PESO_MAXIMO) {
            System.out.println("Error: El ascensor está sobrecargado. Peso máximo permitido: " + PESO_MAXIMO + " kg.");
            return; 
        }
        
        System.out.println("El edificio tiene pisos del " + PISO_MINIMO + " al " + PISO_MAXIMO + ".");
        System.out.print("Ingrese el piso al que desea ir: ");
        int pisoDeseado = sc.nextInt();

        if (pisoDeseado >= PISO_MINIMO && pisoDeseado <= PISO_MAXIMO) {
            System.out.println("Moviendo el ascensor del piso " + pisoActual + " al piso " + pisoDeseado + "...");
            System.out.println("¡Llegaste al piso " + pisoDeseado + "!");
        } else {
            System.out.println("Error: Piso inválido. Por favor, ingrese un número entre " + PISO_MINIMO + " y " + PISO_MAXIMO + ".");
        }
    }
}
