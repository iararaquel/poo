package Questao10;

public class Onibus extends Transporte {
    private int numeroEixos;

    public Onibus(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, int numeroEixos) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.numeroEixos = numeroEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custo = super.calcularCustoViagem(distancia);
        return custo * 0.80; // desconto de 20%
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de eixos: " + numeroEixos);
    }
}
