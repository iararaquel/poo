package P_O_O.Lista em sala.questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<IProcessador> processadores = new ArrayList<>();
        processadores.add(new ProcessadorCSV());

        System.out.print("Quantas linhas de dados deseja inserir? ");
        int qtd = scanner.nextInt();
        scanner.nextLine(); 

        String[] dados = new String[qtd];

        System.out.println("Digite as linhas de dados CSV (ex: id,nome,idade):");
        for (int i = 0; i < qtd; i++) {
            System.out.print("Linha " + i + ": ");
            dados[i] = scanner.nextLine();
        }

        for (IProcessadorDeDados processador : processadores) {
            processador.processar(dados);
        }

        sc.close();
    }
}