package deber_seleccion;

import javax.swing.*;

public class EjecutaEjercicio14_1 {
    public static void main(String[] args) {
        // Declaracion de variables
        double calif1;
        double calif2;
        double calif3;
        double calif4;
        // Ingreso de los datos
        calif1 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota Examen 1"));
        calif2 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota Examen 2"));
        calif3 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota Examen 3"));
        calif4 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota Examen 4"));
        // Creacion de objeto alumno
        Ejercicio14_1 alumno = new Ejercicio14_1(calif1,calif2,calif3,calif4);
        // Muestra en pantalla de resultados
        JOptionPane.showMessageDialog(null, "   OBTENCION PROMEDIO ESTUDIANTE\n"+
                "Notas: "+alumno.getCalif1()+"\n             "+alumno.getCalif2()+"\n             "+alumno.getCalif3()+
                "\n             "+alumno.getCalif4()+"\nPROMEDIO: "+alumno.promedioAlumno()+"\n"+
                "ESTADO ESTUDIANTE: "+alumno.estadoEstudiante());
    }

}
