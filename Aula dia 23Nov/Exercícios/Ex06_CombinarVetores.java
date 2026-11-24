import java.util.Scanner;

/**
 * Exercício 6 - Combinar dois vetores
 * Lê os vetores A e B (5 inteiros cada). Monta C com a soma posição a
 * posição e D com os valores de A e B intercalados.
 */
public class Ex06_CombinarVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];

        System.out.print("A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[5];                    // soma posição a posição
        int[] d = new int[a.length + b.length];  // intercalado

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
            d[2 * i] = a[i];        // posições pares recebem A
            d[2 * i + 1] = b[i];    // posições ímpares recebem B
        }

        System.out.println();
        System.out.print("C:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(" " + c[i]);
        }
        System.out.println();

        System.out.print("D:");
        for (int i = 0; i < d.length; i++) {
            System.out.print(" " + d[i]);
        }
        System.out.println();
    }
}
