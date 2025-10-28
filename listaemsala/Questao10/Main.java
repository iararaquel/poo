package P_O_O.Lista em sala.Questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho total do download (em bytes): ");
        int tamanho = scanner.nextInt();

        ITransferencia download = new TransferenciaHTTP();
        download.iniciarDownload(tamanho);

        scanner.close();
    }
}