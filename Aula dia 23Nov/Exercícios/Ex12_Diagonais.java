import java.util.Scanner;

/**
 * Exercício 12 - Diagonais
 * Lê uma matriz 4x4, mostra como tabela e calcula a soma da diagonal
 * principal e da diagonal secundária.
 */
public class Ex12_Diagonais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];

        System.out.println("Digite a matriz 4x4 (16 números):");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                m[l][c] = sc.nextInt();
            }
        }

        // mostra a matriz como tabela
        System.out.println();
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.printf("%4d", m[l][c]);
            }
            System.out.println();
        }

        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;
        for (int i = 0; i < 4; i++) {
            diagonalPrincipal += m[i][i];          // linha == coluna
            diagonalSecundaria += m[i][3 - i];     // linha + coluna == 3
        }

        System.out.println("Soma da diagonal principal: " + diagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + diagonalSecundaria);
    }
}
