package P_O_O.Lista em sala.Questao9;

public abstract class Produto {
    protected int quantidadeEstoque;

    public Produto(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public abstract void verificarDisponibilidade(int quantidadeSolicitada);
}
