import java.util.Scanner;

/**
 * Exercício 1 - Pesquisa de valores
 * Lê 10 inteiros em um vetor e mostra: os números, quantos são pares,
 * quantos são ímpares e a soma de todos.
 */
public class Ex01_PesquisaDeValores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.print("Digite 10 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int pares = 0;
        int impares = 0;
        int soma = 0;

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(numeros[i]);

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            soma += numeros[i];
        }
        System.out.println();

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Soma: " + soma);
    }
}
