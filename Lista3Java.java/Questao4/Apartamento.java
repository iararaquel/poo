package Questao4;

public class Apartamento extends Imovel {
    private int andar;
    private double valorCondominio;

    public Apartamento(String endereco, double area, int numeroQuartos, double preco, int andar, double valorCondominio) {
        super(endereco, area, numeroQuartos, preco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return preco * 0.06;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Andar: " + andar);
        System.out.printf("Valor Condomínio: R$ %.2f%n", valorCondominio);
    }
}
