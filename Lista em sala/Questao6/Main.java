package P_O_O.Lista em sala.Questao6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = new Logger();

        System.out.println("=== SISTEMA DE LOG DE EVENTOS ===");
        System.out.print("Digite uma mensagem de log: ");
        String mensagem = scanner.nextLine();

        System.out.println("\nSalvando log localmente...");
        logger.salvarLocal(mensagem);

        System.out.println("\nSalvando log remotamente...");
        logger.salvarRemoto(mensagem);

        scanner.close();
    }
}