package diseniopoo;

public class area_triangulo {
    // Declaración de variables
    private double base;
    private double altura;

    public area_triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area (){
        double area = (base*altura)/2;
        return area;
    }
    public String presentar() {
        String presentar = "El área del triangulo es: " + area()+"cm^2" ;
        return presentar;
    }

}
