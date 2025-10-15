package Questao7;

public class Esporte {
    protected String nome;
    protected int numeroJogadores;
    protected int duracaoPartida; // em minutos
    protected int popularidade; // escala arbitrária

    public Esporte(String nome, int numeroJogadores, int duracaoPartida, int popularidade) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
    }

    public double calcularCustoEquipamento() {
        return 500.0;
    }

    public void exibirRegras() {
        System.out.println("Esporte: " + nome);
        System.out.println("Número de jogadores: " + numeroJogadores);
        System.out.println("Duração: " + duracaoPartida + " min");
        System.out.println("Popularidade: " + popularidade);
        System.out.printf("Custo equipamento: R$ %.2f%n", calcularCustoEquipamento());
    }
}