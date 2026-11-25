//temperatura

import java.util.Scanner;

public class Ex04 {
    static double lerDecimal(Scanner sc) {
        return Double.parseDouble(sc.next().replace(',', '.'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double[] temperaturas = new double[7];

        System.out.print("Digite as 7 temperaturas (Domingo a Sábado): ");
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = lerDecimal(sc);
        }

        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        double media = soma / temperaturas.length;

        System.out.println();
        System.out.printf("Média da semana: %.1f °C%n", media);

        System.out.println("Dias acima da média:");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf("  %s (%.2f °C)%n", dias[i], temperaturas[i]);
            }
        }


        int indiceMaior = 0;
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[indiceMaior]) {
                indiceMaior = i;
            }
        }
        System.out.printf("Dia mais quente: %s (%.1f °C)%n", dias[indiceMaior], temperaturas[indiceMaior]);
    }
}
