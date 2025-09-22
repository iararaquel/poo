import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL = 20;
        String[] nomes = new String[TOTAL];
        int[] idades = new int[TOTAL];

        // Leitura dos dados das candidatas
        System.out.println("Digite o nome e a idade das 20 candidatas:");
        for (int i = 0; i < TOTAL; i++) {
            System.out.print("Candidata " + (i + 1) + " - Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Candidata " + (i + 1) + " - Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha
        }

        // Impressão das candidatas aptas
        System.out.println("\nCandidatas aptas (idade entre 18 e 20 anos):");
        boolean encontrou = false;
        for (int i = 0; i < TOTAL; i++) {
            if (idades[i] >= 18 && idades[i] <= 20) {
                System.out.println(nomes[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma candidata está na faixa etária exigida.");
        }

        sc.close();
    }
}
