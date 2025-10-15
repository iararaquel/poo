package Questao7;

public class Basquete extends Esporte {
    private double alturaCesta; // em metros

    public Basquete(String nome, int numeroJogadores, int duracaoPartida, int popularidade, double alturaCesta) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.alturaCesta = alturaCesta;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 400.0;
    }

    @Override
    public void exibirRegras() {
        super.exibirRegras();
        System.out.println("Altura da cesta: " + alturaCesta + " m");
    }
}
