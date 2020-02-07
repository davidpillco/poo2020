package diseniopoo;
import java.util.Scanner;
import intropoo.Persona;

public class EjecutaCerveza {
    public static void main(String[] args) {
        // Creacion de objeto, con inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la cerveza:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el tipo de cerveza (lt):");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese el precio de la cerveza:");
        double precio = teclado.nextDouble();
        System.out.println("Ingrese el total de unidades vendidas del producto:");
        int unidades_vendidas = teclado.nextInt();

        Cerveza cerveza = new Cerveza(precio,unidades_vendidas, nombre,tipo);
        String total_ventas = cerveza.presentar();
        System.out.println(total_ventas);
    }
}
