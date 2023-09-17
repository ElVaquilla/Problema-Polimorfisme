import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static double suma(Figura[] v)
    {
        double res = 0;

        for(int i = 0; i < 4; i++)
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
        v[3] = new Triangulo(12,14);

        System.out.println("Area rectangulo: " + v[0].area());
        System.out.println("Area circulo: " + v[1].area());
        System.out.println("Area cuadrado: " + v[2].area());
        System.out.println("Area triangulo: " + v[3].area());

        double res = suma(v);

        System.out.println("\nsuma: " + res);

        //Ordenar la lista de figuras
        System.out.println("\nOden descendente\n");

        Arrays.sort(v);
        int c = 1;
        for (Figura f : v){
                System.out.println(c + ": " + f.area());
            c++;
        }
        c = 1;

        System.out.println("\nOrden ascendente\n");

        Arrays.sort(v, Collections.reverseOrder());
        for (Figura f : v) {
            System.out.println(c + ": " + f.area());
            c++;
        }
    }
}
