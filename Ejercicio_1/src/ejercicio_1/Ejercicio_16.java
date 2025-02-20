/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_16 {
    public void cuentaRegresiva() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo para la cuenta regresiva: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Error: El número debe ser un entero positivo.");
            return; 
        }

        while (numero >= 0) {
            System.out.println(numero);  
            numero--;  
        }

        System.out.println("¡Tiempo cumplido!");
    }
}
