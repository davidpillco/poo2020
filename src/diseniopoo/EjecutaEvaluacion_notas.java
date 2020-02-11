package diseniopoo;
import java.util.Scanner;

public class EjecutaEvaluacion_notas {
    public static void main(String[] args) {
        // Creacion de objeto, con inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el nombre de la materia:");
        String materia = teclado.nextLine();
        System.out.println("Ingrese la nota del primer bimestre:");
        double bim_1 = teclado.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre:");
        double bim_2 = teclado.nextDouble();
        Evaluacion_notas eval_materia = new Evaluacion_notas(nombre,materia,bim_1,bim_2);
        String resultado= eval_materia.presentar();
        System.out.println(resultado);
    }
}
