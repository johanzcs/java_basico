/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_10 {
 public  void campeonato() {
        Scanner sc = new Scanner(System.in);

        int puntos = 0;
        int partidosJugados = 0;
        String resultado;

        System.out.println(" Bienvenido al Sistema de Clasificación del Campeonato ");

        while (true) {
            System.out.print("\nIngrese el resultado del partido (ganado, perdido, empatado) o 'salir' para finalizar: ");
            resultado = sc.nextLine().toLowerCase();

            if (resultado.equals("salir")) {
                break;
            }

            switch (resultado) {
                case "ganado":
                    puntos += 3;
                    partidosJugados++;
                    System.out.println(" Partido ganado. Se suman 3 puntos.");
                    break;
                case "empatado":
                    puntos += 1;
                    partidosJugados++;
                    System.out.println(" Partido empatado. Se suma 1 punto.");
                    break;
                case "perdido":
                    partidosJugados++;
                    System.out.println(" Partido perdido. No se suman puntos.");
                    break;
                default:
                    System.out.println("️ Entrada no válida. Intente nuevamente.");
                    continue; 
            }

            System.out.println("Clasificación actual:");
            System.out.println("   Partidos Jugados: " + partidosJugados);
            System.out.println("   Puntos Acumulados: " + puntos);
        }

        System.out.println("\n Fin del campeonato.");
        System.out.println(" Resumen Final:");
        System.out.println("  Total de partidos jugados: " + partidosJugados);
        System.out.println("   Puntos finales: " + puntos);
    }
}
