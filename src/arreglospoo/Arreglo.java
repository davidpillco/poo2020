package arreglospoo;

public class Arreglo {
    // Declaracion de variables
    private int [] vectorA = new int [10];
    private int [] vectorB = new int [10];
    private int sumatoria;
    String presentar = "";

    public Arreglo (int [] vectorA, int [] vectorB){
        this.setVectorA(vectorA);
        this.setVectorB(vectorB);
    }

    public int calculo(){
        setSumatoria(0);
        for (int i = 0; i < getVectorA().length; i++){
            setSumatoria(getSumatoria() + (getVectorA()[i]* getVectorB()[i]));
        }
        return getSumatoria();
    }
    public String presentar(){
        for (int i = 0; i < getVectorA().length; i++){
            presentar = String.format("%sLos valores del vector A son:%d\n" ,presentar, vectorA[i]);
        }
        for (int i = 0; i < getVectorA().length; i++){
            presentar = String.format("%sLos valores del vector B son:%d\n" ,presentar, vectorB[i]);
        }
        return presentar;
    }


    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }
}
