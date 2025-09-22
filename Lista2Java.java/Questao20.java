import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        // Ler o tamanho dos vetores (máximo 50)
        do {
            System.out.print("Digite o tamanho dos vetores (até 50): ");
            N = sc.nextInt();
        } while (N <= 0 || N > 50);

        int[] V1 = new int[N];
        int[] V2 = new int[N];

        // Ler vetor V1
        System.out.println("Digite os elementos do vetor V1:");
        for (int i = 0; i < N; i++) {
            V1[i] = sc.nextInt();
        }

        // Ler vetor V2
        System.out.println("Digite os elementos do vetor V2:");
        for (int i = 0; i < N; i++) {
            V2[i] = sc.nextInt();
        }

        // Comparar posições
        int iguais = 0;
        for (int i = 0; i < N; i++) {
            if (V1[i] == V2[i]) {
                iguais++;
            }
        }

        // Exibir resultado
        System.out.println("Quantidade de posições com valores idênticos: " + iguais);

        sc.close();
    }
}