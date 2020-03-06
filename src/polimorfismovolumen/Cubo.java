package polimorfismovolumen;

public class Cubo extends Volumen {
    private double arista;

    public void setArista(double arista) {
        this.arista = arista;
    }

    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista,3);
    }
}
