import java.util.Scanner;

public class Questao5 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[Questão 5]");
        System.out.print("Digite a quantidade de números a processar: ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();
            long fatorial = 1;
            for (int j = 1; j <= n; j++) {
                fatorial *= j;
            }
            System.out.println("Fatorial de " + n + " = " + fatorial);
        }
        sc.close();
    }
}