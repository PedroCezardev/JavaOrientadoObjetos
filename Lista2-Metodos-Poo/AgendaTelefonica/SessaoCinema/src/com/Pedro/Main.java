package com.Pedro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CadastroIngresso cadastro = new CadastroIngresso();

        int opcoes;

        do {

            System.out.println("Menu de opcoes: ");
            System.out.println("1. Adicionar Filmes.");
            System.out.println("2. Exibir Sessoes.");
            System.out.println("3. Comprar ingresso.");
            System.out.println("4. Atualizar horario.");
            System.out.println("5. Remover Sessao.");
            System.out.println("0. Sair do programa.");

            opcoes = input.nextInt();
            input.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Nome do Filme: ");
                    String nome = input.nextLine();
                    System.out.println("Horario do Filme: ");
                    String horario = input.nextLine();
                    System.out.println("Capacidade Total: ");
                    int capacidade = input.nextInt();
                    System.out.println("Total de Ingressos Vendidos: ");
                    int ingressosVendidos = input.nextInt();
                    input.nextLine();

                    SessaoCinema novaSessao = new SessaoCinema(nome, horario, capacidade, ingressosVendidos);
                    cadastro.adicionarSessao(novaSessao);

                case 2:
                    cadastro.exibirInfo();
                    break;

                case 3:
                    System.out.println("Nome do Filme que deseja comprar o ingresso: ");
                    String nomeFilme = input.nextLine();
                    System.out.println("Numero de Ingressos: ");
                    int ingressos = input.nextInt();
                    cadastro.venderIngresso(nomeFilme, ingressos);
                    break;

                case 4:
                    System.out.println("Nome do Filme: ");
                    String nomeFIlme = input.nextLine();
                    System.out.println("Novo Horario: ");
                    String novoHorario = input.nextLine();
                    cadastro.alterarHorario(nomeFIlme, novoHorario);
                    break;

                case 5:
                    System.out.println("Nome do Filme: ");
                    String nomeFilmeRemover = input.nextLine();
                    cadastro.removerSessao(nomeFilmeRemover);
                    break;

                case 0:
                    System.out.println("Codigo Encerrado. ;)");

                default:
                    System.out.println("Opcao Invalida. Por favor, escolha uma das opcoes acima.");

            }

        } while (opcoes != 0);

    }
}

