package P_O_O.Lista em sala.Questao8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<IComando> comandos = new ArrayList<>();
        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());

        System.out.println("Digite parâmetros separados por vírgula:");
        String entrada = scanner.nextLine();
        String[] parametros = entrada.split(",");

        System.out.println("\n=== EXECUTANDO PIPELINE DE COMANDOS ===");

        for (IComando cmd : comandos) {
            cmd.executar(parametros);
            System.out.println("----------------------------");
        }

        scanner.close();
    }
}
