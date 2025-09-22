import java.util.Scanner;

public class Questao23 {

    // Método que calcula o salário reajustado
    public static double REAJUSTE(double salario, double indice) {
        return salario + (salario * indice / 100.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário atual: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o índice de reajuste (%): ");
        double indice = sc.nextDouble();

        // Chamada do método
        double salarioAtualizado = REAJUSTE(salario, indice);

        // Saída
        System.out.printf("Salário reajustado: R$ %.2f%n", salarioAtualizado);

        sc.close();
    }
}

