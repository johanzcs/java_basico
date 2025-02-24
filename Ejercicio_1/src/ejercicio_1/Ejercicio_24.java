/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;
import java.util.Scanner;

public class Ejercicio_24 {
     public void registrarVehiculos() {
        Scanner sc = new Scanner(System.in);
        String resumenVehiculos = "";
        String respuesta;
        String placa;
        String horaIngreso;

        System.out.print("Ingrese el número de vehículos que ingresarán al parqueadero: ");
        int numeroVehiculos = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= numeroVehiculos; i++) {
            System.out.println("\nVehículo " + i);

            System.out.print("Ingrese la placa del vehículo: ");
            placa = sc.nextLine();

            System.out.print("Ingrese la hora de ingreso (formato HH:mm): ");
            horaIngreso = sc.nextLine();

            resumenVehiculos += "Vehículo " + i + " - Placa: " + placa + " | Hora de ingreso: " + horaIngreso + "\n";
        }

        System.out.println("\nResumen de vehículos registrados:");
        if (resumenVehiculos.isEmpty()) {
            System.out.println("No se han registrado vehículos.");
        } else {
            System.out.println(resumenVehiculos);
        }
    }
}
    

