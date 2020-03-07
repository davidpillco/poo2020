package datos_tipo_objeto;
import java.security.cert.CertStoreException;
import java.util.Scanner;
public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Declaración de variables
        int contador;
        int opcion;
        Estudiante[] estudiantes = new Estudiante[3];
        Estudiante estudiante;
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        for (contador = 0; contador < estudiantes.length; contador++) {
                Estudiante est = new Estudiante();
                System.out.println("Ingrese su nombre: ");
                est.setNombre(teclado.nextLine());
                System.out.println("Ingrese su número de cédula: ");
                est.setCedula(teclado.nextLine());
                System.out.println("Ingrese su edad: ");
                est.setEdad(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Ingrese su carrera que cursa: ");
                est.setCarrera(teclado.nextLine());
                System.out.println("Ingrese su correo electronico: ");
                est.setCorreo(teclado.nextLine());
                // Asignamos el objeto est a la variables estudiante
                estudiantes[contador] = est;
            }
        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("Cédula\t\tNombre\t\tEdad\t\tCarrera\t\tCorreo");
        int edad_acum = 0;
        for(contador = 0; contador < estudiantes.length; contador++){
            edad_acum = edad_acum + estudiantes[contador].getEdad()/estudiantes.length;
            System.out.println(estudiantes[contador].getCedula()+"\t\t\t"+estudiantes[contador].getNombre()+"\t\t\t"+
                    estudiantes[contador].getEdad()+"\t\t\t"+estudiantes[contador].getCarrera()+"\t\t\t"+
                    estudiantes[contador].getCorreo()+"\t\t\t");
        }
        System.out.println("Edad promedio de los estudiantes:"+edad_acum);
        System.out.println("FIN DEL PROGRAMA");
        }
    }

