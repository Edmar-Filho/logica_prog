import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 2 - Média da turma
 * Lê as notas de 5 alunos em um vetor e mostra a média da turma,
 * quantos foram aprovados (nota >= 7) e quantos foram reprovados.
 */
public class Ex02_MediaDaTurma {

    static final Locale PT = Locale.forLanguageTag("pt-BR");

    /** Lê um número decimal aceitando vírgula ou ponto (6,5 ou 6.5). */
    static double lerDecimal(Scanner sc) {
        return Double.parseDouble(sc.next().replace(',', '.'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.print("Digite as notas dos 5 alunos: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = lerDecimal(sc);
        }

        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.println();
        System.out.printf(PT, "Média da turma: %.2f%n", media);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }
}
