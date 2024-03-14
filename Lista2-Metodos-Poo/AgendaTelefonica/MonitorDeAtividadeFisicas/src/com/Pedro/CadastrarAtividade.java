package com.Pedro;
import java.util.ArrayList;

public class CadastrarAtividade {
    private ArrayList<AtividadeFisica> lista;

    CadastrarAtividade(){
        lista = new ArrayList<AtividadeFisica>();
    }

    public void compararCalorias(String tipoAtividade) {
        // Variável para armazenar o tipo de atividade fornecido
        AtividadeFisica AtividadeTipo = null;

        // Itera sobre a lista de atividades para encontrar o tipo fornecido
        for (AtividadeFisica atividade : lista) {
            // Verifica se o tipo de atividade atual corresponde ao tipo fornecido
            if (atividade.getTipoDeAtividade().equals(tipoAtividade)) {
                // Se encontrar, armazena na variável 'AtividadeTipo' e interrompe o loop
                AtividadeTipo = atividade;
                break;
            }
        }

        // Verifica se o tipo de atividade foi encontrado na lista
        if (AtividadeTipo == null) {
            // Se não for encontrado, exibe mensagem e retorna
            System.out.println("Atividade com o tipo '" + tipoAtividade + "' nao encontrada.");
            return;
        }

        // Itera sobre a lista novamente para comparar as calorias da atividade com as outras
        for (AtividadeFisica atividade : lista) {
            // Obtém as calorias da atividade atual e da atividade armazenada em 'AtividadeTipo'
            int caloriasAtual = atividade.getCaloriasQueimadas();
            int caloriasTipo = AtividadeTipo.getCaloriasQueimadas();

            // Compara as calorias da atividade atual com as calorias do tipo de atividade fornecido
            if (caloriasAtual > caloriasTipo) {
                // Se a atividade atual tiver mais calorias, exibe mensagem indicando isso
                System.out.println(atividade.getTipoDeAtividade() + " tem mais calorias do que " + AtividadeTipo.getTipoDeAtividade());
            } else if (caloriasAtual < caloriasTipo) {
                // Se o tipo de atividade tiver mais calorias, exibe mensagem indicando isso e retorna
                System.out.println(AtividadeTipo.getTipoDeAtividade() + " tem mais calorias do que " + atividade.getTipoDeAtividade());
                return;
            }
        }
        // Se todas as atividades tiverem o mesmo número de calorias, exibe mensagem indicando isso
        System.out.println("Todas as atividades tem o mesmo numero de calorias.");
    }


    public void alterarTipoAtividade(String nomeAtividade, String novoTipo){
        for (AtividadeFisica atividade : lista){
            if (atividade.getTipoDeAtividade().equals(nomeAtividade)){
                atividade.setTipoDeAtividade(novoTipo);
                System.out.println("Tipo de Atividade alterado para: '" + novoTipo + "' \n");
                return;
            }
        }
        System.out.println("Tipo de Atividade nao encontrado.");
    }

    public void exibirAtividade(){
        for (AtividadeFisica atividade : lista){
            atividade.exibirInfo();
        }
    }

    public void remover(String nomeAtividade) {
        for (int i = 0; i < lista.size(); i++) {
            AtividadeFisica atividade = lista.get(i);
            if (atividade.getTipoDeAtividade().equals(nomeAtividade)) {
                lista.remove(i);
                System.out.println("Atividade '" + nomeAtividade + "' removida.");
                return; // Se encontrou e removeu a atividade, pode sair do método
            }
        }
        System.out.println("Atividade '" + nomeAtividade + "' não encontrada.");
    }


    public void adicionarAtividade(AtividadeFisica atividade){
            lista.add(atividade);
    }
}
