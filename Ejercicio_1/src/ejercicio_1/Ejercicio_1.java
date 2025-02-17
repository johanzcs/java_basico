/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;


   
    import java.util.Scanner;

public class Ejercicio_1 {
    private Factura factura; 

    public String NombreCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        return nombreCliente;  
    }
    
    public int Cedula(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("CEDULA DEL CLIENTE");
        int cedula = scanner.nextInt();
        return cedula;
    }
    
    public String Producto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("INGRESE ELPRODUCTO ");
        String producto = scanner.nextLine();
        return producto;
    }
    
    public int Cantidad (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la cantidad");
        int cantidad = scanner.nextInt();
        return cantidad;
        
    }
    
    public double Precio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el precio ");
        double precio = scanner.nextDouble();
        return precio;
    }
    
    public boolean Estudiante(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ¿es  estudiante?  (TRUE/FALSE): ");
        boolean estudiante = scanner.nextBoolean();
        return estudiante;
    }
    
    public char TipoCliente (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese  el tipo de cliente (A,B,C) ");
        char tipoCliente = scanner.next().charAt(0);
        return tipoCliente;
        
    }
     
    
     
    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu ");
            System.out.println("1. Tomar los datos");
            System.out.println("2. Mostrar la factura");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> tomarDatos();
                case 2 -> mostrarFactura();
                case 3 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 3);
    }
    
     public void tomarDatos() {
    String nombreCliente = NombreCliente();
    int cedula = Cedula();
    String producto = Producto();
    int cantidad = Cantidad();
    double precio = Precio();
    boolean estudiante = Estudiante();
    char tipoCliente = TipoCliente();

    
    factura = new Factura(nombreCliente, cedula, producto, cantidad, precio, estudiante, tipoCliente);
}

     
      public void mostrarFactura() {
        if (factura != null) {
            System.out.println(" Factura");
            System.out.println("Cliente: " + factura.getNombreCliente());
            System.out.println("Cédula: " + factura.getCedula());
            System.out.println("Producto: " + factura.getProducto());
            System.out.println("Cantidad: " + factura.getCantidad());
            System.out.println("Precio : " + factura.getPrecioUnitario());
            System.out.println("Subtotal: " + factura.getSubtotal());
            System.out.println("Impuesto: " + factura.getImpuesto());
            System.out.println("Total: " + factura.getTotal());
            System.out.println("Tipo de cliente: " + factura.getTipoCliente());
        } else {
            System.out.println("No se han ingresado los datos de la factura. Primero debe tomar los datos.");
        }
    }
      public static void fin() {
        Ejercicio_1 ejercicio_1 = new Ejercicio_1();
        ejercicio_1.mostrarMenu();  
    }
     
    
    
}
    

