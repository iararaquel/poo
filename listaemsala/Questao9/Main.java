package P_O_O.Lista em sala.Questao9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade em estoque do produto: ");
        int estoque = scanner.nextInt();

        ProdutoAlimenticio produto = new ProdutoAlimenticio(estoque);

        System.out.print("Digite a quantidade que deseja comprar: ");
        int quantidadeSolicitada = scanner.nextInt();

        produto.verificarDisponibilidade(quantidadeSolicitada);

        scanner.close();
    }
}
