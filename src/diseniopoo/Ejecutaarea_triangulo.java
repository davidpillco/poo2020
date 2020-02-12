package diseniopoo;
import java.util.Scanner;
public class Ejecutaarea_triangulo {
    public static void main(String[] args) {
        // Creacion de objeto, con inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo:");
        double base = teclado.nextDouble();
        System.out.println("Ingrese la altura del triágulo: ");
        double altura = teclado.nextDouble();
        area_triangulo area_triangulo = new area_triangulo( base, altura);
        String resultado= area_triangulo.presentar();
        System.out.println(resultado);
    }
}
