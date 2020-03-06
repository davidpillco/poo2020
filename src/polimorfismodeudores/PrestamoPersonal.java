package polimorfismodeudores;

public class PrestamoPersonal extends ClienteDeudor {
    // Declaracion de variables
    private double monto;
    private double plazo;

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    @Override
    public void calcularInteres() {
        interes =((monto/plazo)*(0.05*plazo));
    }
}
