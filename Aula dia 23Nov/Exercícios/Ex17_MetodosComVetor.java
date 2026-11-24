import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 17 - Métodos com vetor
 * Métodos: lerVetor, mostrar, somar, media, maior e contar(v, valor).
 * O main() NÃO tem nenhum for: só chama os métodos.
 */
public class Ex17_MetodosComVetor {

    static final Locale PT = Locale.forLanguageTag("pt-BR");

    /** Lê n números inteiros e devolve em um vetor. */
    static int[] lerVetor(Scanner sc, int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        return v;
    }

    /** Mostra os elementos separados por espaço e pula a linha. */
    static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(v[i]);
        }
        System.out.println();
    }

    static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    static double media(int[] v) {
        return (double) somar(v) / v.length;
    }

    static int maior(int[] v) {
        int maior = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        return maior;
    }

    /** Conta quantas vezes o valor aparece no vetor. */
    static int contar(int[] v, int valor) {
        int quantidade = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 6 números inteiros: ");
        int[] v = lerVetor(sc, 6);

        System.out.println();
        System.out.print("Vetor: ");
        mostrar(v);
        System.out.println("Soma: " + somar(v));
        System.out.printf(PT, "Média: %.2f%n", media(v));
        System.out.println("Maior: " + maior(v));

        System.out.print("Contar qual valor? ");
        int valor = sc.nextInt();
        System.out.println("O valor " + valor + " aparece " + contar(v, valor) + " vez(es).");
    }
}
