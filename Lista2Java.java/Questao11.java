import java.util.Scanner;

public class Questao11 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        int matricula;
        double nota;
        double somaNotas = 0;
        int contadorAlunos = 0;

        System.out.println("Digite o número da matrícula e a nota do aluno.");
        System.out.println("Para encerrar, digite matrícula negativa.");

        while (true) {
            System.out.print("\nMatrícula: ");
            matricula = sc.nextInt();

            // Condição de parada
            if (matricula < 0) {
                break;
            }

            System.out.print("Nota: ");
            nota = sc.nextDouble();

            somaNotas += nota;
            contadorAlunos++;
        }

        if (contadorAlunos > 0) {
            double media = somaNotas / contadorAlunos;
            System.out.println("\nQuantidade de alunos: " + contadorAlunos);
            System.out.println("Média da turma = " + media);
        } else {
            System.out.println("\nNenhum aluno informado.");
        }

        sc.close();
    }
}