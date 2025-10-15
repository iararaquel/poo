package Questao2;
public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}