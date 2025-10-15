package Questao2;
public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected String titular;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}