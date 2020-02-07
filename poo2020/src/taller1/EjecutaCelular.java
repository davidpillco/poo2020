package taller1;

public class EjecutaCelular {
    public static void main(String[] args) {

        // Creación de Objeto Celular

        Celular celular = new Celular();

        celular.actualizar_marca("Iphone");
        celular.actualizar_modelo("X");
        celular.actualizar_procesador("Apple A11 (6 núcleos)");
        celular.actualizar_ram("3 GB");
        celular.actualizar_rom("256 GB");

        String mostrar_informacion = celular.obtener_infoCelular();
        System.out.println(mostrar_informacion);

    }
}
