import java.util.Scanner;
import java.util.Random;

public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Sorteia um número de 0 a 100
        int numeroSorteado = random.nextInt(101); // 0 até 100
        int tentativas = 0;
        int palpite;

        System.out.println("=== Jogo da Adivinhação ===");
        System.out.println("Tente adivinhar o número (entre 0 e 100):");

        // Loop até acertar
        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é MAIOR que " + palpite);
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é MENOR que " + palpite);
            } else {
                System.out.println("\n🎉 Parabéns! Você acertou!");
                System.out.println("Número sorteado: " + numeroSorteado);
                System.out.println("Tentativas realizadas: " + tentativas);
            }

        } while (palpite != numeroSorteado);

        sc.close();
    }
}

