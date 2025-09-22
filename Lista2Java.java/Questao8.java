import java.util.Scanner;

public class Questao8 {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[Questão 8]");
        System.out.print("Digite um número para a tabuada: ");
        int n = sc.nextInt();

        System.out.println("Tabuada de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        } 
        sc.close();
    }
}