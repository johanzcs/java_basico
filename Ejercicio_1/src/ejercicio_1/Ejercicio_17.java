/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;

public class Ejercicio_17 {
  
 public void jugar() {
        Scanner sc = new Scanner(System.in);
        
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;
        
        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¿Puedes adivinar cuál es?");
        
        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor. Inténtalo de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor. Inténtalo de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número " + numeroSecreto);
            }
        }
    }
}