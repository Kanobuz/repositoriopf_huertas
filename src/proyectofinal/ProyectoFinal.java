package proyectofinal;
import java.util.Scanner;

public class ProyectoFinal {

    public static void main(String[] args) {
        // Declarar variables
        double venta1, venta2, venta3, sueldoMensual, pagoTotal, comision;
        String vendedor;
        
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Nombre del Vendedor: ");
        vendedor = lectura.next();
        System.out.print("Sueldo Mensual: ");
        sueldoMensual = lectura.nextDouble();
        System.out.print("Venta 1: ");
        venta1 = lectura.nextDouble();
        System.out.print("Venta 2: ");
        venta2 = lectura.nextDouble();
        System.out.print("Venta 3: ");
        venta3 = lectura.nextDouble();
        
        // Procesar datos
        comision = (venta1 + venta2 + venta3) * 0.10;
        pagoTotal = sueldoMensual + comision;
        
        // Salida de datos
        System.out.println("La comision de la venta es    : " + comision);
        System.out.println("El sueldo neto del vendedor es: " + pagoTotal);
    }
    
}
