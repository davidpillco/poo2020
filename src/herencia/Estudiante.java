package herencia;

/**
 * Clase que hereda de la clase persona
 * Contendrá todos os atributos y métodos definidos en Persona
 */
public class Estudiante extends Persona {

    public  Estudiante (String nombre,String estado_civil, String carrera, String identificacion,
                        String fecha_nacimiento ){
        this.carrera = carrera;
        this.nombre = nombre;
        this.estado_civil = estado_civil;
        this.identificacion = identificacion;
        this.fecha_nacimiento = fecha_nacimiento;

    }

    // Atributos propios de esta clase
    private String carrera;
    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular(){
        System.out.println("Metodo para matricular");
    }
    public void aprender(){
        System.out.println("Metodo para aprender");
    }

}
