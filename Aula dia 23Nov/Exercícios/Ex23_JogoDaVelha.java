import java.util.Scanner;

/**
 * Exercício 23 - Jogo da velha
 * Dois jogadores (X e O) se alternam digitando linha e coluna (1 a 3) em
 * uma matriz 3x3 de char. Não aceita posição ocupada nem fora do tabuleiro.
 * O jogo termina com vitória (linha, coluna ou diagonal) ou empate.
 */
public class Ex23_JogoDaVelha {

    static void mostrar(char[][] t) {
        System.out.println();
        System.out.println("   1   2   3");
        for (int l = 0; l < 3; l++) {
            System.out.println((l + 1) + "  " + t[l][0] + " | " + t[l][1] + " | " + t[l][2]);
            if (l < 2) {
                System.out.println("  ---+---+---");
            }
        }
        System.out.println();
    }

    /** Verifica se o jogador j completou uma linha, coluna ou diagonal. */
    static boolean venceu(char[][] t, char j) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == j && t[i][1] == j && t[i][2] == j) {
                return true;            // linha i
            }
            if (t[0][i] == j && t[1][i] == j && t[2][i] == j) {
                return true;            // coluna i
            }
        }
        if (t[0][0] == j && t[1][1] == j && t[2][2] == j) {
            return true;                // diagonal principal
        }
        if (t[0][2] == j && t[1][1] == j && t[2][0] == j) {
            return true;                // diagonal secundária
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                tabuleiro[l][c] = ' ';
            }
        }

        char jogador = 'X';
        int jogadas = 0;
        boolean fim = false;

        mostrar(tabuleiro);

        while (!fim) {
            System.out.print("Jogador " + jogador + " - linha e coluna (1 a 3): ");
            String textoLinha = sc.next();
            String textoColuna = sc.next();

            int linha;
            int coluna;
            try {
                linha = Integer.parseInt(textoLinha);
                coluna = Integer.parseInt(textoColuna);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite dois números de 1 a 3.");
                continue;
            }

            if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
                System.out.println("Posição fora do tabuleiro. Tente novamente.");
                continue;
            }
            if (tabuleiro[linha - 1][coluna - 1] != ' ') {
                System.out.println("Posição já ocupada. Tente novamente.");
                continue;
            }

            tabuleiro[linha - 1][coluna - 1] = jogador;
            jogadas++;
            mostrar(tabuleiro);

            if (venceu(tabuleiro, jogador)) {
                System.out.println("Jogador " + jogador + " venceu!");
                fim = true;
            } else if (jogadas == 9) {
                System.out.println("Empate!");
                fim = true;
            } else {
                jogador = (jogador == 'X') ? 'O' : 'X';   // passa a vez
            }
        }
    }
}
