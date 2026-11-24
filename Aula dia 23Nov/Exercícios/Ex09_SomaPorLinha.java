import java.util.Scanner;

/**
 * Exercício 9 - Soma por linha
 * Matriz 3x2 com as notas de 3 alunos em 2 disciplinas.
 * Mostra a soma das notas de cada aluno e o total geral.
 */
public class Ex09_SomaPorLinha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[3][2];

        System.out.println("Digite a matriz 3x2 (uma linha por aluno, 2 notas):");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 2; c++) {
                notas[l][c] = sc.nextInt();
            }
        }

        int totalGeral = 0;
        System.out.println();
        for (int l = 0; l < 3; l++) {
            int somaAluno = 0;
            for (int c = 0; c < 2; c++) {
                somaAluno += notas[l][c];
            }
            System.out.println("Soma do aluno " + (l + 1) + ": " + somaAluno);
            totalGeral += somaAluno;
        }
        System.out.println("Total geral: " + totalGeral);
    }
}
