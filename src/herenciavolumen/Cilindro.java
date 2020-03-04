package herenciavolumen;

public class Cilindro extends Volumen{
    private double radio;
    private double altura;
    private double volumen;

    /**
     * Constructor para el volumen del cilindro
     * @param figura
     * @param radio
     */
    public Cilindro (int figura, double radio, double altura){
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
     * Metodo para el calculo del area del cilindro
     */
    public void volumenCilindro (){

        volumen = Math.PI * (Math.pow(radio,2)*altura);
    }

    /**
     * Metodo para presentar el area del circulo
     * @return area
     */
    public double presentarVolumen(){

        return volumen;
    }
}

