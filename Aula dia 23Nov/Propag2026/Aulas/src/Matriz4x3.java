import java.util.Scanner;
public class Matriz4x3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] m = new int[4][3];

        // Leitura da matriz usando m.length (linhas) e m[i].length (colunas)
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                m[i][j] = scanner.nextInt();
            }
        }

        // Começa com o primeiro elemento como maior e menor
        int maior = m[0][0];
        int menor = m[0][0];

        // Percorre a matriz com m.length e m[i].length
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
                if (m[i][j] < menor) {
                    menor = m[i][j];
                }
            }
        }

        // Exibição da matriz
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        scanner.close();
    }
}