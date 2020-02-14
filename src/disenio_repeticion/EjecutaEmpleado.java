package disenio_repeticion;

import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Declaracion de variables
        String cadena = "";
        int opcion ;
        // Creacion de objeto, con inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        boolean nuevoEmpleado = true;
        cadena = String.format("%s%s\n%s\t\t\t%s\t\t%s\t\t%s\n", cadena, "Informe del Sueldo del Empleado",
                "Nombre del Empleado", "Horas trabajadas", "Sueldo por hora", "Sueldo total del empleado");

        while(nuevoEmpleado == true){
            System.out.println("Ingrese su nombre:");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese las horas trabajas:");
            double horasTrabajadas = teclado.nextDouble();
            System.out.println("Ingrese valor por horas:");
            double valorHora = teclado.nextDouble();
            Empleado empleado = new Empleado(horasTrabajadas,valorHora,nombre);
            cadena = String.format("%s%s",cadena,empleado.presentar());
            empleado.setValorHora(valorHora);
            empleado.calcularSueldo();
            System.out.println("Desea calcular el sueldo de otro empleado 1.-SI | 2.-NO:");
            opcion = teclado.nextInt();
            if(opcion == 2){
                nuevoEmpleado = false;
            }
            teclado.nextLine();
        }
        System.out.printf("%s",cadena);
    }
}
