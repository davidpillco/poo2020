package polimorfismodeudores;
import java.util.Scanner;
public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        // Declaración de variables
        String cadena = "";
        boolean val = true;
        int prestamo;
        double total_intereses = 0;
        int contador = 0;
        int condicion;
        // Scanner para el ingreso por teclado del usuario
        Scanner teclado = new Scanner(System.in);
        cadena = String.format("%s%s\n%s\t\t\t%s\t\t\t%s\t\t\t%s\n", cadena, "REPORTE DE CLIENTES DEUDORES","No.Cliente",
                "NOMBRE","No. Cuenta", "Interés por pagar");
        // Ciclo para el ingreso de los datos
        while (val == true){

            // Ingreso del tipo de prestamo
            System.out.println("Ingrese el tipo de prestamo realizado:\n1.- Préstamo Personal\n2.-Préstamo Hipotecario\n3.-Préstamo Auto");
            prestamo = teclado.nextInt();
            // Limpieza del buffer
            teclado.nextLine();
            // Prestamo personal
            if(prestamo == 1){
                PrestamoPersonal prestamoPersonal = new PrestamoPersonal();
                System.out.println("Ingrese su nombre: ");
                prestamoPersonal.setNombre(teclado.nextLine());
                System.out.println("Ingrese su número de cuenta: ");
                prestamoPersonal.setNum_cuenta(teclado.nextLine());
                System.out.println("Ingrese el monto total del préstamo: ");
                prestamoPersonal.setMonto(teclado.nextDouble());
                System.out.println("Ingrese el plazo de inversión: ");
                prestamoPersonal.setPlazo(teclado.nextDouble());
                prestamoPersonal.calcularInteres();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, prestamoPersonal.getNombre(),prestamoPersonal.getNum_cuenta(),
                        prestamoPersonal.getInteres());
                contador = contador+1;
                total_intereses = total_intereses + prestamoPersonal.getInteres();
            }
            // Condición para el prestamo hipotecario
            if(prestamo == 2){
                PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario();
                System.out.println("Ingrese su nombre: ");
                prestamoHipotecario.setNombre(teclado.nextLine());
                System.out.println("Ingrese su número de cuenta: ");
                prestamoHipotecario.setNum_cuenta(teclado.nextLine());
                System.out.println("Ingrese el monto total del préstamo: ");
                prestamoHipotecario.setPrec_casa(teclado.nextDouble());
                System.out.println("Ingrese el plazo de inversión: ");
                prestamoHipotecario.setPlazo(teclado.nextDouble());
                prestamoHipotecario.calcularInteres();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, prestamoHipotecario.getNombre(),prestamoHipotecario.getNum_cuenta(),
                        prestamoHipotecario.getInteres());
                contador = contador+1;
                total_intereses = total_intereses + prestamoHipotecario.getInteres();
            }
            // Condicion para prestamo de un autp
            if(prestamo == 3){
                PrestamoAuto prestamoAuto = new PrestamoAuto();
                System.out.println("Ingrese su nombre: ");
                prestamoAuto.setNombre(teclado.nextLine());
                System.out.println("Ingrese su número de cuenta: ");
                prestamoAuto.setNum_cuenta(teclado.nextLine());
                System.out.println("Ingrese el monto total del préstamo: ");
                prestamoAuto.setPrec_auto(teclado.nextDouble());
                System.out.println("Ingrese el plazo de inversión: ");
                prestamoAuto.setPlazo(teclado.nextDouble());
                prestamoAuto.calcularInteres();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, prestamoAuto.getNombre(),prestamoAuto.getNum_cuenta(),
                        prestamoAuto.getInteres());
                contador = contador+1;
                total_intereses = total_intereses + prestamoAuto.getInteres();
            }
            // Evaluacion para el ingreso de mas prestamos
            System.out.println("Desea ingrear otro prestamo:\n1._Si\n2._No\n");
            condicion = teclado.nextInt();
            if (condicion == 2){
                val = false;
            }
            teclado.nextLine();
        }
        // Presentacion final
        System.out.printf("%sTOTAL:%d clientes\t\t\t\t\t\t\t\t\t\t\t\t%.2f", cadena,contador,total_intereses);
    }
}
