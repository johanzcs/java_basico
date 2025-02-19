/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner solucion = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n BIENVENIDO\n");
            System.out.println("Seleccione el ejercicio a ejecutar (0 para salir): ");
              System.out.println("1 - Generar Factura");
            System.out.println("2 - Simular Ascensor");
            System.out.println("3 - Ascensor con Límite de Peso");
            System.out.println("4 - Sensor de Temperatura");
            System.out.println("5 - Sensor de Temperatura con Umbral de Alerta");
            System.out.println("6 - Ascensor con Verificación de Temperatura");
            opcion = solucion.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nbeinvendio ejercicio1 ");
                    Ejercicio_1 ejercicio1 = new Ejercicio_1();
                    ejercicio1.generarFactura();
                    break;
                    case 2:
                    System.out.println("\n bienvenido ejercicio2");
                    Ejercicio_2 ejercicio2 = new Ejercicio_2();
                    ejercicio2.simularAscensor();
                    break;
                    case 3:
                    System.out.println("\n bienvenido ejercicio3");
                    Ejercicio_3 ejercicio3 = new Ejercicio_3();
                    ejercicio3.simularAscensorConPeso();
                    break;
                    case 4:
                    System.out.println("\nbienvenido ejercicio4");
                    Ejercicio_4 ejercicio4 = new Ejercicio_4();
                    ejercicio4.verificarTemperatura();
                    break;
                    case 5:
                    System.out.println("\n bienvenido ejercicio5");
                    Ejercicio_5 ejercicio5 = new Ejercicio_5();
                    ejercicio5.alertatemperatura();
                    case 6:
                    System.out.println("\nbienvenido ejercicio6");
                    Ejercicio_6 ejercicio6 = new Ejercicio_6();
                    ejercicio6.ascensorConTemperatura();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }

        } while (opcion != 0);

        solucion.close();
    }
}
