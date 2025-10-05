package Questao9;

public class LivroRaro extends Livro {
    private boolean edicaoLimitada;

    public LivroRaro(String titulo, String autor, int anoPublicacao, double preco, boolean edicaoLimitada) {
        super(titulo, autor, anoPublicacao, preco);
        this.edicaoLimitada = edicaoLimitada;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        return 5.0 * diasAtraso;
    }

    @Override
    public void exibirFichaCatalografica() {
        super.exibirFichaCatalografica();
        System.out.println("Edição limitada: " + (edicaoLimitada ? "Sim" : "Não"));
    }
}