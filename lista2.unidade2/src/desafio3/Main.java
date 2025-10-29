package desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Desafio 3: Animais e Habilidades ---");
        System.out.print("Nome do cachorro: ");
        String nomeC = sc.nextLine();
        System.out.print("Nome da pomba: ");
        String nomeP = sc.nextLine();
        System.out.print("Nome do pato: ");
        String nomeT = sc.nextLine();

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro(nomeC));
        animais.add(new Pomba(nomeP));
        animais.add(new Pato(nomeT));

        System.out.println();
        for (Animal a : animais) {
            a.comer();
            a.fazerSom();
            if (a instanceof Voador) {
                ((Voador) a).voar();
            }
            if (a instanceof Nadador) {
                ((Nadador) a).nadar();
            }
            System.out.println("---");
        }
        sc.close();
    }
}
