import java.util.Scanner;

public class ExercicioCalculadora {
    static double calcularSoma(double numero01, double numero02){
        double soma = numero01 + numero02;
        return soma;
    }
    static double calcularSubtracao(double numero01, double numero02){
        double subtracao = numero01 - numero02;
        return subtracao;
    }
    static double calcularMultiplicacao(double numero01, double numero02){
        double multiplicacao = numero01 * numero02;
        return multiplicacao;
    }
    static double calcularDivisao(double numero01, double numero02){
        double divisao = numero01 / numero02;
        return divisao;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);            
        
        System.out.println("Digite o primeiro nº: ");
        double numero01 = sc.nextDouble();
        System.out.println("Digite o segundo nº: ");
        double numero02 = sc.nextDouble();

        System.out.println("Soma: "+ calcularSoma(numero01, numero02));
        System.out.println("Subtração: "+ calcularSubtracao(numero01, numero02));
        System.out.println("Multiplicação: "+ calcularMultiplicacao(numero01, numero02));
        System.out.println("Divisão: "+ calcularDivisao(numero01, numero02));
        sc.close();
    }
}
