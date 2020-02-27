package herencia;

/**
 * Esta clase hereda de la clase padre Persona
 */
public class Docente extends Persona {
    public  Docente (String nombre,String estado_civil, String area, String identificacion,
                        String fecha_nacimiento ){
        this.area = area;
        this.nombre = nombre;
        this.estado_civil = estado_civil;
        this.identificacion = identificacion;
        this.fecha_nacimiento = fecha_nacimiento;

    }
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void enseniar(){
        System.out.println("Metodo para enseñar");
    }
    public void calificar (){
        System.out.println("Metodo para calificar");
    }

}
