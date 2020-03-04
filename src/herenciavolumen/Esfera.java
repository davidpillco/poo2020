package herenciavolumen;

public class Esfera extends Volumen{
    private double radio;
    private double volumen;

    /**
     * Constructor para el volumen de la esfera
     * @param figura
     * @param radio
     */
    public Esfera (int figura, double radio){
        this.radio = radio;
        this.figura = figura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }

    /**
     * Metodo para el calculo del volumen de la esfera
     */
    public void volumenEsfera (){

        volumen = 4/3 * Math.PI * (Math.pow(radio,3));
    }

    /**
     * Metodo para presentar el volumen de la esfera
     * @return volumen
     */
    public double presentarVolumen(){
        return volumen;
    }
}
