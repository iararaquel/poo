package Questao7;

public class Futebol extends Esporte {
    private double tamanhoCampo; // em metros

    public Futebol(String nome, int numeroJogadores, int duracaoPartida, int popularidade, double tamanhoCampo) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.tamanhoCampo = tamanhoCampo;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 300.0;
    }

    @Override
    public void exibirRegras() {
        super.exibirRegras();
        System.out.println("Tamanho do campo: " + tamanhoCampo + " m");
    }
}