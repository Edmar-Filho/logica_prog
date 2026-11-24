import java.util.Scanner;

/**
 * Exercício 19 - Matriz simétrica
 * Lê uma matriz 4x4 e diz se ela é simétrica (m[l][c] == m[c][l] em
 * todas as posições).
 */
public class Ex19_MatrizSimetrica {

    static boolean ehSimetrica(int[][] m) {
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                if (m[l][c] != m[c][l]) {
                    return false;       // achou um par diferente
                }
            }
        }
        return true;
    }

    static void mostrar(int[][] m) {
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                System.out.printf("%4d", m[l][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];

        System.out.println("Digite a matriz 4x4 (16 números):");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                m[l][c] = sc.nextInt();
            }
        }

        System.out.println();
        mostrar(m);

        if (ehSimetrica(m)) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }
}
