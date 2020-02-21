package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        String num_cedula;
        // Ingreso del numero de cedula porparte del usuario
        System.out.println("Ingrese el numero de cedula a verificar:  ");
        num_cedula = teclado.nextLine();
        // Creacion del objeto
        Cedula cedula = new Cedula(num_cedula);
        // Lamada al metodo de la presentacion
        cedula.presentar();
        // Print final
        System.out.println(cedula.presentar());
    }




}
