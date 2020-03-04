package herencia_area;

public class Figura_circulo extends Figura {
    private double radio;
    private double area;

    /**
     * Constructor para el area del circulo
     * @param figura
     * @param radio
     */
    public Figura_circulo(int figura, double radio){
        this.radio = radio;
        this.figura = figura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo para el calculo del area del circulo
     */
    public void areaCirculo (){
        area = Math.PI * (Math.pow(radio,2));
    }

    /**
     * Metodo para presentar el area del circulo
     * @return area
     */
    public double presentarArea(){
        return area;
    }
}
