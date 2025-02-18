/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner virtual = new Scanner(System.in);
        
       String respuesta;

        do {
            // Solicitar la edad del usuario
            System.out.print("Ingrese su edad: ");
            int edad = virtual .nextInt();

            // Recomendar películas basadas en la edad usando switch case
            String recomendacion = "";

            switch (edad) {
                case 0: case 1: case 2: case 3: case 4: case 5: case 6:  // Niños menores de 7 años
                    recomendacion = "Recomendamos películas animadas y educativas aptas para todas las edades.";
                    break;
                case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: // Niños y Adolescentes (7-17 años)
                    recomendacion = "Recomendamos películas para la familia como animaciones, aventuras y comedias familiares.";
                    break;
                case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: // Adultos (18-30 años)
                    recomendacion = "Recomendamos una variedad de géneros como acción, drama, comedia y ciencia ficción.";
                    break;
                default:  // Personas Mayores (mayores de 31 años)
                    if (edad > 31) {
                        recomendacion = "Recomendamos películas clásicas y dramas que podrían interesarle.";
                    } else {
                        recomendacion = "Edad no válida para recomendaciones.";
                    }
            }

            // Mostrar la recomendación
            System.out.println(recomendacion);

            // Preguntar si el usuario desea continuar o salir
            System.out.print("¿Desea ingresar otra edad o desea salir? (s para continuar / n para salir): ");
            respuesta = virtual.next();

        } while (respuesta.equalsIgnoreCase("s"));

        // Despedida final
        System.out.println("Gracias por usar el asistente virtual. ¡Hasta pronto!");

        // Cerrar el scanner
        virtual.close();
    }
}
