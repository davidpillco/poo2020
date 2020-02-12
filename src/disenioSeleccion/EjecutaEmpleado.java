package disenioSeleccion;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Creacion de objeto, con inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese las horas trabajas:");
        double htrabajadas = teclado.nextDouble();
        System.out.println("Ingrese valor por horas:");
        double vhoras = teclado.nextDouble();
        Empleado empleado = new Empleado(nombre,vhoras,htrabajadas);
        String resultado= empleado.presentar();
        System.out.println(resultado);

    }

}
