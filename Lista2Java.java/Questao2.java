import java.util.Scanner;

public class Questao2 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[Questão 2]");
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Verificar múltiplo");
        System.out.println("2 - Verificar se os dois são pares");
        System.out.println("3 - Verificar se a média >= 7");
        System.out.println("4 - Sair");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            if (n1 % n2 == 0 || n2 % n1 == 0) {
                System.out.println("São múltiplos.");
            } else {
                System.out.println("Não são múltiplos.");
            }
        } else if (opcao == 2) {
            if (n1 % 2 == 0 && n2 % 2 == 0) {
                System.out.println("Ambos são pares.");
            } else {
                System.out.println("Nem todos são pares.");
            }
        } else if (opcao == 3) {
            double media = (n1 + n2) / 2.0;
            if (media >= 7) {
                System.out.println("Média >= 7");
            } else {
                System.out.println("Média < 7");
            }
        } else if (opcao == 4) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}