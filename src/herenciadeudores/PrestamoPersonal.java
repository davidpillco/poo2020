package herenciadeudores;

public class PrestamoPersonal extends ClienteDeudor {
    // Declaracion de variables
    private double monto;
    private double plazo;
    private double interes;

    public PrestamoPersonal (String nombre, String num_cuenta,double monto, double plazo){
        this.nombre = nombre;
        this.num_cuenta = num_cuenta;
        this.monto = monto;
        this.plazo= plazo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public void intereses (){
        interes =((monto/plazo)*(0.05*plazo));
;    }
    public double presentarIntereses (){
        return interes;
    }
}
