package polimorfismoautomotriz;

public abstract class Empleado {
    // Atributos comunes para todas las clases
    protected String nombre;
    protected String departamento;
    protected double sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }
    public abstract void calcularSuedo();
}
