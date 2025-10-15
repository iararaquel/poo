package Questao5;

public class Main {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("Apple", "iPhone X", 4500.0, 110, 6.1, 3000);
        Notebook n = new Notebook("Dell", "Inspiron", 3500.0, 110, "Intel i5", 8);

        System.out.println("=== Smartphone ===");
        s.exibirEspecificacoes();
        System.out.println("\n=== Notebook ===");
        n.exibirEspecificacoes();
    }
}