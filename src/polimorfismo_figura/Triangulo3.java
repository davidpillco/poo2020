package polimorfismo_figura;

public class Triangulo3 extends Figura3 {

    private double base_triangulo;
    private double altura_triangulo;

    public void setBase_triangulo(double base_triangulo) {
        this.base_triangulo = base_triangulo;
    }

    public void setAltura_triangulo(double altura_triangulo) {
        this.altura_triangulo = altura_triangulo;
    }

    @Override
    public void calcularArea() {
        area = (base_triangulo * altura_triangulo) /2;
    }
}
