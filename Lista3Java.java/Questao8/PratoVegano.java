package Questao8;

import java.util.List;

public class PratoVegano extends Prato {
    private boolean certificacaoVegan;

    public PratoVegano(String nome, double preco, int tempoPreparo, List<String> ingredientes, boolean certificacaoVegan) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.certificacaoVegan = certificacaoVegan;
    }

    @Override
    public double calcularTaxaServico() {
        return preco * 0.05;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Certificação Vegana: " + (certificacaoVegan ? "Sim" : "Não"));
    }
}

