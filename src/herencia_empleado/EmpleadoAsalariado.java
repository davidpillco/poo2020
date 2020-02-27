package herencia_empleado;

public class EmpleadoAsalariado extends Empleado {
    // Declaracion de variables
     double valorMensual;
     double sueldo;


    /**
     * Constructor para el empleado asalariado
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param valorMensual
     */
    public EmpleadoAsalariado (String nombre, String cargo, String dependencia,double valorMensual ) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.valorMensual = valorMensual;

    }

    /**
     * Calculo del valor mensual
     * @return sueldo
     */
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
