package herencia_empleado;

public class EmpleadoPorHora extends Empleado {
    double horas;
    double valorHora;
    double sueldo;

    /**
     * Constructor para el empleado por hora
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param horas
     * @param valorHora
     */
    public EmpleadoPorHora (String nombre, String cargo, String dependencia,double horas,double valorHora ) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    /**
     * Metodo para el calculo del sueldo por hora
     * @return sueldo
     */
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
