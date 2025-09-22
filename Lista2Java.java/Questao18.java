import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        // a) Ler o vetor
        System.out.println("Digite 10 números inteiros positivos maiores que zero:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
            if (vetor[i] <= 0) {
                System.out.println("Valor inválido! Digite um número maior que zero:");
                i--; // força repetir a posição
            }
        }

        // b) Ler o número X
        System.out.print("Digite o valor de X (positivo e maior que zero): ");
        int x = sc.nextInt();
        while (x <= 0) {
            System.out.print("Valor inválido! Digite novamente X (> 0): ");
            x = sc.nextInt();
        }

        // c) Contar maiores, menores e iguais
        int maiores = 0, menores = 0, iguais = 0;
        for (int valor : vetor) {
            if (valor > x) {
                maiores++;
            } else if (valor < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        // Exibir resultados
        System.out.println("Quantidade de números maiores que X: " + maiores);
        System.out.println("Quantidade de números menores que X: " + menores);
        System.out.println("Quantidade de números iguais a X: " + iguais);

        sc.close();
    }
}

