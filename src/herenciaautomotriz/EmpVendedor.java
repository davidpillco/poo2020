package herenciaautomotriz;

public class EmpVendedor extends  Empleado{
    private double salario_minimo;
    private double total_ventas;
    private double sueldo;

    /**
     * Constructor para el empleado Vendedor
     * @param nombre
     * @param departamento
     * @param puesto
     * @param salario_minimo
     * @param total_ventas
     */
    public EmpVendedor (String nombre, String departamento, int puesto, double salario_minimo, double total_ventas){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.salario_minimo = salario_minimo;
        this.total_ventas = total_ventas;
    }
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

    /**
     * Merodo para el calculo del sueldo
     */
    public void sueldo (){ ;
        sueldo = salario_minimo + total_ventas;
    }

    /**
     * Metodo para presentar el sueldo
     * @return sueldo
     */
    public double presentarSueldo (){
        return sueldo;
    }


}
