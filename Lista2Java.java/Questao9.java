import java.util.Scanner;

public class Questao9 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        int numero;
        int somaPares = 0;
        int somaImpares = 0;

        System.out.println("Digite números positivos (número negativo encerra):");

        while (true) {
            numero = sc.nextInt();

            // Condição de parada
            if (numero < 0) {
                break;
            }

            // Verificação de par ou ímpar
            if (numero % 2 == 0) {
                System.out.println(numero + " é PAR");
                somaPares += numero;
            } else {
                System.out.println(numero + " é ÍMPAR");
                somaImpares += numero;
            }
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        sc.close();
    }
}