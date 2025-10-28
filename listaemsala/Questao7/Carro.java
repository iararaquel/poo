package P_O_O.Lista em sala.Questao7;

public class Carro extends Veiculo {

    private String modelo;

    public Carro(String cor, String modelo) {

        super(cor);
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
    }
}
