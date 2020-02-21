package matrizpoo;
import java.util.Scanner;
public class EjecutaMatrices {
    // Declaracion de variables
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int sumatoria;
        System.out.println("Ingreso de valores dela matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++){
                System.out.println("Ingrese el valor de la posicion "+"["+i+"],["+j+"]: ");
                matrizA[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Ingreese los valores de la matriz B");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++){
                System.out.println("Ingrese el valor de la posicion "+"["+i+"],["+j+"]: ");
                matrizB[i][j] = teclado.nextInt();
            }
        }
        Matrices matrices = new Matrices(matrizA,matrizB);
        System.out.println("Matriz A:\n"+matrices.presentacionMatriz(matrices.getMatrizA())+"\n");
        System.out.println("Matriz B:\n"+matrices.presentacionMatriz(matrices.getMatrizB())+"\n");
        System.out.println("Matriz C resultante:\n"+matrices.presentacionMatriz(matrices.SumaMatriz())+"\n");
    }
}

