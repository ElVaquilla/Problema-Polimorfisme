public abstract class Figura implements Comparable<Figura> {

    public abstract double area();
    int r;
   public int compareTo(Figura f){
        if(this.area() > f.area())
            r= -1;
        else if(this.area() == f.area())
            r= 0;
        else if(this.area() < f.area())
            r= 1;
        return r;
    }
}