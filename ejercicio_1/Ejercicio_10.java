/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_10 {
    
    public static void main(String[] args) {
        Scanner clasificacion = new Scanner(System.in);
         System.out.println("Sistema de clasificación para el campeonato deportivo");

        System.out.print("Introduce el resultado del equipo 1: ");
        int resultadoEquipo1 = clasificacion.nextInt();

        System.out.print("Introduce el resultado del equipo 2: ");
        int resultadoEquipo2 = clasificacion.nextInt();

        if (resultadoEquipo1 > resultadoEquipo2) {
            System.out.println("¡Equipo 1 ha ganado!");
        } else if (resultadoEquipo1 < resultadoEquipo2) {
            System.out.println("¡Equipo 2 ha ganado!");
        } else {
            System.out.println("¡El partido ha terminado en empate!");
        }
    }
}