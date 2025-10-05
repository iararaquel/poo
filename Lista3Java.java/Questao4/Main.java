package Questao4;

public class Main {
    public static void main(String[] args) {
        Apartamento ap = new Apartamento("Av. A, 100", 85.0, 2, 350000.0, 5, 450.0);
        Casa casa = new Casa("Rua B, 200", 200.0, 4, 550000.0, 60.0, true);

        System.out.println("=== Apartamento ===");
        ap.exibirCaracteristicas();
        System.out.println("\n=== Casa ===");
        casa.exibirCaracteristicas();
    }
}