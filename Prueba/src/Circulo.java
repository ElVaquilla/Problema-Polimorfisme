public class Circulo extends Figura{
  double r; // Radio
  double a; // Area
  public Circulo(double rad){
      this.r = rad;
  };

    @Override

    public double area() {

        a = r * r * Math.PI;
        this.a = a;
        return a;
    }

    @Override
    public int compareTo(Figura o) {
        return 0;
    }
}
