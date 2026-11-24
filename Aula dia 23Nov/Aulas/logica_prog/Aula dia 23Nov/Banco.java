1import java.util.Scanner;

/**
 * Exercício 2 - Programa de banco com login e menu de operações.
 *
 * Os dados dos 4 clientes ficam em vetores paralelos: o mesmo índice
 * representa o mesmo cliente nos três vetores.
 *   índice 0 -> usuarios[0], senhas[0], saldos[0]
 *   índice 1 -> usuarios[1], senhas[1], saldos[1]  ... e assim por diante.
 */
public class Banco {

    // Quantidade de usuários cadastrados
    static final int TOTAL_USUARIOS = 4;

    // Usuários e senhas cadastrados (mesmo índice = mesmo cliente)
    static String[] usuarios = {"ana", "bruno", "carla", "diego"};
    static String[] senhas   = {"1234", "2345", "3456", "4567"};

    // Saldo de cada cliente; todos começam com 0.0
    static double[] saldos   = new double[TOTAL_USUARIOS];

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 1) Pede o login
        System.out.print("Usuario: ");
        String usuario = sc.nextLine().trim();
        System.out.print("Senha: ");
        String senha = sc.nextLine().trim();

        // 2) Procura o cliente nos vetores. Retorna o índice ou -1 se não existir
        int indice = autenticar(usuario, senha);

        // Se não está cadastrado, encerra o programa conforme o enunciado
        if (indice == -1) {
            System.out.println("Usuario ou senha nao cadastrados. Encerrando o programa.");
            sc.close();
            return;
        }

        // 3) Usuário cadastrado: mensagem de boas-vindas e menu
        System.out.println();
        System.out.println("Bem-vindo(a), " + usuarios[indice] + "!");

        int opcao;
        do {
            System.out.println();
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    depositar(indice);
                    break;
                case 2:
                    sacar(indice);
                    break;
                case 3:
                    mostrarSaldo(indice);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o banco. Ate logo!");
                    break;
                default:
                    System.out.println("Opcao invalida! Escolha de 1 a 4.");
            }
        } while (opcao != 4);

        sc.close();
    }

    /**
     * Confere usuário e senha percorrendo os vetores.
     * Retorna a posição do cliente se os dois conferirem, ou -1 se não achar.
     * (equals compara o conteúdo dos textos; == não serve para String)
     */
    static int autenticar(String usuario, String senha) {
        for (int i = 0; i < TOTAL_USUARIOS; i++) {
            if (usuarios[i].equals(usuario) && senhas[i].equals(senha)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Lê um inteiro do teclado. Se não for número, devolve -1 (tratado como
     * opção inválida), evitando que o programa quebre.
     */
    static int lerInteiro() {
        String linha = sc.nextLine().trim();
        try {
            return Integer.parseInt(linha);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * Lê um valor em reais. Aceita vírgula ou ponto como separador decimal
     * (30,50 ou 30.50). Se não for número, devolve -1 (valor inválido).
     */
    static double lerValor() {
        String linha = sc.nextLine().trim().replace(',', '.');
        try {
            return Double.parseDouble(linha);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * Depósito: soma o valor informado ao saldo do cliente logado.
     * Só aceita valores maiores que zero.
     */
    static void depositar(int indice) {
        System.out.print("Valor do deposito: R$ ");
        double valor = lerValor();

        if (valor <= 0) {
            System.out.println("Valor invalido! Informe um valor maior que zero.");
            return;
        }

        saldos[indice] += valor;
        System.out.printf("Deposito de R$ %.2f realizado com sucesso.%n", valor);
    }

    /**
     * Saque: subtrai o valor do saldo, mas só se houver saldo suficiente.
     * Também recusa valores zero ou negativos.
     */
    static void sacar(int indice) {
        System.out.print("Valor do saque: R$ ");
        double valor = lerValor();

        if (valor <= 0) {
            System.out.println("Valor invalido! Informe um valor maior que zero.");
            return;
        }

        // Não permite sacar mais do que o cliente tem
        if (valor > saldos[indice]) {
            System.out.printf("Saldo insuficiente! Seu saldo e R$ %.2f.%n", saldos[indice]);
            return;
        }

        saldos[indice] -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
    }

    /** Mostra o saldo atual do cliente logado (duas casas decimais). */
    static void mostrarSaldo(int indice) {
        System.out.printf("Saldo atual: R$ %.2f%n", saldos[indice]);
    }
}
