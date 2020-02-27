package herencia_empleado;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre;
        String cargo;
        String dependencia;
        double horas;
        double valorHora;
        double valorMensual;
        int condicion;
        Scanner teclado = new Scanner(System.in);
        // Pregunta para el usuario a que tipo de empleado quiere calcular
        System.out.println("De que tipo de empleado desea calcular el sueldo 1.- Empleado por hora | " +
                "2.- Empleado Asalariado");
        condicion = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el cargo: ");
        cargo = teclado.nextLine();
        System.out.println("Ingrese la dependecia: ");
        dependencia = teclado.nextLine();
        if(condicion == 1){
            System.out.println("Ingrese las horas trabajadas: ");
            horas = teclado.nextDouble();
            System.out.println("Ingrese el valor por hora: ");
            valorHora = teclado.nextDouble();
            EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora(nombre,cargo,dependencia,horas,valorHora);
            System.out.printf("EMPLEADO POR HORA\nNombre: %s\nCargo: %s\nDependencia: %s\nHoras trabajadas: %.2f\n" +
                    "Valor por hora:%.2f\nSueldo:%.2f\n",empleadoPorHora.getNombre(),empleadoPorHora.getCargo(),
                    empleadoPorHora.getDependencia(),empleadoPorHora.getHoras(),empleadoPorHora.getValorHora(),
                    empleadoPorHora.calcularSueldoPorHoras());
        }else{
            System.out.println("Ingrese el valor mensual: ");
            valorMensual = teclado.nextDouble();
            EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(nombre,cargo,dependencia,valorMensual);
            System.out.printf("EMPLEADO ASALARIADO\nNombre: %s\nCargo: %s\nDependencia: %s\nSueldo: %.2f",
                    empleadoAsalariado.getNombre(),empleadoAsalariado.getCargo(),empleadoAsalariado.getDependencia(),
                    empleadoAsalariado.calcularSueldoMensual());
        }
    }
}
