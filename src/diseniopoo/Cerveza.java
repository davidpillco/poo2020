package diseniopoo;

public class Cerveza {
    // Declaración de variables
    private double precio;
    private int unidades_vendidas;
    private String nombre;
    private String tipo;


    /**
     * Cerveza
     * @param precio
     * @param unidades_vendidas
     * @param nombre
     * @param tipo
     */
    public Cerveza (double precio, int unidades_vendidas, String nombre, String tipo){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double total_ventas (){
        double total = unidades_vendidas * precio;
        return total;
    }
    /**
     * Metodo para la presentación
     * @return
     */
    public String presentar(){
        String presentar = "Cerveza:" +nombre+"\n"+"Tipo:"+tipo+"\n"+"Precio:"+precio+"\n"
                +"Unidades vendidas:"+unidades_vendidas+"\n\n"+"TOTAL VENTAS:"+total_ventas();
        return presentar;
    }
}
