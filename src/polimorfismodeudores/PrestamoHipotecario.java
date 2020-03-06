package polimorfismodeudores;

public class PrestamoHipotecario extends ClienteDeudor {
    // Declaracion de variables
    private double prec_casa;
    private double plazo;

    public void setPrec_casa(double prec_casa) {
        this.prec_casa = prec_casa;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    @Override
    public void calcularInteres() {
        interes =((prec_casa/plazo)*(0.07*plazo));
    }
}
