package polimorfismo_figura;

public class Circulo3 extends Figura3 {
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio,2);
    }
}
