package br.com.exemplo.eleicao.sistema;

import br.com.exemplo.eleicao.entidades.Voto;
import br.com.exemplo.eleicao.interfaces.Candidato;
import java.util.ArrayList;
import java.util.List;

public class UrnaEletronica {
    private List<Candidato> candidatosRegistrados;
    private List<Voto> votosComputados;

    public UrnaEletronica() {
        this.candidatosRegistrados = new ArrayList<>();
        this.votosComputados = new ArrayList<>();
    }

    public void registrarCandidato(Candidato novoCandidato) {
        for (Candidato c : candidatosRegistrados) {
            if (c.getNumeroCandidato() == novoCandidato.getNumeroCandidato()) {
                System.out.println("Erro: Número " + c.getNumeroCandidato() + " já registrado!");
                return;
            }
        }
        candidatosRegistrados.add(novoCandidato);
        System.out.println("Candidato número " + novoCandidato.getNumeroCandidato() + " registrado com sucesso!");
    }

    public void receberVoto(Voto voto) {
        int numeroVotado = voto.getNumeroCandidatoVotado();
        Candidato candidatoEncontrado = null;

        for (Candidato c : candidatosRegistrados) {
            if (c.getNumeroCandidato() == numeroVotado) {
                candidatoEncontrado = c;
                break;
            }
        }

        if (candidatoEncontrado != null) {
            candidatoEncontrado.receberVoto();
            votosComputados.add(voto);
            System.out.println("Voto para o número " + numeroVotado + " confirmado!");
        } else {
            System.out.println("Voto nulo (candidato " + numeroVotado + " não encontrado).");
        }
    }

    public void exibirResultados() {
        System.out.println("\n===== RESULTADOS =====");
        for (Candidato c : candidatosRegistrados) {
            c.exibirDados();
        }
    }

    public List<Candidato> getCandidatosRegistrados() {
        return candidatosRegistrados;
    }
}
