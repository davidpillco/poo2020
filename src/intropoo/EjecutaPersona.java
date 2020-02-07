package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {
        // Creacion de objeto, con inicializacion de variables
        Persona persona = new Persona("Masculino","catolica", 19,"David Pillco");
        System.out.println(persona.getNombre());
        System.out.println("Edad"+persona.getNombre());
        System.out.println("Religión"+persona.getReligion());
        System.out.println("Edad"+persona.getEdad());
        System.out.println("Nombre:"+persona.getNombre());
    }
}
