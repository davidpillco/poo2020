package polimorfismo_figura;

public abstract  class Figura3 {
    // Definicion de atribustos protegidos
    protected int figura;
    protected double area;
    /**
     * Método abstracto, que sera implementado
     * dentro de las clases hijas
     */
    public abstract void calcularArea();

    public double getArea (){
        return area;
    }

    public int getFigura() {
        return figura;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }
}
