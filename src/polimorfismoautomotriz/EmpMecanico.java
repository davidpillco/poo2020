package polimorfismoautomotriz;

public class EmpMecanico extends Empleado {
    // Declaracion de variables
    private double total_trabajos;

    public double getTotal_trabajos() {
        return total_trabajos;
    }

    public void setTotal_trabajos(double total_trabajos) {
        this.total_trabajos = total_trabajos;
    }

    @Override
    public void calcularSuedo() {
        sueldo = total_trabajos * 0.04;
    }
}
