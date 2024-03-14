package com.Pedro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CadastrarAtividade cadastro = new CadastrarAtividade();

        int opcoes;

        do {

            System.out.println("Menu de opcoes: ");
            System.out.println("1. Adicionar tipo de Atividade.");
            System.out.println("2. Exibir Atividades.");
            System.out.println("3. Alterar Tipo de Atividade.");
            System.out.println("4. Comparar Calorias.");
            System.out.println("5. Remover Atividade.");
            System.out.println("0. Sair do programa.");

            opcoes = input.nextInt();
            input.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Tipo da Atividade: ");
                    String nome = input.nextLine();
                    System.out.println("Tempo de Duracao: ");
                    String duracao = input.nextLine();
                    System.out.println("Quantidade de Calourias: ");
                    int caloriasQueimadas = input.nextInt();

                    AtividadeFisica novaAtividade = new AtividadeFisica(nome, duracao, caloriasQueimadas);
                    cadastro.adicionarAtividade(novaAtividade);
                    break;

                case 2:
                    cadastro.exibirAtividade();
                    break;

                case 3:
                    System.out.println("Nome do Tipo da Atividade: ");
                    String nomeAtividadeAtualizar = input.nextLine();
                    System.out.println("Novo Tipo de Atividade: ");
                    String novoTipoAtv = input.nextLine();
                    cadastro.alterarTipoAtividade(nomeAtividadeAtualizar, novoTipoAtv);
                    break;

                case 4:
                    System.out.println("Nome da Atividade: ");
                    String nomeAtividadeComparar = input.nextLine();
                    cadastro.compararCalorias(nomeAtividadeComparar);
                    break;

                case 5:
                    System.out.println("Nome da Atividade: ");
                    String nomeAtividadeCancelar = input.nextLine();
                    cadastro.remover(nomeAtividadeCancelar);
                    break;

                case 0:
                    System.out.println("Codigo Encerrado. ;)");
                    break;

                default:
                    System.out.println("Opcao Invalida. Por favor, escolha uma das opcoes acima.");

            }

        } while (opcoes != 0);

    }
}