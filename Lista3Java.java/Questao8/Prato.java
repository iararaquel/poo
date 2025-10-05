package Questao8;

import java.util.List;

public class Prato {
    protected String nome;
    protected double preco;
    protected int tempoPreparo; // em minutos
    protected List<String> ingredientes;

    public Prato(String nome, double preco, int tempoPreparo, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.ingredientes = ingredientes;
    }

    public double calcularTaxaServico() {
        return preco * 0.10;
    }

    public void exibirCardapio() {
        System.out.println("Prato: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Tempo preparo: " + tempoPreparo + " min");
        System.out.println("Ingredientes: " + String.join(", ", ingredientes));
        System.out.printf("Taxa serviço: R$ %.2f%n", calcularTaxaServico());
    }
}
