package Fibonacci;

public class FibonacciCalc {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.calc();
        System.out.println(f.recursionCalc(10));
    }
}

class Fibonacci {
    public static void calc () {
        int n0 = 1, n1 = 1, n2;

        System.out.print(n0 + " " + n1 + " ");

        for (int i = 0; i < 18; i++) {
            n2 = n0 + n1;

            System.out.print(n2 + " ");

            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

    public int recursionCalc(int n) {
        if (n < 2) return n;
        return recursionCalc(n - 1) + recursionCalc(n - 2);
    }
}
