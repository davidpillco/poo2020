package polimorfismodeudores;

public abstract class ClienteDeudor {
    // Declaracion de variables
    protected String nombre;
    protected String num_cuenta;
    protected double interes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public abstract void calcularInteres();

    public double getInteres() {
        return interes;
    }

}
