package com.Aluno;
import java.util.ArrayList;

public class CadastroTarefas {
    private ArrayList<Tarefa> lista;

    // construtor
    CadastroTarefas(){
        this.lista = new ArrayList<Tarefa>();
    }

    // método para exibir a Tarefa
    public void exibirTarefa(){
        for (int i = 0; i < lista.size(); i++){
            lista.get(i).exibirInfo();
        }
    }

    // método para alterar a prioridade da Tarefa
    public void alterarPrioridade(String nomeTarefa, String novaPrioridade){
        for(Tarefa tarefa : lista){
            if(tarefa.getNome().equals(nomeTarefa)){
                tarefa.setPrioridade(novaPrioridade);
                System.out.println("Prioridade da Tarefa: " + nomeTarefa + " alterada para: '" + novaPrioridade + "'. \n");
                return;
            }
        }
    }

    // método para concluir uma Tarefa
    public void concluirTarefa(String nomeTarefa){
        for (Tarefa tarefa : lista){
            if(tarefa.getNome().equals(nomeTarefa)){
                tarefa.setConcluida(true);
                System.out.println("Tarefa : " + nomeTarefa + " marcada como concluida. \n");
            }
            return;
        }
        System.out.println("Tarefa não encontrada.");
    }

    // método para resetar a Tarefa
    public void resetarTarefa(String nomeTarefa){
        for(Tarefa tarefa : lista){
            if(tarefa.getNome().equals(nomeTarefa)){
                tarefa.setConcluida(false);
                System.out.println("Tarefa: " + nomeTarefa + " resetada. \n");
                return;
            }
        }
        System.out.println("Tarefa não encontrada. ");
    }

    // métodod para adicionar Tarefa
    public void adicionarTarefa(Tarefa tarefa){
        lista.add(tarefa);
    }

    // método para remover a Tarefa
    public void removerTarefa(String nomeTarefa){
        for (Tarefa tarefa : lista){
            if (tarefa.getNome().equals(nomeTarefa)){
                lista.remove(tarefa);
                System.out.println("Tarefa: " + tarefa + " removida. \n");
                return;
            }
        }
        System.out.println("Tarefa não encontrada. ");
    }

}
