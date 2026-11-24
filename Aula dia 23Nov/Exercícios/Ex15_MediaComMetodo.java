import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 15 - Média com método
 * Lê duas notas. calcularMedia() devolve a média e situacao() devolve
 * "Aprovado" (média >= 7) ou "Em recuperação".
 */
public class Ex15_MediaComMetodo {

    static final Locale PT = Locale.forLanguageTag("pt-BR");

    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    static String situacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        }
        return "Em recuperação";
    }

    /** Lê um número decimal aceitando vírgula ou ponto. */
    static double lerDecimal(Scanner sc) {
        return Double.parseDouble(sc.next().replace(',', '.'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = lerDecimal(sc);
        System.out.print("Nota 2: ");
        double n2 = lerDecimal(sc);

        double media = calcularMedia(n1, n2);

        System.out.printf(PT, "Média: %.2f%n", media);
        System.out.println("Situação: " + situacao(media));
    }
}
