package polimorfismoinversionistas;

public class Pagare extends Inversionista {
    // Declaracion de varibles
    private double capital;
    private double anios;

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getAnios() {
        return anios;
    }

    public void setAnios(double anios) {
        this.anios = anios;
    }

    @Override
    public void calcularInteres() {
        interes =((capital/anios)*(0.45*anios));
    }
}
