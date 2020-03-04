package polimorfismo_figura;
import herenciavolumen.Cilindro;

import java.util.Scanner;
import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        // Declaracion de variables
        int  condicion= 0;
        int figura;
        // Scanner para el ingreso por teclado del usuario
        Scanner teclado = new Scanner(System.in);
        // Preguntar al usuario a que figura desea calcular el area
        while(condicion == 0){
            System.out.println("Ingrese la figura que desee calcular su area:\n1.- Cuadrado\n2.-Rectángulo\n3.-Triángulo\n" +
                    "4.-Círculo");
            figura = teclado.nextInt();
            // Limpieza del buffer
            teclado.nextLine();
            // Condicion para evaluar el cuadrado
            if(figura == 1){
                Cuadrado3 cuadrado3 = new Cuadrado3();
                System.out.println("ÁREA DE UN CUADRADO");
                System.out.println("Ingrese la medida del lado del cuadrado: ");
                cuadrado3.setLado(teclado.nextDouble());
                // Presentacion final
                System.out.println("------------------------------------------------------");
                cuadrado3.calcularArea();
                System.out.printf("Figura ingresada: Cuadrado\nÁrea: %.2f\n",cuadrado3.getArea());
            }
            // Condicion para evaluar el rectangulo
            if(figura == 2){
                Rectangulo3 rectangulo3 = new Rectangulo3();
                System.out.println("ÁREA DE UN RECTÁGULO");
                System.out.println("Ingrese la base del rectángulo: ");
                rectangulo3.setBase(teclado.nextDouble());
                System.out.println("Ingrese la altura del rectángulo: ");
                rectangulo3.setAltura(teclado.nextDouble());
                rectangulo3.calcularArea();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Rectángulo\nÁrea: %.2f\n",rectangulo3.getArea());
            }
            // Condicion para evaluar el triangulo
            if(figura == 3){
                Triangulo3 triangulo3 = new Triangulo3();
                System.out.println("ÁREA DE UN TRIANGULO");
                System.out.println("Ingrese la medida la base del triángulo: ");
                triangulo3.setBase_triangulo(teclado.nextDouble());
                System.out.println("Ingrese la medida de la altura del triángulo: ");
                triangulo3.setAltura_triangulo(teclado.nextDouble());
                triangulo3.calcularArea();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Triángulo\nÁrea: %.2f\n",triangulo3.getArea());
            }
            // Condicion para evaluar el circulo
            if(figura == 4){
                Circulo3 circulo3 = new Circulo3();
                System.out.println("ÁREA DE UN CÍRCULO");
                System.out.println("Ingrese la medida el radio del círculo");
                circulo3.setRadio(teclado.nextDouble());
                circulo3.calcularArea();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Círculo\nÁrea: %.2f\n",circulo3.getArea());
            }
            teclado.nextLine();
            System.out.println("Desea ingresar otra figura 1.- Si | 2.- No");
            condicion = teclado.nextInt();
            if(condicion == 1){
                condicion = 0;
            }
        }
    }

}
