import java.util.Scanner;

/**
 * Exercício 20 - Busca e troca na matriz
 * Usa a matriz { {10,20}, {30,40}, {50,60}, {70,80} }.
 * existe() diz se o número está na matriz e substituir() troca só a
 * primeira ocorrência. Lê um número: se existir, lê o novo valor,
 * substitui e mostra a matriz.
 */
public class Ex20_BuscaETrocaMatriz {

    static boolean existe(int[][] m, int numero) {
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                if (m[l][c] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Troca apenas a PRIMEIRA ocorrência de antigo por novo. */
    static void substituir(int[][] m, int antigo, int novo) {
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                if (m[l][c] == antigo) {
                    m[l][c] = novo;
                    return;             // para na primeira troca
                }
            }
        }
    }

    static void mostrar(int[][] m) {
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                if (c > 0) {
                    System.out.print(" ");
                }
                System.out.print(m[l][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = {{10, 20}, {30, 40}, {50, 60}, {70, 80}};

        System.out.print("Buscar: ");
        int buscar = sc.nextInt();

        if (existe(m, buscar)) {
            System.out.print("Novo valor: ");
            int novo = sc.nextInt();
            substituir(m, buscar, novo);
            System.out.println();
            mostrar(m);
        } else {
            System.out.println("Não existe na matriz.");
        }
    }
}
