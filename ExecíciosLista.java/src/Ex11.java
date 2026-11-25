import java.util.Scanner;

public class Ex11 {

        static boolean jaApareceuAntes(int[] v, int i) {
        for (int j = 0; j < i; j++) {
            if (v[j] == v[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[10];

        System.out.print("Digite 10 números inteiros: ");
        for (int i = 0; i < original.length; i++) {
            original[i] = sc.nextInt();
        }

        // 1ª passada: descobre quantos valores diferentes existem
        int quantidadeUnicos = 0;
        for (int i = 0; i < original.length; i++) {
            if (!jaApareceuAntes(original, i)) {
                quantidadeUnicos++;
            }
        }

        // cria o novo vetor com o tamanho exato e preenche
        int[] semRepetidos = new int[quantidadeUnicos];
        int posicao = 0;
        for (int i = 0; i < original.length; i++) {
            if (!jaApareceuAntes(original, i)) {
                semRepetidos[posicao] = original[i];
                posicao++;
            }
        }

        System.out.println();
        System.out.print("Original:     ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(" " + original[i]);
        }
        System.out.println();

        System.out.print("Sem repetidos:");
        for (int i = 0; i < semRepetidos.length; i++) {
            System.out.print(" " + semRepetidos[i]);
        }
        System.out.println();

        System.out.println("Valores removidos: " + (original.length - semRepetidos.length));

        sc.close();
    }
}