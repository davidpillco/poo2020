package deber_seleccion;

import java.util.Scanner;

public class Mayor4Numeros2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de Variables
        double n1;
        double n2;
        double n3;
        double n4;
        double total;
        String cadFinal;
        System.out.println("Por favor ingrese el numero 1:\n");
        n1 = entrada.nextDouble();
        System.out.println("Por favor ingrese el numero 2:\n");
        n2 = entrada.nextDouble();
        System.out.println("Por favor ingrese el numero 3:\n");
        n3 = entrada.nextDouble();
        System.out.println("Por favor ingrese el numero 4:\n");
        n4 = entrada.nextDouble();

        EjecutaMayor4Numeros2 alt = new EjecutaMayor4Numeros2(n1, n2, n3, n4);
        total = alt.numeroAlto(n1, n2, n3, n4);
        cadFinal = alt.obtenerCadena(total);
        System.out.println(cadFinal);

    }
}
