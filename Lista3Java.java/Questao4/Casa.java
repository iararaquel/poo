package Questao4;

public class Casa extends Imovel {
    private double areaQuintal;
    private boolean temPiscina;

    public Casa(String endereco, double area, int numeroQuartos, double preco, double areaQuintal, boolean temPiscina) {
        super(endereco, area, numeroQuartos, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return preco * 0.10;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.printf("Área do Quintal: %.2f m²%n", areaQuintal);
        System.out.println("Tem piscina: " + (temPiscina ? "Sim" : "Não"));
    }
}
