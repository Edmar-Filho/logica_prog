import java.util.Scanner;

public class MediaNotas {

    public static double lerNota(Scanner entrada, String mensagem) {
        System.out.print(mensagem);
        return entrada.nextDouble();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void exibirMedia(double media) {
        System.out.printf("A media das notas e: %.2f%n", media);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1 = lerNota(entrada, "Digite a primeira nota: ");
        double nota2 = lerNota(entrada, "Digite a segunda nota: ");
        double nota3 = lerNota(entrada, "Digite a terceira nota: ");

        double media = calcularMedia(nota1, nota2, nota3);

        exibirMedia(media);

        entrada.close();
    }
}