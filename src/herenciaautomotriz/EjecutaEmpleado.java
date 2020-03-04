package herenciaautomotriz;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre;
        String departamento;
        double sueldo_mensual;
        double total_trabajos = 0;
        double salario_minimo;
        double venta;
        double total_ventas = 0;
        double precio_trabajo;
        double num_ventas;
        int num_trabajos;
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
            System.out.println("Ingrese su nombre: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese el departamento: ");
            departamento = teclado.nextLine();
            System.out.println("Ingrese el tipo de empleadol:\n1.-Administrativo\n2.-Mecánico\n3.-Vendedor");
            puesto = teclado.nextInt();
            // Limpieza del buffer
            teclado.nextLine();
            // Empleado administrativo
            if(puesto == 1){
                System.out.println("Ingrese su sueldo mensual: ");
                sueldo_mensual = teclado.nextDouble();
                // Creacion del objeto
                EmpAdmvo empAdmvo = new EmpAdmvo(nombre, departamento, puesto,sueldo_mensual);
                empAdmvo.sueldo();
                cadena = String.format("%s%d\t\t\t%s\t\t\t\t%s\t\t\t%s\t\t\t%.2f\n",
                        cadena, contador, empAdmvo.getNombre(),empAdmvo.getDepartamento(),"Administrativo"
                        ,empAdmvo.presentarSueldo());
                contador = contador+1;
                total = total + empAdmvo.presentarSueldo();
            }
            // Empleado Mecanico
            if(puesto == 2){
                System.out.println("Ingrese el numero de trabajos realizados:  ");
                num_trabajos = teclado.nextInt();
                for (int i = 0; i < num_trabajos; i++){
                    System.out.printf("Ingrese el precio del trabajo %d: ",i+1);
                    precio_trabajo = teclado.nextInt();
                    total_trabajos = total_trabajos + precio_trabajo ;
                }
                EmpMecanico empMecanico = new EmpMecanico(nombre, departamento, puesto,total_trabajos);
                empMecanico.sueldo();
                cadena = String.format("%s%d\t\t\t%s\t\t\t\t%s\t\t\t%s\t\t\t%.2f\n",
                        cadena, contador, empMecanico.getNombre(),empMecanico.getDepartamento(),"Mecánico"
                        ,empMecanico.presentarSueldo());
                contador = contador+1;
                total = total + empMecanico.presentarSueldo();
            }
            // Empleado Vendedor
            if(puesto == 3){
                System.out.println("Ingrese el salario mínimo: ");
                salario_minimo = teclado.nextDouble();
                System.out.println("Ingrese el número de ventas realizadas: ");
                num_ventas = teclado.nextInt();
                for (int i = 0; i < num_ventas; i++){
                    System.out.printf("Ingrese el precio de la venta %d: ",i+1);
                    venta = teclado.nextDouble();
                    total_ventas = total_ventas + (venta * 0.02) ;
                }
                // Creacion del objeto
                EmpVendedor empVendedor = new EmpVendedor(nombre, departamento, puesto,salario_minimo,total_ventas);
                empVendedor.sueldo();
                cadena = String.format("%s%d\t\t\t%s\t\t\t\t%s\t\t\t%s\t\t\t%.2f\n",
                        cadena, contador, empVendedor.getNombre(),empVendedor.getDepartamento(),"Vendedor"
                        ,empVendedor.presentarSueldo());
                contador = contador+1;
                total = total + empVendedor.presentarSueldo();
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
