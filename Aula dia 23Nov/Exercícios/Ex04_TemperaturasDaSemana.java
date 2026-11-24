import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 4 - Temperaturas da semana
 * Lê a temperatura de cada dia (Domingo a Sábado) e mostra a média,
 * os dias acima da média e o dia mais quente.
 */
public class Ex04_TemperaturasDaSemana {

    static final Locale PT = Locale.forLanguageTag("pt-BR");

    /** Lê um número decimal aceitando vírgula ou ponto. */
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

        // média
        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        double media = soma / temperaturas.length;

        System.out.println();
        System.out.printf(PT, "Média da semana: %.1f °C%n", media);

        // dias acima da média
        System.out.println("Dias acima da média:");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf(PT, "  %s (%.1f °C)%n", dias[i], temperaturas[i]);
            }
        }

        // dia mais quente
        int indiceMaior = 0;
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[indiceMaior]) {
                indiceMaior = i;
            }
        }
        System.out.printf(PT, "Dia mais quente: %s (%.1f °C)%n", dias[indiceMaior], temperaturas[indiceMaior]);
    }
}
