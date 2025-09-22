import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 caracteres (A-Z):");

        System.out.print("1º Caractere: ");
        char c1 = sc.next().toLowerCase().charAt(0); // pega apenas a primeira letra

        System.out.print("2º Caractere: ");
        char c2 = sc.next().toLowerCase().charAt(0);

        // Verifica se são letras válidas
        if (c1 < 'a' || c1 > 'z' || c2 < 'a' || c2 > 'z') {
            System.out.println("Erro: os caracteres devem estar entre A e Z.");
        } else if (c1 >= c2) {
            System.out.println("Erro: os caracteres não estão em ordem alfabética.");
        } else {
            int quantidade = c2 - c1 - 1; // diferença de posições, excluindo os próprios caracteres
            System.out.println(c1 + " " + c2 + " O numero de caracteres entre eles é: " + quantidade);
        }

        sc.close();
    }
}
