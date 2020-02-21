package arreglosdeberpoo;

import javax.swing.*;

public class EjecutaEstudianteUniversitario {
    public static void main(String[] args) {
        // Declaracion de Variables - arreglos
        String [] universidad = new String[5];
        String [] celular = new String[5];
        String [] nombre = new String[5];
        int [] edad = new int[5];
        // Se inicializa la cadena que se presentara al final
        String cadena = " ";

        // Ingreso de datos de los estudiantes
        JOptionPane.showMessageDialog(null,"Ingrese Información de los Estudiantes");
        for (int i = 0; i < nombre.length; i++) {
            JOptionPane.showMessageDialog(null,"Ingrese Información para Estudiante "+(i+1));
            nombre[i] = (JOptionPane.showInputDialog("Ingrese Nombre"));
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
            universidad[i] = (JOptionPane.showInputDialog("Ingrese Universidad"));
            celular[i] = (JOptionPane.showInputDialog("Ingrese Celular"));
        }
        // Creacion del objeto
        EstudiateUniversitario estudiante = new EstudiateUniversitario(nombre,edad,universidad,celular);
        // Presentacion final
        for (int i = 0; i < nombre.length; i++) {
            cadena = (String.format("%sNombre: %s\n Edad: %d\n Universidad: %s\n Celular: %s\n\n",cadena,
                    estudiante.getNombre()[i],estudiante.getEdad()[i],estudiante.getUniversidad()[i],
                    estudiante.getCelular()[i]));
        }
        JOptionPane.showMessageDialog(null,"Informe estudiante Universitarios\n"+cadena);
    }
}
