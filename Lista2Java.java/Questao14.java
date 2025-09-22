import java.util.Scanner;

public class Questao14 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite 10 valores inteiros e positivos:");

        for (int i = 1; i <= 10; i++) {
            int valor = sc.nextInt();

            soma += valor;

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        double media = (double) soma / 10;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}