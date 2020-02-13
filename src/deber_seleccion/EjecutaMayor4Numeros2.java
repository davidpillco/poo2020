package deber_seleccion;

public class EjecutaMayor4Numeros2 {
    // Declaracion  de variables
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private String cadenaFinal;
    private double num;
    // Metodos del ejercicio
    /**
     * Metodo constructor
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     */
    public EjecutaMayor4Numeros2(double num1, double num2, double num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    /**
     * Metodo para saber el numero mas alto
     * @return numAlto
     */
    public double numeroAlto(double num1, double num2, double num3, double num4) {
        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            num = num1;
        } else if ((num2 > num3) && (num2 > num4)) {
            num = num2;
        } else if (num3 > num4) {
            num= num3;
        } else {
            num = num4;
        }
        return num;
    }

    /**
     * Metodo para obtener el numero 1
     * @return num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * Metodo para guardar el numero 1
     * @return num1
     */

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * Metodo para obtener el numero 2
     * @return num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * Metodo para guardar el numero 2
     * @param num2
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }


    /**
     * Metodo para obtener el numero 3
     * @return num3
     */
    public double getNum3() {
        return num3;
    }


    /**
     * Metodo para guardar el numero 3
     * @param num3
     */
    public void setNum3(double num3) {
        this.num3 = num3;
    }

    /**
     * Metodo para obtener el numero 4
     * @return num4
     */
    public double getNum4() {
        return num4;
    }

    /**
     * Metodo para guardar el numero 4
     * @param  num4
     */
    public void setNum4(double num4) {
        this.num4 = num4;
    }

    /**
     * Metodo para obtener la cadena final
     * @return cadenaFinal
     */
    public String getCadenaFinal() {
        return cadenaFinal;
    }

    /**
     * Metodo para obtener la cadena final
     * @param  cadenaFinal
     */
    public void setCadenaFinal(String cadenaFinal) {
        this.cadenaFinal = cadenaFinal;
    }

    /**
     * Presentación final
     * @param d
     * @return
     */
    public String obtenerCadena(double d){
        cadenaFinal = "El número mas alto es el: "+ d ;
        return cadenaFinal;
    }
}


