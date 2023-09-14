public class Triangulo extends Figura{

    double h;   // Altura
    double b;   // Base
    double a;   // Area

    public Triangulo(double h, double b){
        this.h = h;
        this.b = b;
    }
    @Override
    public double area(){
        this.a = (h*b)/2;
        return this.a;
    }
}
