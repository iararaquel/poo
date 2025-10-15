package Questao5;

public class ProdutoEletronico {
    protected String marca;
    protected String modelo;
    protected double preco;
    protected int voltagem;

    public ProdutoEletronico(String marca, String modelo, double preco, int voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public double calcularGarantiaEstendida() {
        return preco * 0.15;
    }

    public void exibirEspecificacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Voltagem: " + voltagem + "V");
        System.out.printf("Garantia Estendida: R$ %.2f%n", calcularGarantiaEstendida());
    }
}