package Questao3;
public class Curso {
    protected String nome;
    protected int cargaHoraria;
    protected double preco;
    protected String nivel;

    public Curso(String nome, int cargaHoraria, double preco, String nivel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.preco = preco;
        this.nivel = nivel;
    }

    public double calcularDesconto() {
        return preco * 0.10;
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Nível: " + nivel);
        System.out.printf("Desconto: R$ %.2f%n", calcularDesconto());
    }
}