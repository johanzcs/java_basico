/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_27 {
    
    public void sumarNumeros() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidadNumeros = sc.nextInt();

        double suma = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");

            while (!sc.hasNextDouble()) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                sc.next(); 
                System.out.print("Ingrese el número " + (i + 1) + ": ");
            }
            double numero = sc.nextDouble();
            suma += numero;  
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
