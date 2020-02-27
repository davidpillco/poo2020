package disenioSeleccion;

public class Dia {
    // Declaración de variables
    private int num_dia;
    private String nombre;

    /**
     * Constructor Dia
     * @param num_dia
     */
    public Dia(int num_dia){
        this.num_dia = num_dia;
    }
    public int getNum_dia() {
        return num_dia;
    }

    public void setNum_dia(int num_dia) {
        this.num_dia = num_dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para la evaluación de número de día ingresado
     * @return getNombre;
     */
    public String calcularNombre(){
        switch (getNum_dia()) {
            case 1:
                setNombre("DOMINGO");
                break;
            case 2:
                setNombre("LUNES");
                break;
            case 3:
                setNombre("MARTES");
                break;
            case 4:
                setNombre("MIERCOLES");
                break;
            case 5:
                setNombre("JUEVES");
                break;
            case 6:
                setNombre("VIERNES");
                break;
            case 7:
                setNombre("SABADO");
                break;
            default:
                setNombre("Opción Incorrecta");
                break;
        }
    return getNombre();
    }

    /**
     * Método para presentar el mensaje final
     * @return presentar
     */
    public String presentar(){
        String presentar = "Número de dia ingresado es: "+ getNum_dia() +"\n"+"El día es: " + calcularNombre();
        return presentar;
    }
}
