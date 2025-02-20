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
            System.out.println("7- Sistema de Compras en una Tienda con Descuentos");
            System.out.println("8- Asistente de Nutrición - Cálculo de IMC");
            System.out.println("9-  Asistente Virtual de Cine ");
            System.out.println("10-  CLASIFICACION DEL CAMPEONATO ");
            System.out.println("11- RESTAURANTE");
            System.out.println("12-  cajero automatico ");
            System.out.println("13-  tienda en linea ");
            System.out.println("14-  solicitar una impresion ");
            System.out.println("15-  solicitar un viaje en coche  ");

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
                    case 7:
                    System.out.println("\n bienvenido ejercicio7"); 
                    Ejercicio_7 ejercicio7 = new Ejercicio_7();
                    ejercicio7.calcularCompra();
                    break;
                    case 8:
                    System.out.println("\n bienvenido ejercicio8"); 
                    Ejercicio_8 ejercicio8 = new Ejercicio_8();
                    ejercicio8.calcularIMC();
                    break; 
                    case 9:
                    System.out.println("\n bienvenido ejercicio9");
                    Ejercicio_9 ejercicio9 = new Ejercicio_9();
                    ejercicio9.recomendarPelicula();
                    break;
                    case 10:
                    System.out.println("\n bienvenido ejercicio10");
                    Ejercicio_10 ejercicio10 = new Ejercicio_10();
                    ejercicio10.campeonato();
                    break;
                    case 11:
                    System.out.println("\n bienvenido ejercicio11");
                    Ejercicio_11 ejercicio11 = new Ejercicio_11();
                    ejercicio11.menuRestaurante();
                    break;
                    case 12:
                    System.out.println("\n bienvenido ejercicio12");
                    Ejercicio_12 ejercicio12 = new Ejercicio_12();
                    ejercicio12.operarCajero();
                    break;
                    case 13:
                    System.out.println("\n bienvenido ejercicio13");
                    Ejercicio_13 ejercicio13 = new Ejercicio_13();
                    ejercicio13.realizarCompra();
                    break;
                    case 14:
                    System.out.println("\n bienvenido ejercicio14");
                    Ejercicio_14 ejercicio14 = new Ejercicio_14();
                    ejercicio14.solicitarImpresion();
                    break;
                    case 15:
                    System.out.println("\n bienvenido ejercicio15");
                    Ejercicio_15 ejercicio15 = new Ejercicio_15();
                    ejercicio15.simularViaje(); 
                    break;
                    case 16:
                    System.out.println("\n bienvenido ejercicio16");
                    Ejercicio_16 ejercicio16 = new Ejercicio_16();
                    ejercicio16.cuentaRegresiva(); 
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
