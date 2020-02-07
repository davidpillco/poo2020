package taller1;

public class EjecutaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.actualizaRaza("Perro");
        animal.actualizaPeso(90);
        animal.actualizarcomida("Pro-can");
        animal.actualizacelo("No");
        animal.actualizaMetros(1000);
        animal.actualizaSueno(10);
        String mostrar_datos = animal.obtenerDatos();
        System.out.println(mostrar_datos);
    }
}