package polimorfismoautomotriz;

public class EmpAdmvo extends Empleado {
    // Declaracion de variables
    private double sueldo_mensual;

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }
    @Override
    public void calcularSuedo() {
        sueldo = sueldo_mensual /2;
    }
}
