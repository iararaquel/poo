import java.util.Scanner;

public class Questao1 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[Questão 1]\n");
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        if (opcao == 1) {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (opcao == 2) {
            System.out.println("Resultado: " + (n1 - n2));
        } else if (opcao == 3) {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (opcao == 4) {
            if (n2 != 0) {
                System.out.println("Resultado: " + (n1 / n2));
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Opção inválida!");
        }
        sc.close();
    }
}
