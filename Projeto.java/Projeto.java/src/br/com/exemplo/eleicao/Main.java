package br.com.exemplo.eleicao;

import br.com.exemplo.eleicao.entidades.*;
import br.com.exemplo.eleicao.sistema.UrnaEletronica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UrnaEletronica urna = new UrnaEletronica();

        System.out.println("=== SISTEMA DE ELEIÇÃO ===");

        System.out.println("\nQuantos partidos deseja cadastrar?");
        int qtdPartidos = sc.nextInt();
        sc.nextLine(); 

        Partido[] partidos = new Partido[qtdPartidos];
        for (int i = 0; i < qtdPartidos; i++) {
            System.out.print("\nNome do partido " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Sigla: ");
            String sigla = sc.nextLine();
            partidos[i] = new Partido(nome, sigla);
        }

        System.out.println("\nQuantos candidatos deseja cadastrar?");
        int qtdCandidatos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdCandidatos; i++) {
            System.out.println("\nCandidato " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Escolha o partido: ");
            for (int j = 0; j < partidos.length; j++) {
                System.out.println((j + 1) + " - " + partidos[j].getNome() + " (" + partidos[j].getSigla() + ")");
            }
            int escolhaPartido = sc.nextInt();
            sc.nextLine();
            Partido partidoEscolhido = partidos[escolhaPartido - 1];

            System.out.print("Número do candidato: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Cargo (1 - Prefeito, 2 - Vereador): ");
            int cargo = sc.nextInt();
            sc.nextLine();

            if (cargo == 1) {
                urna.registrarCandidato(new Prefeito(nome, partidoEscolhido, numero));
            } else {
                urna.registrarCandidato(new Vereador(nome, partidoEscolhido, numero));
            }
        }

        System.out.println("\nQuantos eleitores irão votar?");
        int qtdEleitores = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdEleitores; i++) {
            System.out.println("\nEleitor " + (i + 1));
            System.out.print("Nome: ");
            String nomeEleitor = sc.nextLine();

            Eleitor eleitor = new Eleitor(nomeEleitor);

            System.out.print("Digite o número do candidato em quem deseja votar: ");
            int numeroVoto = sc.nextInt();
            sc.nextLine();

            urna.receberVoto(new Voto(eleitor, numeroVoto));
        }

        urna.exibirResultados();

        sc.close();
    }
}
