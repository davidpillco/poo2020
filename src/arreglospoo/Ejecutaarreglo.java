package arreglospoo;
import java.util.Scanner;
public class Ejecutaarreglo {
    // Declaracion de variables
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vectorA = new int [10];
        int [] vectorB = new int [10];
        int sumatoria;
        System.out.println("Ingreso de valores del vector A");
        for(int i = 0; i < vectorA.length; i++){
            System.out.println("Ingrese el valor de la posicion "+i+": ");
            vectorA[i] = teclado.nextInt();
        }
        System.out.println("Ingreo de valores del vector B");
        for(int i = 0; i < vectorB.length; i++){
            System.out.println("Ingrese el valor de la posicion "+i+": ");
            vectorB[i] = teclado.nextInt();
        }
        Arreglo arreglo = new Arreglo(vectorA,vectorB);
        arreglo.setVectorA(vectorA);
        arreglo.setVectorB(vectorB);
        arreglo.getSumatoria();
        arreglo.presentar();
        System.out.printf("%s\nEl total de la sumatoria es de:%d",arreglo.presentar,arreglo.calculo());

    }

}
