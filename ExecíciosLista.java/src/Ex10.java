//Calculadora

import java.util.Scanner;

public class Ex10 {

    static double somar(double a, double b) {
        return a + b;
    }

    static double subtrair(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        return a / b;
    }

    /** Lê um número decimal aceitando vírgula ou ponto. */
    static double lerDecimal(Scanner sc) {
        return Double.parseDouble(sc.next().replace(',', '.'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double a = lerDecimal(sc);
        System.out.print("Segundo número: ");
        double b = lerDecimal(sc);

        System.out.println();
        System.out.println("Soma: " + somar(a, b));
        System.out.println("Subtração: " + subtrair(a, b));
        System.out.println("Multiplicação: " + multiplicar(a, b));

        if (b == 0) {
            System.out.println("Divisão: não é possível dividir por zero.");
        } else {
            System.out.println("Divisão: " + dividir(a, b));
        }
        sc.close();
    }
}