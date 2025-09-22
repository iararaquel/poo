import java.util.Scanner;

public class Questao10 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Informe um número maior que 0 e menor que 10: ");
            numero = sc.nextInt();
        } while (numero <= 0 || numero >= 10);

        int soma = 0;
        int contador = 0;

        // Começamos a partir do número informado
        int atual = numero;

        while (contador < 20) {
            if (atual % 2 != 0) { // verifica se é ímpar
                soma += atual * atual; // soma dos quadrados
                contador++;
            }
            atual++;
        }

        System.out.println("\nSoma dos quadrados dos 20 primeiros ímpares a partir de " 
                           + numero + " = " + soma);

        sc.close();
    }
}
