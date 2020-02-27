package disenioSeleccion;

public class Empleado {
    // Declaración de variables
    private String nombre;
    private double vhoras;
    private double htrabajadas;
    private double sueldo;

    /**
     * Constructor
     * @param nombre
     * @param vhoras
     * @param htrabajadas
     */
    public Empleado(String nombre, double vhoras,double htrabajadas){
        this.nombre = nombre;
        this.vhoras = vhoras;
        this.htrabajadas = htrabajadas;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVhoras() {
        return vhoras;
    }

    public void setVhoras(double vhoras) {
        this.vhoras = vhoras;
    }

    public double getHtrabajadas() {
        return htrabajadas;
    }

    public void setHtrabajadas(double htrabajadas) {
        this.htrabajadas = htrabajadas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Metodo para calcular el sueldo
     * @return sueldo
     */
    public double calcularSueldo(){
        if(getHtrabajadas() <= 40){
            setSueldo(getHtrabajadas() * getVhoras());
        }else{
            setSueldo((40* getVhoras()) + (getHtrabajadas() - 40) * (getVhoras() *2));
        }
        return getSueldo();
    }

    /**
     * Metodo para presentar la informacion
     * @return
     */
    public String presentar(){
        String presentar = "Nombre del empleado: "+ getNombre() +":\n"+"Valor que cobra por hora: " + getVhoras()
                +"\n"+"Horas trabajadas: "+ getHtrabajadas() +"\n"+"Sueldo a recibir: "+calcularSueldo()+" USD\n";
        return presentar;
    }


}
