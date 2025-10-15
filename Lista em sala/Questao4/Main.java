package P_O_O.Lista em sala.Questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GERENCIADOR DE TAREFAS ===");
        System.out.print("Deseja iniciar uma tarefa longa? (s/n): ");
        String opcao = scanner.nextLine();

        if (opcao.equalsIgnoreCase("s")) {
            TarefaLonga tarefa = new TarefaLonga();
            tarefa.executar();

            System.out.println("Status final da tarefa: " + (tarefa.isConcluida() ? "Concluída" : "Pendente"));
        } else {
            System.out.println("Nenhuma tarefa foi iniciada.");
        }

        sc.close();
    }
}


