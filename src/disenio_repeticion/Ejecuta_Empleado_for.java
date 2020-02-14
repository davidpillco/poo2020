package disenio_repeticion;

import java.util.Scanner;

public class Ejecuta_Empleado_for {
    public static void main(String[] args) {
        // Declaracion de variables
        String cadena = "";
        int opcion ;
        // Creacion de objeto, con inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        boolean nuevoEmpleado = true;
        cadena = String.format("%s%s\n%s\t\t\t%s\t\t%s\t\t%s\n", cadena, "Informe del Sueldo del Empleado",
                "Nombre del Empleado", "Horas trabajadas", "Sueldo por hora", "Sueldo total del empleado");
        System.out.println("Cuantos registros desea ingresar: ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        for(int i = 0; i < opcion; i++){
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

            teclado.nextLine();
        }
        System.out.printf("%s",cadena);
    }
}

