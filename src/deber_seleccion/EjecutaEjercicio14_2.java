package deber_seleccion;

import disenioSeleccion.Empleado;

import java.util.Scanner;

public class EjecutaEjercicio14_2 {
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
