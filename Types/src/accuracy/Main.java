package accuracy;

public class Main {

    public static void main(String[] args)
    {
        float f1 = 0.999f;
        float f2 = 1.1f;

        double d1 = f1 + 0.001;
        double d2 = f2 - 0.1;

        if (d1 == d2) System.out.println("d1 == d2");
        else System.out.println(d1 + " != " + d2);

        float a, b, f;
        a = 1000;
        b = 0.00001f;
        f = a - b;
        System.out.println(f);

    }
}
