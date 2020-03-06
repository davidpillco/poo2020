package polimorfismovolumen;

public abstract class Volumen {
    // Atributos comunes para todas las clases
    protected int figura;
    protected double volumen;

    public abstract void calcularVolumen();

    public int getFigura() {
        return figura;
    }
    public void setFigura(int figura) {
        this.figura = figura;
    }
    public double getVolumen() {
        return volumen;
    }

}
