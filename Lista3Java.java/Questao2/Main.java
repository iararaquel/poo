package Questao2;
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("001", "Maria", 1000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca("002", "João", 2000.0, 0.05);

        System.out.println("=== Conta Corrente ===");
        cc.exibirDados();
        cc.sacar(1200);
        cc.exibirDados();

        System.out.println("\n=== Conta Poupança ===");
        cp.exibirDados();
        cp.aplicarRendimento();
        cp.exibirDados();
    }
}