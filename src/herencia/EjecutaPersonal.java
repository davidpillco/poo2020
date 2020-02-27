package herencia;
import java.util.Scanner;
public class EjecutaPersonal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String identificacion;
        String estado_civil;
        String fecha_nacimiento;
        String carrera;
        String area;
        String dependencia;
        String presentacion = "";
        System.out.println("CREACIO DE OBJETO ESTUDIANTE");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificaión: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese la carrera ");
        carrera= teclado.nextLine();
        System.out.println("Ingrese su estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese la fecha de nacimiento: ");
        fecha_nacimiento = teclado.nextLine();
        Estudiante est = new Estudiante(nombre, estado_civil, carrera, identificacion, fecha_nacimiento);

        System.out.println("CREACIO DE OBJETO DOCENTE");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificaión: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese la area ");
        area= teclado.nextLine();
        System.out.println("Ingrese su estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese la fecha de nacimiento: ");
        fecha_nacimiento = teclado.nextLine();

        Docente docente = new Docente(nombre,estado_civil,area,identificacion,fecha_nacimiento);

        System.out.println("CREACIO DE OBJETO ADMINISTRATIVO");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificaión: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese la dependencia: ");
        dependencia= teclado.nextLine();
        System.out.println("Ingrese su estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese la fecha de nacimiento: ");
        fecha_nacimiento = teclado.nextLine();

        Administrativo administrativo = new Administrativo(nombre,estado_civil,dependencia,identificacion,fecha_nacimiento);



        System.out.println("-------------");
        presentacion = String.format("%sDatos de objeto Estudiante\n",presentacion);
        presentacion = String.format("%sNombre: %s\nIdentificación: %s\nCarrera: %s\nEstado Civil: %s\nFecha de nacimiento: %s \n\n"
                ,presentacion,est.getNombre(),est.getIdentificacion(),est.getCarrera(),est.getEstado_civil(),est.getFecha_nacimiento());

        presentacion = String.format("%sDatos de objeto Docente\nNombre: %s\nIdentificación: %s\nArea: %s" +
                "\nEstado Civil: %s\nFecha de nacimiento: %s \n\n",presentacion,docente.getNombre(),docente.getIdentificacion(),
                docente.getArea(),docente.getEstado_civil(),docente.getFecha_nacimiento());

        presentacion = String.format("%sDatos de objeto Administrativo\nNombre: %s\nIdentificación: %s\nDependencias: %s" +
                        "\nEstado Civil: %s\nFecha de nacimiento: %s \n\n",presentacion,administrativo.getNombre(),administrativo.getIdentificacion(),
                administrativo.getDependencia(),administrativo.getEstado_civil(),administrativo.getFecha_nacimiento());

        System.out.println(presentacion);

    }
}
