import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o tamanho do vetor
        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        // Lê os elementos do vetor
        System.out.println("Digite os " + n + " números:");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        // Imprime em ordem inversa
        System.out.println("Vetor na ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}
