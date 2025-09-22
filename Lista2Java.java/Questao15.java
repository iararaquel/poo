import java.util.Scanner;

public class Questao15 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite o índice de poluição (0.0 encerra): ");
            double indice = sc.nextDouble();

            if (indice == 0.0) {
                System.out.println("Programa encerrado (índice 0.0).");
                break;
            }

            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Índice aceitável.");
            } else if (indice >= 0.30 && indice < 0.40) {
                System.out.println("Indústrias do 1º grupo devem suspender suas atividades.");
            } else if (indice >= 0.40 && indice < 0.50) {
                System.out.println("Indústrias do 1º e 2º grupo devem suspender suas atividades.");
            } else if (indice >= 0.50) {
                System.out.println("Todos os grupos devem suspender suas atividades!");
            } else {
                System.out.println("Valor inválido.");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = sc.next();

        } while (!resposta.equalsIgnoreCase("S"));

        sc.close();
    }
}