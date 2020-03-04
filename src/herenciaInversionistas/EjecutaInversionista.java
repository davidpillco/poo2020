package herenciaInversionistas;
import herenciadeudores.PrestamoAuto;
import herenciadeudores.PrestamoHipotecario;
import herenciadeudores.PrestamoPersonal;

import java.util.Scanner;
public class EjecutaInversionista {
    public static void main(String[] args) {
        // Declaración de variables
        String cadena = "";
        boolean val = true;
        String nombre;
        double anios;
        double capital;
        double capital_inicio;
        double capital_actual;
        String num_cuenta;
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
            System.out.println("Ingrese su nombre: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese su número de cuenta: ");
            num_cuenta = teclado.nextLine();
            // Ingreso del tipo de prestamo
            System.out.println("Ingrese el tipo de cuenta del inversionista:\n1.-Cuenta de ahorro\n2.-Cuenta Maestra\n3.-Cuenta pagaré\n");
            cuenta = teclado.nextInt();
            // Limpieza del buffer
            teclado.nextLine();
            // Cuenta de ahorros
            if (cuenta == 1) {
                System.out.println("Ingrese el capital: ");
                capital = teclado.nextDouble();
                System.out.println("Ingrese los años en lo que pagará el capital: ");
                anios = teclado.nextDouble();
                // Creacion del objeto
                CuentaAhorro cuentaAhorro = new CuentaAhorro(nombre, num_cuenta, capital, anios);
                cuentaAhorro.interes();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, cuentaAhorro.getNombre(), cuentaAhorro.getNum_cuenta(),
                        cuentaAhorro.presentarIntereses());
                contador = contador + 1;
                total_intereses = total_intereses + cuentaAhorro.presentarIntereses();
            }
            // Condición para el cuenta maestra
            if (cuenta == 2) {
                System.out.println("Ingrese el capital con el que inicio: ");
                capital_inicio = teclado.nextDouble();
                System.out.println("Ingrese el capital que tiene actualmente: ");
                capital_actual = teclado.nextDouble();
                System.out.println("Ingrese los años desde su capital inicial: ");
                anios = teclado.nextDouble();
                // Creacion del objeto
                CuentaMaestra cuentaMaestra = new CuentaMaestra(nombre, num_cuenta, capital_inicio, capital_actual, anios);
                cuentaMaestra.interes();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, cuentaMaestra.getNombre(), cuentaMaestra.getNum_cuenta(),
                        cuentaMaestra.presentarIntereses());
                contador = contador + 1;
                total_intereses = total_intereses + cuentaMaestra.presentarIntereses();
            }
            // Condicion para la cuenta pagare
            if (cuenta == 3) {
                System.out.println("Ingrese el capital que pagará: ");
                capital = teclado.nextDouble();
                System.out.println("Ingrese los años en lo que pagará el capital: ");
                anios = teclado.nextDouble();
                // Creacion del objeto
                Pagare pagare = new Pagare(nombre, num_cuenta, capital, anios);
                pagare.interes();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, pagare.getNombre(), pagare.getNum_cuenta(),
                        pagare.presentarIntereses());
                contador = contador + 1;
                total_intereses = total_intereses + pagare.presentarIntereses();
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

