
package Questao3;
public class Main {
    public static void main(String[] args) {
        CursoPresencial cp = new CursoPresencial("Java POO", 40, 1200.0, "Intermediário", "Campus A");
        CursoOnline co = new CursoOnline("Python Avançado", 60, 1500.0, "Avançado", "Udemy");

        System.out.println("=== Curso Presencial ===");
        cp.exibirInformacoes();
        System.out.println("\n=== Curso Online ===");
        co.exibirInformacoes();
    }
}