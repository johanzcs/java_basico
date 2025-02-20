/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_8 {
    public void calcularIMC() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Asistente de Nutrición - Cálculo de IMC 🔹");
        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println(" Error: Peso y altura deben ser valores positivos.");
            return; 
        }

        double imc = peso / (altura * altura);

        String categoria;
        int categoriaIMC = (imc < 18.5) ? 1 :
                           (imc < 24.9) ? 2 :
                           (imc < 29.9) ? 3 : 4;

        switch (categoriaIMC) {
            case 1:
                categoria = "Bajo Peso";
                break;
            case 2:
                categoria = "Peso Normal";
                break;
            case 3:
                categoria = "Sobrepeso";
                break;
            case 4:
                categoria = "Obesidad";
                break;
            default:
                categoria = "Desconocida"; 
        }

        System.out.println("\n?Resultado del IMC:");
        System.out.printf("IMC Calculado: %.2f\n", imc);
        System.out.println("Categoría: " + categoria);

        switch (categoriaIMC) {
            case 1:
                System.out.println(" Recomendación: Podría necesitar aumentar su peso de forma saludable.");
                break;
            case 2:
                System.out.println(" ¡Felicitaciones! Su peso es adecuado.");
                break;
            case 3:
                System.out.println("️ Recomendación: Considere mejorar su alimentación y actividad física.");
                break;
            case 4:
                System.out.println("️ Advertencia: Es recomendable consultar con un especialista en nutrición.");
                break;
        }
    }
}
 
