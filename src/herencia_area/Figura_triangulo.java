package herencia_area;

public class Figura_triangulo extends Figura {
    // Declaracion de variables
    private double base;
    private double altura;
    private double area;

    /**
     * Constructor para el area del triangulo
     * @param figura
     * @param base
     * @param altura
     */
    public Figura_triangulo(int figura, double base, double altura){
        this.figura = figura;
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Metodo para el calculo del area del triangulo
     */
    public void areaTriangulo(){
        area = (base * altura)/2;
    }

    /**
     * Metodo para presentar el area del triangulo
     * @return
     */
    public double presentarArea(){
        return area;
    }
}
