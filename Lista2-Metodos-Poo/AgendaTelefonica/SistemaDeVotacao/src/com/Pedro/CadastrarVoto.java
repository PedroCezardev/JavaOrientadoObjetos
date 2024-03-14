package com.Pedro;
import java.util.ArrayList;

public class CadastrarVoto {
    private ArrayList<Votacao> lista;

    CadastrarVoto(){
        lista = new ArrayList<Votacao>();
    }

    // Método para comparar os votos do candidato fornecido com os votos dos demais candidatos
    public void compararVotos(String nomeCandidato) {
        // Variável para armazenar o candidato fornecido
        Votacao candidato = null;

        // Itera sobre a lista de votações para encontrar o candidato fornecido
        for (Votacao votacao : lista) {
            // Verifica se o nome do candidato atual corresponde ao nome fornecido
            if (votacao.getCandidato().equals(nomeCandidato)) {
                // Se encontrar o candidato, armazena na variável 'candidato' e interrompe o loop
                candidato = votacao;
                break;
            }
        }

        // Verifica se o candidato foi encontrado na lista
        if (candidato == null) {
            // Se o candidato não for encontrado, exibe mensagem e retorna
            System.out.println("Candidato '" + nomeCandidato + "' não encontrado.");
            return;
        }

        // compara os votos do candidato com os demais candidatos
        for (Votacao votacao : lista) {
            // Obtém a quantidade de votos do candidato atual e de outro candidato
            int votosCandidatoAtual = candidato.getVotosRecebidos();
            int votosOutroCandidato = votacao.getVotosRecebidos();

            // Compara os votos do candidato atual com os votos do outro candidato
            if (votosCandidatoAtual > votosOutroCandidato) {
                // Se o candidato atual tiver mais votos, exibe mensagem indicando isso
                System.out.println(candidato.getCandidato() + " tem mais votos do que " + votacao.getCandidato());
            } else if (votosCandidatoAtual < votosOutroCandidato) {
                // Se o outro candidato tiver mais votos, exibe mensagem indicando isso e retorna
                System.out.println(votacao.getCandidato() + " tem mais votos do que " + candidato.getCandidato());
                return;
            }
            // Se ambos os candidatos tiverem o mesmo número de votos, exibe mensagem indicando isso
            System.out.println("Ambos os candidatos têm o mesmo número de votos.");
        }
    }

    public void zerarVotos(String nomeCandidato){
        boolean candidatoEncontrado = false;
        for (Votacao votacao : lista){
            if (votacao.getCandidato().equals(nomeCandidato)){
                votacao.setVotosRecebidos(0);
                System.out.println("Votos do Candidato '" + nomeCandidato + "' foram zerados. \n");
                candidatoEncontrado = true;
                break; // Interrompe o loop após encontrar o candidato
            }
        }
        if (!candidatoEncontrado) {
            System.out.println("Candidato '" + nomeCandidato + "' não encontrado. \n");
        }
    }

    public void adicionarVoto(int voto, String nomeCandidato){
        for (Votacao votacao : lista){
            if (votacao.getCandidato().equals(nomeCandidato)){
                votacao.setVotosRecebidos(votacao.getVotosRecebidos() + voto);
                System.out.println(voto + " votos recebidos no candidato: '" + nomeCandidato + "' \n");
                return;
            }
            System.out.println("Candidato não encontrado. \n");
        }
    }

    public void exibirResultado(){
        for (Votacao votacao : lista){
            votacao.exibirInfo();
        }
    }

    public void adicionarCandidato(Votacao candidato){
        lista.add(candidato);
    }

    public void removerCandidato(String nomeCandidatoRemover) {
        boolean candidatoRemovido = false;
        for (int i = 0; i < lista.size(); i++) {
            Votacao votacao = lista.get(i); // Obtém o candidato atual da lista
            // Verifica se o nome do candidato atual corresponde ao nome fornecido
            if (votacao.getCandidato().equals(nomeCandidatoRemover)) {
                lista.remove(i);
                // Atualiza o índice para continuar a verificação corretamente
                i--; // Como removemos um elemento, precisamos decrementar o índice
                candidatoRemovido = true;
            }
        }
        if (candidatoRemovido) {
            System.out.println("Candidato '" + nomeCandidatoRemover + "' removido com sucesso.");
        } else {
            System.out.println("Candidato '" + nomeCandidatoRemover + "' não encontrado.");
        }
    }


}
