package P_O_O.Lista em sala.Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do desenvolvedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o código do cargo 1 - Júnior, 2 - Pleno, 3 - Sênior: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o salário-base: ");
        double salarioBase = scanner.nextDouble();

        Desenvolvedor dev = new Desenvolvedor(nome, codigo);

        double bonus = dev.calcularBonificacao(salarioBase);
        System.out.println("\nFuncionário: " + nome);
        System.out.println("Bônus anual: R$" + bonus);

        sc.close();
    }
}