package Questao10;

public class Transporte {
    protected int capacidadePassageiros;
    protected double velocidadeMaxima; // km/h
    protected double consumo; // km por litro
    protected double preco; // base (p.ex. para cálculo)

    public Transporte(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.preco = preco;
    }

    public double calcularCustoViagem(double distancia) {
        // (distância/consumo) * 5.50
        if (consumo <= 0) return Double.POSITIVE_INFINITY;
        return (distancia / consumo) * 5.50;
    }

    public void exibirDados() {
        System.out.println("Capacidade: " + capacidadePassageiros + " passageiros");
        System.out.println("Vel. Máx.: " + velocidadeMaxima + " km/h");
        System.out.println("Consumo: " + consumo + " km/l");
        System.out.printf("Preço base: R$ %.2f%n", preco);
    }
}