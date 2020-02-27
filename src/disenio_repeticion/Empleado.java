package disenio_repeticion;

public class Empleado {
    // Declaracion de vaiables
    private double horasTrabajadas;
    private double valorHora;
    private String nombre;
    private double sueldo;
    private String cadena = "";

    public Empleado(double horasTrabajadas, double valorHora, String nombre){
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora =valorHora;
        this.nombre = nombre;
    }
    public double calcularSueldo(){
        if(getHorasTrabajadas() <= 40){
            setSueldo(getHorasTrabajadas() * getValorHora());
        }else{
            if(getHorasTrabajadas() <=50){
                setSueldo((40* getValorHora()) + (getHorasTrabajadas() - 40) * (getValorHora() *2));;
            }else {
                setSueldo((40*getValorHora())+(10*getValorHora()*2)+((getHorasTrabajadas()-50)*(getValorHora()*3)));
            }
        }
        return getSueldo();
    }
    public String presentar(){
        cadena = String.format("%s%s\t\t\t\t\t\t%.2f\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n", cadena, getNombre(),
                getHorasTrabajadas(), getValorHora(), calcularSueldo());
        return cadena;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
