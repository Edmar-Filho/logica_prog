import java.util.Scanner;

/**
 * Exercício 14 - Mensagem de boas-vindas
 * Lê um nome no main() e usa o método apresentar() para mostrar a mensagem.
 */
public class Ex14_MensagemBoasVindas {

    static void apresentar(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        apresentar(nome);
    }
}
