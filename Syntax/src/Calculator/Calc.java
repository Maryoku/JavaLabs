package Calculator;

import java.util.Scanner;

public class Calc {

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }

    private static double power(double a, double b) {
        double answer = 1;

        for (int x = 1; x <= b; x++) {
            answer *= a;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double answer;
        double a, b;
        char operator;

        System.out.print("Введите выражение: ");

        a = input.nextDouble();
        operator = input.next().charAt(0);
        b = input.nextDouble();

        switch (operator) {
            case '+':
                answer = add(a, b);
                break;
            case '-':
                answer = subtract(a, b);
                break;
            case '*':
                answer = multiply(a, b);
                break;
            case '/':
                answer = divide(a, b);
                break;
            case '^':
                answer = power(a, b);
                break;
            default:
                System.out.println("wrong input");
                return;
        }

        System.out.println(answer);
        input.close();
    }

}