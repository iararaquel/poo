import java.util.Scanner;

public class Questao3 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[Questão 3]");
        System.out.print("Digite sua altura (m): ");
        double h = sc.nextDouble();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * h) - 58;
        } else {
            pesoIdeal = (62.1 * h) - 44;
        }

        System.out.println("Peso ideal: " + pesoIdeal);

        sc.close();

    }

}
