import java.util.Scanner;

public class Exemplo03 {

    static double calcularMedia(double nota01, double nota02){
        double media = (nota01 + nota02)/2;
        return media;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota01 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota02 = sc.nextDouble();
        double media = calcularMedia(nota01, nota02);
        System.out.println("A média é: " + media);
        sc.close();
        


    }
}
