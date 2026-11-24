import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 3 - Reajuste salarial
 * Lê os salários de 5 funcionários. Quem ganha menos de R$ 2.000,00
 * recebe 10% de aumento. Mostra os salários atualizados.
 */
public class Ex03_ReajusteSalarial {

    static final Locale PT = Locale.forLanguageTag("pt-BR");

    /** Lê um número decimal aceitando vírgula ou ponto. */
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
            System.out.printf(PT, "Funcionário %d: R$ %.2f%n", i + 1, salarios[i]);
        }
    }
}
