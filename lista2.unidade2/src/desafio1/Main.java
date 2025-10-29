package desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        List<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(largura, altura));
        formas.add(new Circulo(raio));

        System.out.println();
        for (Forma f : formas) {
            f.exibirNome();
            System.out.printf("Área: %.4f\n", f.calcularArea());
            System.out.printf("Perímetro: %.4f\n", f.calcularPerimetro());
            System.out.println("---");
        }
        sc.close();
    }
}
