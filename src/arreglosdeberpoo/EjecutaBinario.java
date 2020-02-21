package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaBinario {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            // Declaracion de variables
            String num_binario;
            // Ingreso del numero de cedula porparte del usuario
            System.out.println("Ingrese el numero en binario  ");
            num_binario = teclado.nextLine();
            // Creacion del objeto
            Binario binario= new Binario(num_binario);
            // Lamada al metodo de la presentacion
            binario.presentar();
            // Print final
            System.out.println(binario.presentar());
        }
    }

