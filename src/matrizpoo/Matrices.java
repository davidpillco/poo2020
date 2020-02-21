package matrizpoo;

public class Matrices {
    // Declaracion de variables
    private int[][] matrizA = new int[3][3];
    private int[][] matrizB = new int[3][3];
    private int[][] matrizC = new int[3][3];

    public Matrices(int[][] matrizA, int[][] matrizB) {
        this.setMatrizA(matrizA);
        this.setMatrizB(matrizB);
        this.setMatrizC(getMatrizC());
    }
    public int[][] SumaMatriz(){
        for (int i = 0; i < getMatrizA().length; i++) {
            for (int j = 0; j < getMatrizA().length; j++){
                getMatrizC()[i][j] = (getMatrizA()[i][j] + getMatrizB()[i][j]);
            }
        }
        return getMatrizC();
    }
    public String presentacionMatriz(int matriz[][]){
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++){
                cadena+= matriz[i][j];
                cadena +="       ";
            }
            cadena+="\n";
        }
        return cadena;
    }


    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }
}

