/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args){
        Scanner asistente = new Scanner(System.in);
       System.out.print("Ingrese su peso en kilogramos (kg): ");
        double peso = asistente.nextDouble();

        System.out.print("Ingrese su altura en metros (m): ");
        double altura = asistente.nextDouble();

        double imc = peso / (altura * altura);

        String categoria = "";
        switch ((imc < 18.5 ? 1 : (imc < 24.9 ? 2 : (imc < 29.9 ? 3 : 4)))) {
            case 1:
                categoria = "Bajo peso";
                break;
            case 2:
                categoria = "Peso normal";
                break;
            case 3:
                categoria = "Sobrepeso";
                break;
            case 4:
                categoria = "Obesidad";
                break;
            default:
                categoria = "Categoría desconocida";
        }

        System.out.println("Su IMC es: " + imc);
        System.out.println("Categoría: " + categoria);

        asistente.close();
    }
}  
 
