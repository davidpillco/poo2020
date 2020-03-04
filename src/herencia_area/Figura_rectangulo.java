package herencia_area;

public class Figura_rectangulo extends Figura {
    private double base_rect;
    private double altura_rect;
    private double area;

    /**
     * Constructor para el area del rectangulo
     * @param figura
     * @param base_rect
     * @param altura_rect
     */
    public Figura_rectangulo(int figura, double base_rect, double altura_rect){
        this.figura = figura;
        this.base_rect = base_rect;
        this.altura_rect = altura_rect;
    }

    public double getBase_rect() {
        return base_rect;
    }

    public void setBase_rect(double base_rect) {
        this.base_rect = base_rect;
    }

    public double getAltura_rect() {
        return altura_rect;
    }

    public void setAltura_rect(double lado_rect) {
        this.altura_rect = altura_rect;
    }

    /**
     * Metodo para el calculo del area del rectangulo
     */
    public void areaRectangulo (){
        area = base_rect * altura_rect;
    }

    /**
     * Metodo para presentar el area
     * @return area
     */
    public double presentarArea(){
        return area;
    }
}
