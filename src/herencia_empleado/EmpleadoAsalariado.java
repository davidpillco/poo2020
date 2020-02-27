package herencia_empleado;

public class EmpleadoAsalariado extends Empleado {
     double valorMensual;
     double sueldo;


    public EmpleadoAsalariado (String nombre, String cargo, String dependencia,double valorMensual ) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.valorMensual = valorMensual;

    }

    public double calcularSueldoMensual(){
        sueldo = valorMensual;
        return sueldo;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(double valorMensual) {
        this.valorMensual = valorMensual;
    }
}
