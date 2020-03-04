package herencia_area;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        // Declaracion de variables
         double radio;
         double lado;
         double base_rect;
         double altura_rect;
         double base;
         double altura;
         int  condicion = 0;
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
                System.out.println("Ingrese la medida del lado del cuadrado: ");
                lado = teclado.nextDouble();
                // Creacion del objeto
                Figura_cuadrado area_cuadrado = new Figura_cuadrado(figura,lado);
                area_cuadrado.areaCuadrado();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Cuadrado\nÁrea: %.2f\n",area_cuadrado.presentarArea());
            }
            // Condicion para evaluar el rectangulo
            if(figura == 2){
                System.out.println("Ingrese la medida de la base del rectángulo: ");
                base_rect = teclado.nextDouble();
                System.out.println("Ingrese la medida de la altura del rectángulo: ");
                altura_rect = teclado.nextDouble();
                // Creacion del objeto
                Figura_rectangulo area_rectangulo = new Figura_rectangulo(figura,base_rect,altura_rect);
                area_rectangulo.areaRectangulo();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Rectángulo\nÁrea: %.2f\n",area_rectangulo.presentarArea());
            }
            // Condicion para evaluar el triangulo
            if(figura == 3){
                System.out.println("Ingrese la medida la base del triángulo: ");
                base = teclado.nextDouble();
                System.out.println("Ingrese la medida de la altura del triángulo: ");
                altura = teclado.nextDouble();
                // Creacion del objeto
                Figura_triangulo area_triangulo = new Figura_triangulo(figura,base,altura);
                area_triangulo.areaTriangulo();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Triángulo\nÁrea: %.2f\n",area_triangulo.presentarArea());
            }
            // Condicion para evaluar el circulo
            if(figura == 4){
                System.out.println("Ingrese la medida el radio del círculo");
                radio = teclado.nextDouble();
                // Creacion del objeto
                Figura_circulo area_circulo = new Figura_circulo(figura,radio);
                area_circulo.areaCirculo();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Círculo\nÁrea: %.2f\n",area_circulo.presentarArea());
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
