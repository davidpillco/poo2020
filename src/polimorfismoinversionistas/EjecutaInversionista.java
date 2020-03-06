package polimorfismoinversionistas;
import java.util.Scanner;
public class EjecutaInversionista {
    public static void main(String[] args) {
        // Declaración de variables
        String cadena = "";
        boolean val = true;
        String nombre;
        double total_intereses = 0;
        int contador = 0;
        int condicion;
        int cuenta;
        // Scanner para el ingreso por teclado del usuario
        Scanner teclado = new Scanner(System.in);
        cadena = String.format("%s%s\n%s\t\t\t%s\t\t\t%s\t\t\t%s\n", cadena, "REPORTE DE INVERSIONES", "No.Cliente",
                "NOMBRE", "No. Cuenta", "Interés ganado");
        // Ciclo para el ingreso de los datos
        while (val == true) {
            // Ingreso del tipo de prestamo
            System.out.println("Ingrese el tipo de cuenta del inversionista:\n1.-Cuenta de ahorro\n2.-Cuenta Maestra\n3.-Cuenta pagaré\n");
            cuenta = teclado.nextInt();
            // Limpieza del buffer
            teclado.nextLine();
            // Cuenta de ahorros
            if (cuenta == 1) {
                CuentaAhorro cuentaAhorro = new CuentaAhorro();
                System.out.println("Ingrese su nombre: ");
                cuentaAhorro.setNombre(teclado.nextLine());
                System.out.println("Ingrese su número de cuenta: ");
                cuentaAhorro.setNum_cuenta(teclado.nextLine());
                System.out.println("Ingrese el capital: ");
                cuentaAhorro.setCapital(teclado.nextDouble());
                System.out.println("Ingrese los años en lo que pagará el capital: ");
                cuentaAhorro.setPlazo(teclado.nextDouble());
                cuentaAhorro.calcularInteres();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, cuentaAhorro.getNombre(), cuentaAhorro.getNum_cuenta(),
                        cuentaAhorro.getInteres());
                contador = contador + 1;
                total_intereses = total_intereses + cuentaAhorro.getInteres();
            }
            // Condición para el cuenta maestra
            if (cuenta == 2) {
                CuentaMaestra cuentaMaestra = new CuentaMaestra();
                System.out.println("Ingrese su nombre: ");
                cuentaMaestra.setNombre(teclado.nextLine());
                System.out.println("Ingrese su número de cuenta: ");
                cuentaMaestra.setNum_cuenta(teclado.nextLine());
                System.out.println("Ingrese el capital con el que inicio: ");
                cuentaMaestra.setCapital_inicio(teclado.nextDouble());
                System.out.println("Ingrese el capital que tiene actualmente: ");
                cuentaMaestra.setCapital_actual(teclado.nextDouble());
                System.out.println("Ingrese los años desde su capital inicial: ");
                cuentaMaestra.setAnios(teclado.nextDouble());
                cuentaMaestra.calcularInteres();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, cuentaMaestra.getNombre(), cuentaMaestra.getNum_cuenta(),
                        cuentaMaestra.getInteres());
                contador = contador + 1;
                total_intereses = total_intereses + cuentaMaestra.getInteres();
            }
            // Condicion para la cuenta pagare
            if (cuenta == 3) {
                Pagare pagare = new Pagare();
                System.out.println("Ingrese su nombre: ");
                pagare.setNombre(teclado.nextLine());
                System.out.println("Ingrese su número de cuenta: ");
                pagare.setNum_cuenta(teclado.nextLine());
                System.out.println("Ingrese el capital que pagará: ");
                pagare.setCapital(teclado.nextDouble());
                System.out.println("Ingrese los años en lo que pagará el capital: ");
                pagare.setAnios(teclado.nextDouble());
                pagare.calcularInteres();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, pagare.getNombre(), pagare.getNum_cuenta(),
                        pagare.getInteres());
                contador = contador + 1;
                total_intereses = total_intereses + pagare.getInteres();
            }
            // Evaluacion para el ingreso de mas cuentas de inversionistas
            System.out.println("Desea ingrear otro inversionista:\n1._Si\n2._No\n");
            condicion = teclado.nextInt();
            if (condicion == 2) {
                val = false;
            }
            teclado.nextLine();
        }
        // Presentacion final
        System.out.printf("%sTOTAL:%d clientes\t\t\t\t\t\t\t\t\t\t\t\t%.2f", cadena, contador, total_intereses);
    }
}

