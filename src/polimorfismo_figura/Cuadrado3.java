package polimorfismo_figura;

public class Cuadrado3 extends Figura3{
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }
}
