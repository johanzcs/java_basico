/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;


public class Factura {
    private String nombreCliente;
    private int cedula;
    private String producto;
    private int cantidad;
    private double precio;
    private boolean estudiante;
    private char tipoCliente;
    private double subtotal;
    private double impuesto;
    private double total;

    // Constructor correcto
    public Factura(String nombreCliente, int cedula, String producto, int cantidad, double precio, boolean estudiante, char tipoCliente) {
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estudiante = estudiante;
        this.tipoCliente = tipoCliente;

        calcularFactura(); // Calcula los valores al crear la factura
    }

    private void calcularFactura() {
        subtotal = cantidad * precio;

        if (estudiante) {
            impuesto = subtotal * 0.05;
        } else {
            impuesto = subtotal * 0.13;
        }

        total = subtotal + impuesto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCedula() {
        return cedula;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getTotal() {
        return total;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }
}
