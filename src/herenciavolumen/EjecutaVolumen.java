package herenciavolumen;
import java.util.Scanner;
public class EjecutaVolumen {
    public static void main(String[] args) {
        // Declaracion de variables
        double radio;
        double arista;
        double altura;
        int  condicion = 0;
        int figura;
        // Scanner para el ingreso por teclado del usuario
        Scanner teclado = new Scanner(System.in);
        // Preguntar al usuario a que figura desea calcular el volumen
        while(condicion == 0){
            System.out.println("Ingrese la figura que desee calcular su area:\n1.- Cubo\n2.-Cilindro\n3.-Cono\n" +
                    "4.-Esfera\n5.- Fin");
            figura = teclado.nextInt();
            // Limpieza del buffer
            teclado.nextLine();
            // Condicion para evaluar el cubo
            if(figura == 1){
                System.out.println("Ingrese la medida de la arista: ");
                arista = teclado.nextDouble();
                // Creacion del objeto
                Cubo cubo = new Cubo(figura,arista);
                cubo.volumenCubo();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Cubo\nVolumen: %.2f\n",cubo.presentarVolumen());
            }
            // Condicion para evaluar el cilindro
            if(figura == 2){
                System.out.println("Ingrese la medida del radio del cilidro: ");
                radio = teclado.nextDouble();
                System.out.println("Ingrese la medida de la altura del cilindro: ");
                altura = teclado.nextDouble();
                // Creacion del objeto
                Cilindro cilindro = new Cilindro(figura,radio,altura);
                cilindro.volumenCilindro();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Cilindro\nVolumen: %.2f\n",cilindro.presentarVolumen());
            }
            // Condicion para evaluar el cono
            if(figura == 3){
                System.out.println("Ingrese la medida del radio del cono: ");
                radio = teclado.nextDouble();
                System.out.println("Ingrese la medida de la altura del cono: ");
                altura = teclado.nextDouble();
                // Creacion del objeto
                Cono cono = new Cono(figura,radio,altura);
                cono.volumenCono();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Cono\nVolumen: %.2f\n",cono.presentarVolumen());
            }
            // Condicion para evaluar el esfera
            if(figura == 4){
                System.out.println("Ingrese la medida el radio de la esfera");
                radio = teclado.nextDouble();
                // Creacion del objeto
                Esfera esfera = new Esfera(figura,radio);
                esfera.volumenEsfera();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Esfera\nVolumen: %.2f\n",esfera.presentarVolumen());
            }
            if(figura == 5){
                condicion = 1;
                System.out.println("Usted ha decidido salir del programa");
            }else{
                teclado.nextLine();
                if(figura == 1 || figura == 2|| figura == 3 || figura == 4){
                    System.out.println("Desea ingresar otra figura 1.- Si | 2.- No");
                    condicion = teclado.nextInt();
                    if(condicion == 1){
                        condicion = 0;
                    }
                }
            }
        }
    }
}
