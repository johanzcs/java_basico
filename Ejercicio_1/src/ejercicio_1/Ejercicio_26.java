/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_26 {
    public void agendaDeContactos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos contactos deseas agregar a la agenda? ");
        int cantidadContactos = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[cantidadContactos];
        String[] telefonos = new String[cantidadContactos];

        for (int i = 0; i < cantidadContactos; i++) {
            System.out.println("\nContacto " + (i + 1));

            System.out.print("Ingrese el nombre del contacto: ");
            nombres[i] = sc.nextLine();

            System.out.print("Ingrese el número de teléfono: ");
            telefonos[i] = sc.nextLine();
        }

        System.out.println("\nLista de contactos registrados:");
        for (int i = 0; i < cantidadContactos; i++) {
            System.out.println("Nombre: " + nombres[i] + " | Teléfono: " + telefonos[i]);
        }
    }
}    

