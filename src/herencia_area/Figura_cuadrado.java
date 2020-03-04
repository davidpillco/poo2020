package herencia_area;

public class Figura_cuadrado extends Figura {
    // Declaracion de varibles
    private double lado;
    private double area;

    /**
     * Constructor para el area del cuadrado
     * @param figura
     * @param lado
     */
    public Figura_cuadrado(int figura, double lado){
        this.figura = figura;
        this.setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Metodo para el calculo del area cuadrado
     */
    public void areaCuadrado (){
        area = lado * lado;
    }

    /**
     * Metodo para presentar el area del cuadrado
     * @return area
     */
    public double presentarArea(){
        return area;
    }
}
