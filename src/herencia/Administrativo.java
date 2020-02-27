package herencia;

public class Administrativo extends Persona {

    public  Administrativo (String nombre,String estado_civil, String dependencia, String identificacion,
                     String fecha_nacimiento ){
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.estado_civil = estado_civil;
        this.identificacion = identificacion;
        this.fecha_nacimiento = fecha_nacimiento;

    }
    private String dependencia;


    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void gestionar(){
        System.out.println("Metodo para gestionar");
    }
}
