import java.util.Scanner;

public class Questao25 {
    static int[] vetor;
    static int tamanho;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir apenas os números pares do vetor");
            System.out.println("4 - Exibir apenas os números ímpares do vetor");
            System.out.println("5 - Exibir a quantidade de números pares nas posições ímpares");
            System.out.println("6 - Exibir a quantidade de números ímpares nas posições pares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    carregarVetor(sc);
                    break;
                case 2:
                    listarVetor();
                    break;
                case 3:
                    exibirPares();
                    break;
                case 4:
                    exibirImpares();
                    break;
                case 5:
                    paresEmPosicoesImpares();
                    break;
                case 6:
                    imparesEmPosicoesPares();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    // 1 - Carregar vetor
    public static void carregarVetor(Scanner sc) {
        System.out.print("Digite o tamanho do vetor: ");
        tamanho = sc.nextInt();
        vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt();
        }
        System.out.println("Vetor carregado com sucesso!");
    }

    // 2 - Listar vetor
    public static void listarVetor() {
        if (vetorVazio()) return;
        System.out.println("Vetor:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 3 - Exibir números pares
    public static void exibirPares() {
        if (vetorVazio()) return;
        System.out.println("Números pares:");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // 4 - Exibir números ímpares
    public static void exibirImpares() {
        if (vetorVazio()) return;
        System.out.println("Números ímpares:");
        for (int num : vetor) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // 5 - Quantidade de pares em posições ímpares
    public static void paresEmPosicoesImpares() {
        if (vetorVazio()) return;
        int count = 0;
        for (int i = 1; i < tamanho; i += 2) { // posições ímpares: índice 1,3,5...
            if (vetor[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Quantidade de números pares nas posições ímpares: " + count);
    }

    // 6 - Quantidade de ímpares em posições pares
    public static void imparesEmPosicoesPares() {
        if (vetorVazio()) return;
        int count = 0;
        for (int i = 0; i < tamanho; i += 2) { // posições pares: índice 0,2,4...
            if (vetor[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Quantidade de números ímpares nas posições pares: " + count);
    }

    // Verifica se o vetor está carregado
    public static boolean vetorVazio() {
        if (vetor == null || tamanho == 0) {
            System.out.println("O vetor ainda não foi carregado.");
            return true;
        }
        return false;
    }
}

