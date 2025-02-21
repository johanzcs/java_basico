/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_20 {
     public void Temperatura() {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        
        do {
            System.out.print("Ingrese la temperatura actual en °C: ");
            temperatura = sc.nextDouble();

            if (temperatura < 18 || temperatura > 25) {
                System.out.println("️ Alerta: La temperatura está fuera del rango aceptable (18°C - 25°C).");
            }
            
        } while (temperatura < 18 || temperatura > 25); 

        System.out.println(" La temperatura está dentro del rango aceptable.");
    }
}
