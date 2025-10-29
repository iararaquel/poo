package desafio5;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 1.0;
        if (saldo >= (valor + taxa)) {
            saldo -= (valor + taxa);
            adicionarAoHistorico("Saque: R$" + String.format("%.2f", valor) + " (Taxa: R$1.00)");
            return true;
        } else {
            return false;
        }
    }
}
