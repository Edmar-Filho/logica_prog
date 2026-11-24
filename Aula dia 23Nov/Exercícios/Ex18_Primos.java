import java.util.Scanner;

/**
 * Exercício 18 - Primos
 * Lê 8 inteiros. ehPrimo(n) diz se o número é primo e filtrarPrimos(v)
 * devolve um novo vetor só com os primos.
 */
public class Ex18_Primos {

    static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;               // 0, 1 e negativos não são primos
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;           // achou um divisor
            }
        }
        return true;
    }

    static int[] filtrarPrimos(int[] v) {
        // primeiro conta quantos primos existem para criar o vetor do tamanho exato
        int quantidade = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                quantidade++;
            }
        }

        int[] primos = new int[quantidade];
        int posicao = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                primos[posicao] = v[i];
                posicao++;
            }
        }
        return primos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.print("Digite 8 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int[] primos = filtrarPrimos(numeros);

        System.out.println();
        System.out.print("Primos encontrados:");
        if (primos.length == 0) {
            System.out.print(" nenhum");
        }
        for (int i = 0; i < primos.length; i++) {
            System.out.print(" " + primos[i]);
        }
        System.out.println();
        System.out.println("Total: " + primos.length + " de " + numeros.length);
    }
}
