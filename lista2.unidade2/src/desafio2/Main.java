package desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checkout checkout = new Checkout();
        CartaoCredito cartao = new CartaoCredito(1000.0);
        Pix pix = new Pix();
        Boleto boleto = new Boleto();

        System.out.println("--- Desafio 2: Sistema de Pagamentos ---");
        System.out.println("Vamos simular as compras pedidas no enunciado:\n");

        System.out.println("1) Compra de R$ 800 no cartão (deve aprovar)");
        checkout.finalizarCompra(cartao, 800.0);
        System.out.println();

        System.out.println("2) Compra de R$ 1200 no cartão (deve falhar)");
        checkout.finalizarCompra(cartao, 1200.0);
        System.out.println();

        System.out.println("3) Compra de R$ 300 no PIX (deve aprovar)");
        checkout.finalizarCompra(pix, 300.0);
        System.out.println();

        System.out.println("4) Compra de R$ 150 no Boleto (deve aprovar)");
        checkout.finalizarCompra(boleto, 150.0);
        System.out.println();

        // Opcional: permitir que o usuário teste valores
        System.out.print("Deseja testar um valor customizado? (s/n): ");
        String resp = sc.next();
        if (resp.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor: R$ ");
            double valor = sc.nextDouble();
            System.out.println("Escolha método: 1-Cartão 2-PIX 3-Boleto");
            int op = sc.nextInt();
            if (op == 1) checkout.finalizarCompra(cartao, valor);
            else if (op == 2) checkout.finalizarCompra(pix, valor);
            else if (op == 3) checkout.finalizarCompra(boleto, valor);
            else System.out.println("Opção inválida.");
        }
        sc.close();
    }
}
