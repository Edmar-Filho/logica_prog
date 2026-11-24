/**
 * Exercício 11 - Total de vendas por dia
 * Usa a mesma matriz do exercício 10 (já preenchida no código):
 * 3 funcionários (linhas) x 4 dias (colunas).
 * Mostra o total vendido em cada dia e qual dia vendeu mais.
 *
 * Para usar outros valores, basta trocar os números da matriz abaixo.
 */
public class Ex11_TotalVendasPorDia {

    public static void main(String[] args) {
        int[][] vendas = {
                {100, 200, 150, 50},
                {300, 100, 250, 200},
                {80, 120, 400, 100}
        };

        int diaMaior = 0;
        int maiorTotal = 0;

        // percorre por COLUNA (dia) somando as linhas (funcionários)
        for (int c = 0; c < 4; c++) {
            int totalDia = 0;
            for (int l = 0; l < 3; l++) {
                totalDia += vendas[l][c];
            }
            System.out.println("Dia " + (c + 1) + ": " + totalDia);

            if (c == 0 || totalDia > maiorTotal) {
                maiorTotal = totalDia;
                diaMaior = c + 1;
            }
        }

        System.out.println("Maior total: Dia " + diaMaior + " (" + maiorTotal + ")");
    }
}
