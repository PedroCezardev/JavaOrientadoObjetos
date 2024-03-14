package com.Pedro;

import java.util.ArrayList;

public class CadastroIngresso {
    private ArrayList<SessaoCinema> lista;

    // construtor
    CadastroIngresso(){
        lista = new ArrayList<SessaoCinema>();
    }

    // método para comprar ingressos
    public boolean venderIngresso(String nomeFilme, int ingressos) {
        for (SessaoCinema sessao : lista) {
            if (sessao.getFilme().equals(nomeFilme)) {
                int capacidadeRestante = sessao.getCapacidadeTotal() - sessao.getIngressoVendidos();
                if (capacidadeRestante >= ingressos) {
                    sessao.setIngressoVendidos(sessao.getIngressoVendidos() + ingressos);
                    System.out.println(ingressos + " Ingressos comprados para o Filme '" + nomeFilme + "' com sucesso! \n");
                    return true; // Ingressos vendidos com sucesso
                } else {
                    System.out.println("Capacidade excedida para o filme '" + nomeFilme + "'. \n");
                    return false; // Capacidade excedida
                }
            }
        }
        System.out.println("Filme '" + nomeFilme + "' nao encontrado. \n");
        return false; // Filme não encontrado
    }

    // método para alterar horário
    public void alterarHorario(String nomeFilme, String novoHorario){
        for(SessaoCinema sessao : lista){
            if (sessao.getFilme().equals(nomeFilme)){
                sessao.setHorario(novoHorario);
                System.out.println("Horario do Filme: '" + nomeFilme + "' foi atualizado para: '"+ novoHorario + "' \n");
                return;
            }
        }
    }

    // método para exibir informações
    public void exibirInfo(){
        for (int i = 0; i < lista.size(); i++){
            lista.get(i).exibirInfo();
        }
    }

    // método para adicionar Sessões de filmes
    public void adicionarSessao(SessaoCinema sessao){
        lista.add(sessao);
    }

    // métodos para remover Sessões
    public void removerSessao(String nomeSessao){
        for(SessaoCinema sessao : lista){
            if (sessao.getFilme().equals(nomeSessao)) {
                lista.remove(nomeSessao);
                System.out.println("A sessao do FIlme: '" + nomeSessao + "'foi removida. \n");
                return;
            }
        }
        System.out.println("Sessão do Filme '" + nomeSessao + "' não encontrada. \n");
    }
}