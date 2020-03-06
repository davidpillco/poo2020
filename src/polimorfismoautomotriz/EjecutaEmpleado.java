package polimorfismoautomotriz;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Declaracion de variables
        String cadena = "";
        boolean val = true;
        int condicion;
        int puesto;
        int contador = 0;
        double total = 0;
        // Scanner para el ingreso por teclado del usuario
        Scanner teclado = new Scanner(System.in);
        cadena = String.format("%s%s\n%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t\t%s\n", cadena, "Reporte de nomina","RFC",
                "NOMBRE","DEPTO", "PUESTO", "SUELDO QUINCENA");
        // Ciclo para el ingreso de datos
        while (val == true){
            System.out.println("Ingrese el tipo de empleadol:\n1.-Administrativo\n2.-Mecánico\n3.-Vendedor");
            puesto = teclado.nextInt();
            // Limpieza del buffer
            teclado.nextLine();
            // Empleado administrativo
            if(puesto == 1){
                EmpAdmvo empAdmvo = new EmpAdmvo();
                System.out.println("Ingrese su nombre: ");
                empAdmvo.setNombre(teclado.nextLine());
                System.out.println("Ingrese el departamento: ");
                empAdmvo.setDepartamento(teclado.nextLine());
                System.out.println("Ingrese su sueldo mensual: ");
                empAdmvo.setSueldo_mensual(teclado.nextDouble());
                empAdmvo.calcularSuedo();
                cadena = String.format("%s%d\t\t\t%s\t\t\t\t%s\t\t\t%s\t\t\t%.2f\n",
                        cadena, contador, empAdmvo.getNombre(),empAdmvo.getDepartamento(),"Administrativo"
                        ,empAdmvo.getSueldo());
                contador = contador+1;
                total = total + empAdmvo.getSueldo();
            }
            // Empleado Mecanico
            if(puesto == 2){
                double num_trabajos;
                double precio_trabajo;
                double total_trabajos=0;
                EmpMecanico empMecanico = new EmpMecanico();
                System.out.println("Ingrese su nombre: ");
                empMecanico.setNombre(teclado.nextLine());
                System.out.println("Ingrese el departamento: ");
                empMecanico.setDepartamento(teclado.nextLine());
                System.out.println("Ingrese el numero de trabajos realizados:  ");
                num_trabajos = teclado.nextInt();
                for (int i = 0; i < num_trabajos; i++){
                    System.out.printf("Ingrese el precio del trabajo %d: ",i+1);
                    precio_trabajo = teclado.nextInt();
                    total_trabajos = total_trabajos + precio_trabajo ;
                }
                empMecanico.setTotal_trabajos(total_trabajos);
                empMecanico.calcularSuedo();
                cadena = String.format("%s%d\t\t\t%s\t\t\t\t%s\t\t\t%s\t\t\t%.2f\n",
                        cadena, contador, empMecanico.getNombre(),empMecanico.getDepartamento(),"Mecánico"
                        ,empMecanico.getSueldo());
                contador = contador+1;
                total = total + empMecanico.getSueldo();
            }
            // Empleado Vendedor
            if(puesto == 3){
                double num_ventas;
                double venta;
                double total_ventas = 0;
                EmpVendedor empVendedor = new EmpVendedor();
                System.out.println("Ingrese su nombre: ");
                empVendedor.setNombre(teclado.nextLine());
                System.out.println("Ingrese el departamento: ");
                empVendedor.setDepartamento(teclado.nextLine());
                System.out.println("Ingrese el salario mínimo: ");
                empVendedor.setSalario_minimo(teclado.nextDouble());
                System.out.println("Ingrese el número de ventas realizadas: ");
                num_ventas = teclado.nextInt();
                for (int i = 0; i < num_ventas; i++){
                    System.out.printf("Ingrese el precio de la venta %d: ",i+1);
                    venta = teclado.nextDouble();
                    total_ventas = total_ventas + (venta * 0.02);
                    empVendedor.setTotal_ventas(total_ventas);
                }
                empVendedor.calcularSuedo();
                cadena = String.format("%s%d\t\t\t%s\t\t\t\t%s\t\t\t%s\t\t\t%.2f\n",
                        cadena, contador, empVendedor.getNombre(),empVendedor.getDepartamento(),"Vendedor"
                        ,empVendedor.getSueldo());
                contador = contador+1;
                total = total + empVendedor.getSueldo();
            }
            // Pregunta para el ingreso de mas empleados
            System.out.println("Desea ingrear otro empleado:\n1._Si\n2._No\n");
            condicion = teclado.nextInt();
            if (condicion == 2){
                val = false;
            }
            teclado.nextLine();
        }
        // Presentación final
        System.out.printf("%sTOTAL:%d empleados\t\t\t\t\t\t\t\t\t\t\t\t%.2f", cadena,contador,total);
    }
}
