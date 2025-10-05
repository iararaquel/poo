package Questao2;
public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento; // ex: 0.05 para 5%

    public ContaPoupanca(String numeroConta, String titular, double saldo, double taxaRendimento) {
        super(numeroConta, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}