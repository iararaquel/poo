package P_O_O.Lista em sala.Questao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== VALIDADOR DE CREDENCIAIS ===");
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        ValidadorSeguranca validador = new ValidadorSeguranca();

        boolean formatoValido = validador.validarFormato(senha);

        if (formatoValido) {
            validador.validarAcesso(senha);
        } else {
            System.out.println("Formato inválido!");
        }

        scanner.close();
    }
}
