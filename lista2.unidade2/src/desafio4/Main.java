package desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Desafio 4: Dispositivos de Mídia ---");
        CaixaDeSom caixa = new CaixaDeSom();
        Projetor projetor = new Projetor();
        SmartTV tv = new SmartTV();
        SalaDeMidia sala = new SalaDeMidia();

        System.out.print("Digite o nome da faixa para tocar na Caixa de Som: ");
        String faixa = sc.nextLine();
        sala.iniciarSessaoDeMusica(caixa, faixa);

        System.out.print("Digite o nome do filme para exibir no Projetor: ");
        String filme = sc.nextLine();
        sala.iniciarSessaoDeFilme(projetor, filme);

        System.out.print("Digite o nome da faixa para tocar na SmartTV: ");
        String faixa2 = sc.nextLine();
        sala.iniciarSessaoDeMusica(tv, faixa2);

        System.out.print("Digite o nome do filme para exibir na SmartTV: ");
        String filme2 = sc.nextLine();
        sala.iniciarSessaoDeFilme(tv, filme2);
        sc.close();
    }
}
