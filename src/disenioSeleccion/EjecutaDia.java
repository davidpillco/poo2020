package disenioSeleccion;
import java.util.Scanner;
public class EjecutaDia {
    public static void main(String[] args) {
        // Creacion de objeto, con inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número del día:");
        int nombre = teclado.nextInt();
        Dia dia = new Dia(nombre);
        String resultado= dia.presentar();
        System.out.println(resultado);

    }
}
