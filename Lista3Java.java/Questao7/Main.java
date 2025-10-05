package Questao7;

public class Main {
    public static void main(String[] args) {
        Futebol fut = new Futebol("Futebol", 11, 90, 10, 105.0);
        Basquete bas = new Basquete("Basquete", 5, 48, 8, 3.05);

        System.out.println("=== Futebol ===");
        fut.exibirRegras();
        System.out.println("\n=== Basquete ===");
        bas.exibirRegras();
    }
}
