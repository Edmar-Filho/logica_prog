//Aumento salário

import java.util.Scanner;

public class Ex03 {

    static double lerDecimal(Scanner sc) {
        return Double.parseDouble(sc.next().replace(',', '.'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salarios = new double[5];

        System.out.print("Digite os salários dos 5 funcionários: ");
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = lerDecimal(sc);
        }

        System.out.println();
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] < 2000.00) {
                salarios[i] = salarios[i] * 1.10;   // aumento de 10%
            }
            System.out.printf("Funcionário %d: R$ %.2f%n", i + 1, salarios[i]);
        }
    }
}
