package herenciavolumen;

public class Cono extends Volumen {
    private double radio;
    private double altura;
    private double volumen;

    /**
     * Constructor para el volumen del cono
     * @param figura
     * @param radio
     */
    public Cono (int figura, double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.figura = figura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    /**
     * Metodo para el calculo del volumen del cono
     */
    public void volumenCono (){

        volumen = (Math.PI * (Math.pow(radio,2)*altura))/3;
    }

    /**
     * Metodo para presentar el volumen del cono
     * @return volumen
     */
    public double presentarVolumen(){
        return volumen;
    }
}
