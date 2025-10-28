package P_O_O.Lista em sala.Questao7;

public abstract class Veiculo {
    protected String cor;

    public Veiculo(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void exibirInfo() {
        System.out.println("Cor do veículo: " + cor);
    }
}
