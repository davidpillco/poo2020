package polimorfismovolumen;

public class Esfera extends Volumen {
    private double radio;

    public void setRadio(double radio) {

        this.radio = radio;
    }

    @Override
    public void calcularVolumen() {
        volumen = 4/3 * Math.PI * (Math.pow(radio,3));
    }
}
