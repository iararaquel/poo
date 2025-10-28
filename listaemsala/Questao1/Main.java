import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de cópias a serem impressas: ");
        int copias = scanner.nextInt();

        fatura.imprimir(copias);
    }
}