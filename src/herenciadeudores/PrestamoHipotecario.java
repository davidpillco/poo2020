package herenciadeudores;

public class PrestamoHipotecario extends ClienteDeudor {
    // Declaracion de variables
    private double prec_casa;
    private double plazo;
    private double interes;

    public PrestamoHipotecario (String nombre, String num_cuenta,double prec_casa, double plazo){
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.prec_casa = prec_casa;
        this.plazo = plazo;
    }

    public double getPrec_casa() {
        return prec_casa;
    }

    public void setPrec_auto(double prec_auto) {
        this.prec_casa = prec_casa;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public void intereses (){
        interes =((prec_casa/plazo)*(0.07*plazo));
    }
    public double presentarIntereses (){
        return interes;
    }
}
