/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;

public class Ejercicio_5 {
    public  void alertatemperatura() {
        Scanner sc = new Scanner(System.in);

        double umbralAlerta = 30.0;
        System.out.print("Ingrese la temperatura actual (°C): ");
        double temperatura = sc.nextDouble();
        if (temperatura > umbralAlerta) {
            System.out.println("¡ALERTA! La temperatura está por encima del umbral de alerta.");
        } else {
            System.out.println("La temperatura es normal.");
        }
       
    }
}