package deber_seleccion;

public class Ejercicio14_1 {
    // Declaracion de variables
    private double calif1;
    private double calif2;
    private double calif3;
    private double calif4;
    private double promedio;
    private String observacion;

    /**
     * Método Constructor de la clase Ejercicio14_1
     * @param calif1
     * @param calif2
     * @param calif3
     * @param calif4
     */
    public Ejercicio14_1(double calif1, double calif2, double calif3, double calif4){
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
        this.calif4 = calif4;
    }
    // Métodos get y set de las variables globales
    public double getCalif1() {

        return calif1;
    }

    public void setCalif1(double calif1) {

        this.calif1 = calif1;
    }

    public double getCalif2() {

        return calif2;
    }

    public void setCalif2(double calif2) {

        this.calif2 = calif2;
    }

    public double getCalif3() {

        return calif3;
    }

    public void setCalif3(double calif3) {

        this.calif3 = calif3;
    }

    public double getCalif4() {

        return calif4;
    }

    public void setCalif4(double calif4)
    {
        this.calif4 = calif4;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getObservacion() {

        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public double promedioAlumno(){
        setPromedio((getCalif1() + getCalif2() + getCalif3() + getCalif4()) / 4);
        return getPromedio();
    }
    public String estadoEstudiante() {
        String informacion = "";
        if (promedio >= 60) {
            setObservacion("APROBADO ¡Felicitaciones!");
        } else {
            if (promedio <= 59) {
                setObservacion("REPROBADO");
            }
        }
        return getObservacion();
    }


}
