/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_18 {
    public void registrarLibros() {
        Scanner sc = new Scanner(System.in);
        String librosRegistrados = ""; 
        String continuar;
        
        do {
            
            System.out.print("Ingrese el título del libro: ");
            String titulo = sc.nextLine();
            
            System.out.print("Ingrese el autor del libro: ");
            String autor = sc.nextLine();
            
            System.out.print("Ingrese el número de páginas: ");
            int paginas = sc.nextInt();
            sc.nextLine(); 
            
            librosRegistrados += "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas + "\n";

            System.out.print("¿Desea registrar otro libro? (si/no): ");
            continuar = sc.nextLine();
            
        } while (continuar.equalsIgnoreCase("si")); 

        System.out.println("\nLista de libros registrados:");
        System.out.println(librosRegistrados);
    }
}
