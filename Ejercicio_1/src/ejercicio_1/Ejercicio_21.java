/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_21 {
     public void calcularPromedio() {
        Scanner sc = new Scanner(System.in);
        double sumaNotas = 0;
        int contador = 0;
        double nota;
        String respuesta;
        
        do {

            System.out.print("Ingrese la nota del examen: ");
            nota = sc.nextDouble();

            if (nota < 1.0 || nota > 10.0) {
                System.out.println("️ Error: La nota debe estar entre 1.0 y 10.0");
            } else {
                sumaNotas += nota;
                contador++;
            }

            System.out.print("¿Desea ingresar otra nota? (si/no): ");
            respuesta = sc.next().toLowerCase();
            
        } while (respuesta.equals("si"));

        if (contador > 0) {
            double promedio = sumaNotas / contador;
            System.out.println("\n Promedio de notas: " + promedio);

            if (promedio >= 6.0) {
                System.out.println(" ¡Felicidades! Has aprobado.");
            } else {
                System.out.println(" Lo siento, has reprobado.");
            }
        } else {
            System.out.println("️ No se ingresaron notas válidas.");
        }
    }
}
