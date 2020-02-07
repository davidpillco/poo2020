package intropoo;

public class Tiempo {
    // definición de atributos globales
    private int hora;
    private int minuto;
    private int segundo;

    /**
     *  Metodo para obtener la hora
     * @return this.hora
     */
    public int obtener_hora(){

        return this.hora;
    }

    /**
     * Metodo para obtener los minutos
     * @return this.minuto
     */
    public int obtener_minuto(){

        return this.minuto;
    }

    /**
     * / Metodo para obtener los segundos
     * @return this.segundo
     */
    public int obtener_segundo(){

        return this.segundo;
    }

    /**
     * Método para obtener el tiempo
     * @return tiempo
     */
    public String obtener_tiempo(){
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }

    /**
     * Método para actualizar la variable hora
     * @param hora
     */
    public void actualizar_hora(int hora){
        // Con el this hacemos referencia a las variables globales
        this.hora = hora;
    }

    /**
     * Método para actualizar la variable minuto
     * @param minuto
     */
    public void actualizar_minuto(int minuto){
        // Con el this hacemos referencia a las variables globales
        this.minuto = minuto;
    }

    /**
     * Método para actualizar la variable segundo
     * @param segundo
     */
    public void actualizar_segundo(int segundo){
        // Con el this hacemos referencia a las variables globales
        this.segundo = segundo;
    }

}

