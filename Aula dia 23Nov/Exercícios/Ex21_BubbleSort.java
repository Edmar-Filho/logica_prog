import java.util.Scanner;

/**
 * Exercício 21 - Ordenação (Bubble Sort)
 * Lê 8 inteiros e ordena em ordem crescente trocando vizinhos fora de
 * ordem, sem usar Arrays.sort. Mostra o vetor após cada passada e para
 * quando uma passada não faz nenhuma troca.
 */
public class Ex21_BubbleSort {

    static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];

        System.out.print("Digite 8 números inteiros: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Antes:     ");
        mostrar(v);

        int passada = 0;
        boolean trocou;
        do {
            trocou = false;
            passada++;

            // compara cada par de vizinhos e troca se estiver fora de ordem
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    int temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    trocou = true;
                }
            }

            System.out.print("Passada " + passada + ": ");
            mostrar(v);
        } while (trocou);   // se a passada não trocou nada, já está ordenado

        System.out.print("Ordenado:  ");
        mostrar(v);
    }
}
