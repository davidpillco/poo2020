package taller1;

public class EjecutaDocente {
    public static void main(String[] args) {
        // Creación de objeto tiempo
        Docente docente = new Docente();
        docente.actualizar_nombre("David");
        docente.actualizar_edad(35);
        docente.actualizar_peso(55.5);
        docente.actualizar_genero("Masculino");
        docente.actualizar_estatura(1.80);
        docente.actualizar_materia("Programacion orientada a objetos");
        String mostrar_informacion = docente.obtener_informacion() ;
        System.out.println(mostrar_informacion);

    }
}
