package herenciadeudores;

public class PrestamoAuto extends ClienteDeudor {
    // Declaracion de variables
    private double prec_auto;
    private double plazo;
    private double interes;

    public PrestamoAuto (String nombre, String num_cuenta,double prec_auto, double plazo){
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.prec_auto = prec_auto;
        this.plazo= plazo;
    }

    public double getPrec_auto() {
        return prec_auto;
    }

    public void setPrec_auto(double prec_auto) {
        this.prec_auto = prec_auto;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public void intereses (){

        interes =((prec_auto/plazo)*(0.07*plazo));
    }
    public double presentarIntereses (){
        return interes;
    }
}
