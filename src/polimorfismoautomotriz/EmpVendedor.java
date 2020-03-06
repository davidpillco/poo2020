package polimorfismoautomotriz;

public class EmpVendedor extends  Empleado{
    private double salario_minimo;
    private double total_ventas;

    public double getSalario_minimo() {
        return salario_minimo;
    }

    public void setSalario_minimo(double salario_minimo) {
        this.salario_minimo = salario_minimo;
    }

    public double getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(double total_ventas) {
        this.total_ventas = total_ventas;
    }

    @Override
    public void calcularSuedo() {
        sueldo = salario_minimo + total_ventas;
    }
}
