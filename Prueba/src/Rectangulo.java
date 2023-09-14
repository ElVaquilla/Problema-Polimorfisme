public class Rectangulo extends Figura {
    double l1;  // Longitud lateral 1
    double l2;  // Longitud lateral 2
    double a;

    public Rectangulo (double l1,double l2){
        this.l1 = l1;
        this.l2 = l2;
    };
    @Override
    public double area(){
        this.a = l1*l2;
        return this.a;
    }
}
