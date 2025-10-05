package Questao9;

public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("1984", "George Orwell", 1949, 50.0);
        LivroDidatico ld = new LivroDidatico("Alg. Linear", "Autor X", 2015, 120.0, "Matemática");
        LivroRaro lr = new LivroRaro("Obra Rara", "Autor Y", 1888, 5000.0, true);

        System.out.println("=== Livro Comum ===");
        l.exibirFichaCatalografica();
        System.out.println("Multa 3 dias: R$ " + l.calcularMultaAtraso(3));

        System.out.println("\n=== Livro Didático ===");
        ld.exibirFichaCatalografica();
        System.out.println("Multa 3 dias: R$ " + ld.calcularMultaAtraso(3));

        System.out.println("\n=== Livro Raro ===");
        lr.exibirFichaCatalografica();
        System.out.println("Multa 3 dias: R$ " + lr.calcularMultaAtraso(3));
    }
}
