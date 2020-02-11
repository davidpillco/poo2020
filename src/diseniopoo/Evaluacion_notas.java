package diseniopoo;

public class Evaluacion_notas {
    // Declaración de variables
        private String nombre;
        private String materia;
        private double bim_1;
        private double bim_2;

    public Evaluacion_notas(String nombre, String materia, double bim_1, double bim_2){
        this.nombre = nombre;
        this.materia = materia;
        this.bim_1 = bim_1;
        this.bim_2 = bim_2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getBim_1() {
        return bim_1;
    }

    public void setBim_1(double bim_1) {
        this.bim_1 = bim_1;
    }

    public double getBim_2() {
        return bim_2;
    }

    public void setBim_2(double bim_2) {
        this.bim_2 = bim_2;
    }
    public double total (){
        double total = bim_1 + bim_2;
        return total;
    }
    public  String eval_nota(){
        double sum = bim_1+bim_2;
        String eval = "";
        if (sum <= 27.5){
            eval = "SUPLETORIOS";
        }else {
            eval = "MATERIA APROBADA - FELICIDADES";
        }
        return eval;
    }

    public String presentar(){
        String presentar = "Resultados de la materia "+materia+":\n"+"Nombre del estudiante: " +nombre+"\n"+"Materia: "+
                materia+"\n"+"Nota primer bimestre: "+bim_1+"\n" +"Nota segundo bimestre: "+bim_2+"\n\n"+
                "Notal final: "+ total()+"\n"+"Resultado: "+eval_nota();
        return presentar;
    }

}
