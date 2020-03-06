package polimorfismoinversionistas;

public class CuentaAhorro extends Inversionista {
        // Declaracion de varibles
        private double capital;
        private double plazo;

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    @Override
    public void calcularInteres() {
        interes =((capital/plazo)*(0.30*plazo));
    }
}
