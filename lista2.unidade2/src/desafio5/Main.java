package desafio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Desafio 5: Sistema de Banco ---");
        System.out.print("Número da Conta Corrente: ");
        int numCC = sc.nextInt();
        System.out.print("Número da Conta Poupança: ");
        int numCP = sc.nextInt();

        ContaCorrente cc = new ContaCorrente(numCC, 0.0);
        ContaPoupanca cp = new ContaPoupanca(numCP, 0.0);

        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        for (ContaBancaria c : contas) {
            System.out.println("\nOperando na conta: " + c.numeroConta);
            System.out.println("Depositando R$ 1000,00");
            c.depositar(1000.0);
            System.out.println("Tentando sacar R$ 300,00");
            boolean ok1 = c.sacar(300.0);
            System.out.println("Saque de R$300 " + (ok1 ? "realizado" : "falhou"));
            System.out.println("Tentando sacar R$ 900,00");
            boolean ok2 = c.sacar(900.0);
            System.out.println("Saque de R$900 " + (ok2 ? "realizado" : "falhou (saldo insuficiente)")); 
            c.imprimirExtrato();
        }
        sc.close();
    }
}
