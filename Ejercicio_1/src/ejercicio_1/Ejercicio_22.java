/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_22 {
     public void gestionarTareas() {
        Scanner sc = new Scanner(System.in);
        String tareas = "";
        String descripcion, fechaVencimiento;
        String respuesta;

        do {
            System.out.print("Ingrese la descripción de la tarea: ");
            descripcion = sc.nextLine();

            System.out.print("Ingrese la fecha de vencimiento (DD/MM/AAAA): ");
            fechaVencimiento = sc.nextLine();

            tareas += " Tarea: " + descripcion + " | Fecha de vencimiento: " + fechaVencimiento + "\n";

            System.out.print("¿Desea agregar otra tarea? (si/no): ");
            respuesta = sc.nextLine().toLowerCase();

        } while (respuesta.equals("si"));

        System.out.println("\n Lista de tareas registradas:");
        if (tareas.isEmpty()) {
            System.out.println("No se han registrado tareas.");
        } else {
            System.out.println(tareas);
        }
    }
}
