package com.Pedro;
import java.util.ArrayList;

public class CadastroTrasacao {
    private ArrayList<Transacao> lista;

    CadastroTrasacao(){
        lista = new ArrayList<Transacao>();
    }

    public void calcularSaldo(String descricaoTransacao) {
        boolean transacaoEncontrada = false;
        for (Transacao transacao1 : lista) {
            double saldo = transacao1.getSaldoAtual();
            if (transacao1.getDescricao().equals(descricaoTransacao)) {
                transacaoEncontrada = true;
                saldo -= transacao1.getValor();
            }
            if (transacaoEncontrada){
                System.out.println("O seu Saldo atual e de: " + saldo + "' \n");
            } else {
                System.out.println("Transacao nao encontrada. \n");
            }
        }
    }

    public void alterarDescricao(String descricao, String novaDescricao){
        for (Transacao transacao : lista){
            if(transacao.getDescricao().equals(descricao)){
                transacao.setDescricao(novaDescricao);
                System.out.println("Descricao '" + descricao + "' transacao alterada para: '" + novaDescricao + "' \n");
                return;
            }
        }
        System.out.println("Descricao nao encontrada. \n");
    }

    public void removerTransacao(String descricaoAtividade){
        for (int i = 0; i < lista.size(); i++){
            Transacao transacao = lista.get(i);
            if (transacao.getDescricao().equals(descricaoAtividade)){
                lista.remove(i);
                System.out.println("Transacao '" + descricaoAtividade + "'removida \n");
                return;
            }
        }
        System.out.println("Transacao '" + descricaoAtividade + "'nao encontrada. \n");
    }

    public void exibirTransacao(){
        for (Transacao transacao : lista){
            transacao.exibirInfo();
        }
    }

    public void adicionarTrasacao(Transacao trasancao){
        lista.add(trasancao);
    }
}
