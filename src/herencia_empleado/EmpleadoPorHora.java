package herencia_empleado;

public class EmpleadoPorHora extends Empleado {
    double horas;
    double valorHora;
    double sueldo;

    public EmpleadoPorHora (String nombre, String cargo, String dependencia,double horas,double valorHora ) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.horas = horas;
        this.valorHora = valorHora;
    }
    public double calcularSueldoPorHoras(){
        sueldo = horas * valorHora;
        return sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
