package polimorfismodeudores;

public class PrestamoAuto extends ClienteDeudor {
    // Declaracion de variables
    private double prec_auto;
    private double plazo;


    public void setPrec_auto(double prec_auto) {
        this.prec_auto = prec_auto;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    @Override
    public void calcularInteres() {
        interes =((prec_auto/plazo)*(0.07*plazo));
    }
}
