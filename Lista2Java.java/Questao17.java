import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o tamanho dos vetores
        System.out.print("Digite a quantidade de elementos dos vetores: ");
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        // Lê os elementos do vetor X
        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        // Lê os elementos do vetor Y
        System.out.println("Digite os elementos do vetor Y:");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        // Calcula o produto escalar
        int produto = 0;
        for (int i = 0; i < n; i++) {
            produto += x[i] * y[i];
        }

        // Exibe o resultado
        System.out.println("O produto escalar dos vetores é: " + produto);

        sc.close();
    }
}