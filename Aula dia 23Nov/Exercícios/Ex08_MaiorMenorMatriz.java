import java.util.Scanner;

/**
 * Exercício 8 - Maior e menor da matriz
 * Lê uma matriz 4x3 de inteiros e mostra o maior e o menor elemento.
 */
public class Ex08_MaiorMenorMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][3];

        System.out.println("Digite a matriz 4x3 (4 linhas de 3 números):");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 3; c++) {
                matriz[l][c] = sc.nextInt();
            }
        }

        // começa com o primeiro elemento e compara com todos os outros
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                }
                if (matriz[l][c] < menor) {
                    menor = matriz[l][c];
                }
            }
        }

        System.out.println();
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
