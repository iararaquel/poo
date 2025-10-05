package Questao10;

public class Main {
    public static void main(String[] args) {
        Transporte t = new Transporte(4, 180.0, 12.0, 0);
        Onibus o = new Onibus(50, 100.0, 3.5, 0, 3);
        Metro m = new Metro(200, 80.0, 10.0, 0, true);

        double distancia = 100.0;
        System.out.println("=== Transporte Comum ===");
        t.exibirDados();
        System.out.printf("Custo viagem %.1f km: R$ %.2f%n", distancia, t.calcularCustoViagem(distancia));

        System.out.println("\n=== Ônibus ===");
        o.exibirDados();
        System.out.printf("Custo viagem %.1f km: R$ %.2f%n", distancia, o.calcularCustoViagem(distancia));

        System.out.println("\n=== Metrô ===");
        m.exibirDados();
        System.out.printf("Custo viagem %.1f km: R$ %.2f%n", distancia, m.calcularCustoViagem(distancia));
    }
}