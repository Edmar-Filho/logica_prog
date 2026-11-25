//Cadastra Nomes

import java.util.Scanner;

public class Ex05 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[6];

        System.out.print("Digite 6 nomes: ");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.next();
        }

        System.out.print("Buscar qual nome? ");
        String busca = sc.next();

        int encontrados = 0;
        System.out.println();
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {   // ignora maiúsculas/minúsculas
                System.out.println("Encontrado na posição " + (i + 1));
                encontrados++;
            }
        }

        if (encontrados == 0) {
            System.out.println(busca + " não foi encontrado.");
        } else {
            System.out.println(busca + " aparece " + encontrados + " vez(es).");
            sc.close();
        }
    }
}