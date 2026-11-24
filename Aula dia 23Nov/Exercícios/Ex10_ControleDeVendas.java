import java.util.Scanner;

/**
 * Exercício 10 - Controle de vendas
 * Matriz 3x4: vendas de 3 funcionários (linhas) em 4 dias (colunas).
 * Mostra o total de cada funcionário, o total geral e a maior venda.
 */
public class Ex10_ControleDeVendas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] vendas = new int[3][4];

        System.out.println("Digite a matriz 3x4 (uma linha por funcionário, 4 dias):");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 4; c++) {
                vendas[l][c] = sc.nextInt();
            }
        }

        int totalGeral = 0;
        int maiorVenda = vendas[0][0];

        System.out.println();
        for (int l = 0; l < 3; l++) {
            int totalFuncionario = 0;
            for (int c = 0; c < 4; c++) {
                totalFuncionario += vendas[l][c];
                if (vendas[l][c] > maiorVenda) {
                    maiorVenda = vendas[l][c];
                }
            }
            System.out.println("Funcionário " + (l + 1) + ": " + totalFuncionario);
            totalGeral += totalFuncionario;
        }

        System.out.println("Total geral: " + totalGeral);
        System.out.println("Maior venda: " + maiorVenda);
    }
}
