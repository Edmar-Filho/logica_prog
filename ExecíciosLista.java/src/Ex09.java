//Boletim 

import java.util.Scanner;

public class Ex09 {

        static double lerDecimal(Scanner sc) {
        return Double.parseDouble(sc.next().replace(',', '.'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[4];
        String[] disciplinas = {"Lógica", "Banco de Dados", "Redes"};
        double[][] notas = new double[4][3];

        System.out.println("Digite, para cada aluno, o nome e as 3 notas (Lógica, Banco de Dados, Redes):");
        for (int a = 0; a < 4; a++) {
            alunos[a] = sc.next();
            for (int d = 0; d < 3; d++) {
                notas[a][d] = lerDecimal(sc);
            }
        }

        System.out.println();

        // média e situação de cada aluno (média por LINHA)
        int melhorAluno = 0;
        double melhorMedia = 0;
        for (int a = 0; a < 4; a++) {
            double soma = 0;
            for (int d = 0; d < 3; d++) {
                soma += notas[a][d];
            }
            double media = soma / 3;

            String situacao;
            if (media >= 7) {
                situacao = "Aprovado";
            } else if (media >= 5) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }
            System.out.printf("%s: %.2f - %s%n", alunos[a], media, situacao);

            if (a == 0 || media > melhorMedia) {
                melhorMedia = media;
                melhorAluno = a;
            }
        }

        // média de cada disciplina (média por COLUNA)
        for (int d = 0; d < 3; d++) {
            double soma = 0;
            for (int a = 0; a < 4; a++) {
                soma += notas[a][d];
            }
            System.out.printf("%s: %.2f%n", disciplinas[d], soma / 4);
        }

        System.out.printf("Maior média: %s (%.2f)%n", alunos[melhorAluno], melhorMedia);
            sc.close();
    }
}
