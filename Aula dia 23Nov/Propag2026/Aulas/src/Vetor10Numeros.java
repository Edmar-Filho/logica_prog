import java.util.Scanner;
public class Vetor10Numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int soma = 0;

        // Leitura dos 10 números inteiros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();

            soma += numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibição dos números armazenados
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Resultados
        System.out.println("\n\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("Soma dos valores digitados: " + soma);

        scanner.close();
    }
}