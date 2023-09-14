public class Main {
    public static double suma(Figura[] v)
    {
        double res = 0;

        for(int i = 0; i < 5; i++)
        {
            res = res + v[i].area();
        }
        return res;
    }


    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangulo(5, 3);
        v[1] = new Circulo(5);
        v[2] = new Cuadrado(5);
        //v[3] = new Triangulo(12,14);

        double res = suma(v);

        System.out.println("suma: " + res);
        //print(v);
        // sort(v);
        // print(v);
    }
}
