package taller1;

public class Estudiante {
    // Declaración de variables globales
    private String nombre;
    private int edad;
    private String genero;
    private String comida;
    private String materia;
    private String libro;

    /**
     * Metodo que sirve para comida
     * @return comida
     */
    public String estudianteComiendo(){
        return this.comida;
    }

    /**
     * Metodo que sirve para genero
     * @return genero
     */
    public String estudianteGenero(){
        return this.genero;
    }

    /**
     * Metodo que sirve para indicar el nombre
     * @return nombre
     */
    public String estudianteNombre(){
        return this.nombre;
    }
    /**
     * Metodo que sirve para indicar que el estudiante esta estudiando
     * @return materia
     */
    public String estudia(){
        return this.materia;
    }

    /**
     * Metodo que sirve para indicar que el estudiante esta leyendo
     * @return libro
     */
    public String lee(){
        return this.libro;
    }


    /**
     * Metodo que sirve para indicar que el estudiante esta actualizando la edad
     * @return edad
     */
    public int edad(){
        return this.edad;
    }

    public String obtenerDatos(){
        String data = "Nombre:"+nombre+"\n"+"Edad:"+edad+"\n"+"Genero:"+genero+"\n"+
                "Comida:"+comida+"\n"+"Materia:"+materia+"\n"+"Libro:"+libro;
        return data;
    }

    /**
     *Metodo que sirve para actualizar la comida
     * @param comida
     */
    public void actualizarcomida(String comida){
        this.comida = comida;
    }
    /**
     *Metodo que sirve para actualizar el noombre
     * @param nombre
     */
    public void actualizaNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     *Metodo que sirve para actualizar la edad
     * @param edad
     *
     */
    public void actualizaEdad(int edad){
        this.edad = edad;
    }
    /**
     *Metodo que sirve para actualizar la carrera
     * @param materia
     */
    public void actualizaMateria(String materia){
        this.materia = materia;
    }
    /**
     *Metodo que sirve para actualizar el libro
     * @param libro
     */
    public void actualizaLibro(String libro){
        this.libro = libro;
    }
    /**
     *Metodo que sirve para actualizar el genero
     * @param genero
     */
    public void actualizaGenero(String genero){
        this.genero = genero;
    }

}