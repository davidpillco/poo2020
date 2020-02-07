package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {
        // Creacion de objeto, con inicializacion de variables
        Persona persona = new Persona("Masculino","catolica", 19,"David Pillco");
        System.out.println(persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Religión: "+persona.getReligion());
        System.out.println("Edad: "+persona.getEdad());

        // Creación de objeto construcot 2
        Persona persona2 = new Persona("Masculino","catolica", 19);
        Persona persona3 = new Persona("Femenino","ateo", 25);
        System.out.println("Edad persona 2: "+persona2.getEdad());
        System.out.println("Edad persona 3: "+persona3.getEdad());


    }
}
