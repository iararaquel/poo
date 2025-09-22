import java.util.Scanner;

public class Questao12 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        int numero;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite números positivos (negativo encerra): ");

        while (true) {
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número foi informado.");
        } else {
            System.out.println("Menor número: " + menor);
            System.out.println("Maior número: " + maior);
        }

        sc.close();
    }
}