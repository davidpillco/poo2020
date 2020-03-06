package polimorfismovolumen;

public class Cilindro extends Volumen {
    private double radio;
    private double altura;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public void calcularVolumen() {
        volumen = Math.PI * (Math.pow(radio,2)*altura);
    }
}
