package herenciaautomotriz;

public class EmpMecanico extends Empleado {
    // Declaracion de varialbles
    private double total_trabajos;
    private double sueldo;

    /**
     * Constructor para el empleado mecanico
     * @param nombre
     * @param departamento
     * @param puesto
     * @param total_trabajos
     */
    public EmpMecanico (String nombre, String departamento, int puesto, double total_trabajos){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.total_trabajos = total_trabajos;
    }
    public double getTotal_trabajos() {
        return total_trabajos;
    }

    public void setTotal_trabajos(double total_trabajos) {
        this.total_trabajos = total_trabajos;
    }

    /**
     * Merodo para el calculo del sueldo
     */
    public void sueldo (){
            sueldo = total_trabajos * 0.04;
    }

    /**
     * Metodo para presentar el sueldo
     * @return sueldo
     */
    public double presentarSueldo (){
        return sueldo;
    }
}
