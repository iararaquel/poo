package Questao6;

public class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected int duracao; // em minutos (para filme) ou duração média por ep
    protected double preco;

    public Midia(String titulo, int anoLancamento, int duracao, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }

    public double calcularPrecoAluguel() {
        return preco * 0.10;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Duração: " + duracao + " min");
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.printf("Preço Aluguel: R$ %.2f%n", calcularPrecoAluguel());
    }
}