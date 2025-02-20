/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_9 {
   public void recomendarPelicula() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Asistente Virtual de Cine ");
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad <= 0) {
            System.out.println(" Error: La edad debe ser un número positivo.");
            return;
        }

        int grupoEdad;
        if (edad < 7) {
            grupoEdad = 1; 
        } else {
            if (edad <= 17) {
                grupoEdad = 2; 
            } else {
                if (edad <= 30) {
                    grupoEdad = 3; 
                } else {
                    grupoEdad = 4; 
                }
            }
        }

        switch (grupoEdad) {
            case 1:
                System.out.println("\n Para niños menores de 7 años, recomendamos:");
                System.out.println(" 'Toy Story' (Animada)");
                System.out.println(" 'Coco' (Animada, Apta para toda la familia)");
                System.out.println(" 'Frozen' (Musical, Animada)");
                break;

            case 2:
                System.out.println("\n Para niños y adolescentes (7 a 17 años), recomendamos:");
                System.out.println(" 'Harry Potter' (Aventura, Fantasía)");
                System.out.println(" 'Spider-Man: Un nuevo universo' (Animada, Superhéroes)");
                System.out.println(" 'Jumanji' (Comedia, Aventura)");
                break;

            case 3:
                System.out.println("\n Para adultos jóvenes (18 a 30 años), recomendamos:");
                System.out.println(" 'Avengers: Endgame' (Acción, Ciencia ficción)");
                System.out.println(" 'Inception' (Ciencia ficción, Thriller)");
                System.out.println(" 'La La Land' (Drama, Musical)");
                break;

            case 4:
                System.out.println("\n️ Para adultos mayores de 31 años, recomendamos:");
                System.out.println(" 'Forrest Gump' (Drama, Comedia)");
                System.out.println(" 'El Padrino' (Clásico, Crimen)");
                System.out.println(" 'Cadena Perpetua' (Drama)");
                break;

            default:
                System.out.println(" Categoría de edad no reconocida.");
        }

    }
}
