package com.Aluno;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        CadastroTarefas cadastro = new CadastroTarefas();

        int opcao;

        do {
            System.out.println("Menu de Opcoes.");
            System.out.println("1. Adicionar Tarefa.");
            System.out.println("2. Exibir Tarefas.");
            System.out.println("3. Alterar Prioridade de uma Tarefa.");
            System.out.println("4. Concluir Tarefa.");
            System.out.println("5. Resetar Tarefa.");
            System.out.println("6. Remover Tarefa.");
            System.out.println("0. Sair.");
            System.out.println("Escolha uma opcao: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da Tarefa: ");
                    String nome = input.nextLine();
                    System.out.print("Descricao da Tarefa: ");
                    String descricao = input.nextLine();
                    System.out.print("Prioridade da Tarefa: ");
                    String prioridade = input.nextLine();

                    Tarefa novaTarefa = new Tarefa(nome, descricao, false, prioridade);
                    cadastro.adicionarTarefa(novaTarefa);

                case 2:
                    cadastro.exibirTarefa();
                    break;

                case 3:
                    System.out.println("Nome da Tarefa: ");
                    String nomeTarefa = input.nextLine();
                    System.out.println("Nova Prioridade: ");
                    String novaPrioridade = input.nextLine();
                    cadastro.alterarPrioridade(nomeTarefa, novaPrioridade);
                    break;

                case 4:
                    System.out.println("Nome da Tarefa: ");
                    String nomeTarefaConcluir = input.nextLine();
                    cadastro.concluirTarefa(nomeTarefaConcluir);
                    break;

                case 5:
                    System.out.println("Nome da Tarefa: ");
                    String nomeTarefaResetar = input.nextLine();
                    cadastro.resetarTarefa(nomeTarefaResetar);
                    break;

                case 6:
                    System.out.println("Nome da Tarefa: ");
                    String nomeTarefaRemover = input.nextLine();
                    cadastro.removerTarefa(nomeTarefaRemover);
                    break;

                case 0:
                    System.out.println("Codigo finalizado.");
                    break;

                default:
                    System.out.println("Opção invalida. Por favor, escolha umas das opcoes acima.");
            }
        } while (opcao != 0);

    }
}
