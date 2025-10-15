package Questao6;

public class Main {
    public static void main(String[] args) {
        Filme f = new Filme("Inception", 2010, 148, 10.0, "Christopher Nolan", "Suspense");
        Serie s = new Serie("Stranger Things", 2016, 50, 20.0, 4, 8);

        System.out.println("=== Filme ===");
        f.exibirInfo();
        System.out.println("\n=== Série ===");
        s.exibirInfo();
    }
}
