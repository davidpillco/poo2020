package taller1;


public class EjecutaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.actualizaEdad(19);
        estudiante.actualizaNombre("David Andrés");
        estudiante.actualizaMateria("Programación Orientada a objetos");
        estudiante.actualizaLibro("Programación");
        estudiante.actualizarcomida("Pizza");
        estudiante.actualizaGenero("Masculino");
        String mostrar_datos = estudiante.obtenerDatos();
        System.out.println(mostrar_datos);
    }
}