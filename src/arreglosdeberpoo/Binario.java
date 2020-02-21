package arreglosdeberpoo;

public class Binario {

    // Declaracion de variables
    private String num_binario;
    private static String cadena;
    private double decimal;
    private double suma = 0;
    private int producto = 0;
    /**
     *  Constructor
     * @param
     *
     */
    public Binario(String num_binario) {
        this.num_binario = num_binario;
    }
    /**
     * Metodo conversion para convertir de String en ints
     * @return numeros
     */
    public int[] conversion() {
        int[] numeros = new int[num_binario.length()];
        for (int i = 0; i < num_binario.length(); i++) {
            numeros[i] = Character.getNumericValue(num_binario.charAt(i));
        }
        return numeros;
    }

    /**
     * Metodo para el calculo del numero decimal
     * @return
     */
    public double getDecimal() {
        // Se inicia el acumulador
        suma = 0;
        // Variable para determinar desde que exponente empezará
        int j = num_binario.length()-1;
        // Ciclo para las operaciones de cada una de los digitos
        for (int i = 0; i < num_binario.length(); i++) {
            decimal = conversion()[i] * (Math.pow(2,j-i));
            suma = suma + decimal;
        }
        // Se resta el expoente
        j=j-1;
        return suma;
    }

    /**
     * Metodo para la presentacion final en pantalla
     * @return
     */
    public  String presentar() {
        cadena =String.format("%s en binario = %.2f en decimal",num_binario,getDecimal());
        return cadena;
    }
}
