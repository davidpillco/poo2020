package polimorfismo_poo;
import java.util.Scanner;
public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        // Obtener el sueldo quincenal de un empleado por horas
        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo sueldo quincenal empleado por horas");
        System.out.println("Ingrese las horas trabajadas: ");
        empHoras.setHoras_trabajadas(teclado.nextDouble());
        System.out.println("Ingrese la cuota por horas: ");
        empHoras.setCuota_por_hora(teclado.nextDouble());
        empHoras.calcularSueldoQna();
        System.out.println("El sueldo quincenal es:"+empHoras.getSueldo());

        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();
        System.out.println("Calculo de sueldo quincenal de un empleado asalariado");
        System.out.println("Ingrese el sueldo mensual: ");
        empAs.setSueldo_mensual(teclado.nextDouble());
        empAs.calcularSueldoQna();
        System.out.println("El sueldo quincenal es:"+empAs.getSueldo());
    }
}
