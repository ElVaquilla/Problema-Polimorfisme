public class Cuadrado extends Rectangulo {
    double l;   // Longitud aristas
    double a;   // Area

    public Cuadrado(double l){super(l,l);
    }


    @Override
    public double area() {
        this.a = super.area();
        return this.a;
    }
}
