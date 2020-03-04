package herenciadeudores;
import java.util.Scanner;
public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        // Declaración de variables
        String cadena = "";
        boolean val = true;
        String nombre;
        String num_cuenta;
        double monto;
        double prec_casa;
        double prec_auto;
        int prestamo;
        double plazo;
        int seguro;
        double prec_seguro;
        double total = 0;
        double total_intereses = 0;
        int contador = 0;
        int condicion;
        // Scanner para el ingreso por teclado del usuario
        Scanner teclado = new Scanner(System.in);
        cadena = String.format("%s%s\n%s\t\t\t%s\t\t\t%s\t\t\t%s\n", cadena, "REPORTE DE CLIENTES DEUDORES","No.Cliente",
                "NOMBRE","No. Cuenta", "Interés por pagar");
        // Ciclo para el ingreso de los datos
        while (val == true){
            System.out.println("Ingrese su nombre: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese su número de cuenta: ");
            num_cuenta = teclado.nextLine();
            // Ingreso del tipo de prestamo
            System.out.println("Ingrese el tipo de prestamo realizado:\n1.- Préstamo Personal\n2.-Préstamo Hipotecario\n3.-Préstamo Auto");
            prestamo = teclado.nextInt();
            // Limpieza del buffer
            teclado.nextLine();
            // Prestamo personal
            if(prestamo == 1){
                System.out.println("Ingrese el monto total del préstamo: ");
                monto = teclado.nextDouble();
                System.out.println("Ingrese el plazo de inversión: ");
                plazo = teclado.nextDouble();
                System.out.println("Seguro para el prestamo:\n1.- Si \n2.- No: ");
                seguro = teclado.nextInt();
                // Condicion para evaluar si desea seguro o no
                if(seguro == 1){
                    System.out.println("Ingrese el precio del seguro: ");
                    prec_seguro = teclado.nextDouble();
                    total = monto + prec_seguro;
                }else {
                    total = monto;
                }
                // Creacion del objeto
                PrestamoPersonal prestamoPersonal = new PrestamoPersonal(nombre, num_cuenta,total,plazo);
                prestamoPersonal.intereses();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, prestamoPersonal.getNombre(),prestamoPersonal.getNum_cuenta(),
                        prestamoPersonal.presentarIntereses());
                contador = contador+1;
                total_intereses = total_intereses + prestamoPersonal.presentarIntereses();
            }
            // Condición para el prestamo hipotecario
            if(prestamo == 2){
                System.out.println("Ingrese el monto total del préstamo: ");
                prec_casa = teclado.nextDouble();
                System.out.println("Ingrese el plazo de inversión: ");
                plazo = teclado.nextDouble();
                System.out.println("Seguro para el prestamo:\n1.- Si\n2.- No: ");
                seguro = teclado.nextInt();
                // Condicion para evaluar si desea seguro o no
                if(seguro == 1){
                    System.out.println("Ingrese el precio del seguro: ");
                    prec_seguro = teclado.nextDouble();
                    total = prec_casa + prec_seguro;
                }else {
                    total = prec_casa;
                }
                // Creacion del objeto
                PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(nombre, num_cuenta,total,plazo);
                prestamoHipotecario.intereses();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, prestamoHipotecario.getNombre(),prestamoHipotecario.getNum_cuenta(),
                        prestamoHipotecario.presentarIntereses());
                contador = contador+1;
                total_intereses = total_intereses + prestamoHipotecario.presentarIntereses();
            }
            // Condicion para prestamo de un autp
            if(prestamo == 3){
                System.out.println("Ingrese el monto total del préstamo: ");
                prec_auto = teclado.nextDouble();
                System.out.println("Ingrese el plazo de inversión: ");
                plazo = teclado.nextDouble();
                System.out.println("Seguro para el prestamo:1.- Si \n2.- No: ");
                seguro = teclado.nextInt();
                // Condicion para evaluar si desea seguro o no
                if(seguro == 1){
                    System.out.println("Ingrese el precio del seguro: ");
                    prec_seguro = teclado.nextDouble();
                    total = prec_auto + prec_seguro;
                }else {
                    total = prec_auto;
                }
                // Creacion del objeto
                PrestamoAuto prestamoAuto = new PrestamoAuto(nombre, num_cuenta,total,plazo);
                prestamoAuto.intereses();
                cadena = String.format("%s%d\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t\t\t%.2f\n",
                        cadena, contador, prestamoAuto.getNombre(),prestamoAuto.getNum_cuenta(),
                        prestamoAuto.presentarIntereses());
                contador = contador+1;
                total_intereses = total_intereses + prestamoAuto.presentarIntereses();
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
