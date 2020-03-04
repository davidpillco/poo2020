package herenciavolumen;

public class Cubo extends Volumen {
    private double arista;
    private double volumen;

    /**
     * Constructor para el volumen del cubo
     * @param figura
     * @param arista
     */
    public Cubo (int figura, double arista){
        this.arista = arista;
        this.figura = figura;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double radio) {

        this.arista = arista;
    }
    /**
     * Metodo para el calculo del volumen del cubo
     */
    public void volumenCubo (){

        volumen = Math.pow(arista,3);
    }

    /**
     * Metodo para presentar el volumen del cubp
     * @return volumen
     */
    public double presentarVolumen(){
        return volumen;
    }
}
