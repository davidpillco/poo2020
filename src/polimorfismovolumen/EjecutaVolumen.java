package polimorfismovolumen;
import java.util.Scanner;
public class EjecutaVolumen {
    public static void main(String[] args) {
        // Declaracion de variables
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
                Cubo cubo = new Cubo();
                System.out.println("Ingrese la medida de la arista: ");
                cubo.setArista(teclado.nextDouble());
                cubo.calcularVolumen();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Cubo\nVolumen: %.2f\n", cubo.getVolumen());
            }
            // Condicion para evaluar el cilindro
            if(figura == 2){
                Cilindro cilindro = new Cilindro();
                System.out.println("Ingrese la medida del radio del cilidro: ");
                cilindro.setRadio(teclado.nextDouble());
                System.out.println("Ingrese la medida de la altura del cilindro: ");
                cilindro.setAltura(teclado.nextDouble());
                cilindro.calcularVolumen();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Cilindro\nVolumen: %.2f\n",cilindro.getVolumen());
            }
            // Condicion para evaluar el cono
            if(figura == 3){
                Cono cono = new Cono();
                System.out.println("Ingrese la medida del radio del cono: ");
                cono.setRadio(teclado.nextDouble());
                System.out.println("Ingrese la medida de la altura del cono: ");
                cono.setAltura(teclado.nextDouble());
                cono.calcularVolumen();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Cono\nVolumen: %.2f\n",cono.getVolumen());
            }
            // Condicion para evaluar el esfera
            if(figura == 4){
                Esfera esfera = new Esfera();
                System.out.println("Ingrese la medida el radio de la esfera");
                esfera.setRadio(teclado.nextDouble());
                esfera.calcularVolumen();
                // Presentacion final
                System.out.println("------------------------------------------------------");
                System.out.printf("Figura ingresada: Esfera\nVolumen: %.2f\n",esfera.getVolumen());
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
