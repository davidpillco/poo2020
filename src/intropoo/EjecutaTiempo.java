package intropoo;

public class EjecutaTiempo {
    public static void main(String[] args) {
        // Creación de objeto tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(50);
        tiempo.actualizar_segundo(35);
        String mostrar_tiempo = tiempo.obtener_tiempo();
        System.out.println(mostrar_tiempo);
    }
}