package Questao8;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Prato p = new Prato("Lasanha", 35.0, 40, Arrays.asList("massa", "queijo", "molho"));
        PratoVegano pv = new PratoVegano("Hambúrguer Veg", 28.0, 25, Arrays.asList("pão", "soja", "alface"), true);
        PratoGourmet pg = new PratoGourmet("File Mignon", 120.0, 50, Arrays.asList("carne", "sal", "manteiga"), "Chef João");

        System.out.println("=== Prato ===");
        p.exibirCardapio();
        System.out.println("\n=== Prato Vegano ===");
        pv.exibirCardapio();
        System.out.println("\n=== Prato Gourmet ===");
        pg.exibirCardapio();
    }
}
