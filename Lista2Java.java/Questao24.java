import java.util.Scanner;

public class Questao24 {

    // Método que verifica se o número é par ou ímpar
    public static String VERIFICA(int n) {
        if (n % 2 == 0) {
            return "PAR";
        } else {
            return "ÍMPAR";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Chamada do método
        String resultado = VERIFICA(numero);

        // Saída
        System.out.println("O número " + numero + " é " + resultado);

        sc.close();
    }
}

