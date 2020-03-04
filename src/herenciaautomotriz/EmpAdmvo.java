package herenciaautomotriz;

public class EmpAdmvo extends Empleado {
    // Declaracion de variables
    private double sueldo_mensual;
    private double sueldo;

    /**
     * Contructor para el empleado administrativo
     * @param nombre
     * @param departamento
     * @param puesto
     * @param sueldo_mensual
     */
    public EmpAdmvo(String nombre, String departamento, int puesto, double sueldo_mensual){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo_mensual = sueldo_mensual;
    }

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    /**
     * Merodo para el calculo del sueldo
     */
    public void sueldo (){
        sueldo = sueldo_mensual /2;
    }

    /**
     * Metodo para presentar el sueldo
     * @return sueldo
     */
    public double presentarSueldo (){
        return sueldo;
    }
}
