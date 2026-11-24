import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 22 - Estoque da papelaria
 * Três vetores paralelos (produtos, quantidades e preços): a posição i
 * dos três vetores descreve o mesmo produto.
 * Menu que repete até a opção 0:
 *   1 listar estoque | 2 entrada de produto | 3 venda | 4 valor total
 */
public class Ex22_EstoquePapelaria {

    static final Locale PT = Locale.forLanguageTag("pt-BR");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = {"Caderno", "Caneta", "Lápis", "Borracha"};
        int[] quantidades = {10, 25, 30, 8};
        double[] precos = {18.90, 2.50, 1.20, 3.00};

        int opcao;
        do {
            System.out.println("=== PAPELARIA ===");
            System.out.println("1 - Listar estoque");
            System.out.println("2 - Entrada de produto");
            System.out.println("3 - Saída (venda)");
            System.out.println("4 - Valor total do estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.printf(PT, "%d - %-9s Qtd: %3d   Preço: R$ %.2f%n",
                                i + 1, produtos[i], quantidades[i], precos[i]);
                    }
                }
                case 2 -> {
                    System.out.print("Código do produto (1 a " + produtos.length + "): ");
                    int codigo = sc.nextInt();
                    if (codigo < 1 || codigo > produtos.length) {
                        System.out.println("Código inválido.");
                    } else {
                        System.out.print("Quantidade recebida: ");
                        int qtd = sc.nextInt();
                        if (qtd <= 0) {
                            System.out.println("Quantidade inválida.");
                        } else {
                            quantidades[codigo - 1] += qtd;
                            System.out.println("Entrada registrada. Agora há "
                                    + quantidades[codigo - 1] + " de " + produtos[codigo - 1] + ".");
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Código do produto (1 a " + produtos.length + "): ");
                    int codigo = sc.nextInt();
                    if (codigo < 1 || codigo > produtos.length) {
                        System.out.println("Código inválido.");
                    } else {
                        System.out.print("Quantidade vendida: ");
                        int qtd = sc.nextInt();
                        int i = codigo - 1;
                        if (qtd <= 0) {
                            System.out.println("Quantidade inválida.");
                        } else if (qtd > quantidades[i]) {
                            System.out.println("Estoque insuficiente. Disponível: " + quantidades[i]);
                        } else {
                            quantidades[i] -= qtd;
                            System.out.printf(PT, "Venda: R$ %.2f. Restam %d.%n", qtd * precos[i], quantidades[i]);
                        }
                    }
                }
                case 4 -> {
                    double total = 0;
                    for (int i = 0; i < produtos.length; i++) {
                        total += quantidades[i] * precos[i];
                    }
                    System.out.printf(PT, "Valor total: R$ %.2f%n", total);
                }
                case 0 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }
            System.out.println();
        } while (opcao != 0);
    }
}
