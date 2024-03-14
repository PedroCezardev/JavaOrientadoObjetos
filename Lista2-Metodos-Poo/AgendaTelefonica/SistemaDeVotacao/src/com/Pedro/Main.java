package com.Pedro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CadastrarVoto cadastro = new CadastrarVoto();

        int opcoes;

        do {

            System.out.println("Menu de opcoes: ");
            System.out.println("1. Adicionar Candidato.");
            System.out.println("2. Exibir Candidato.");
            System.out.println("3. Adicionar Voto.");
            System.out.println("4. Zerar voto.");
            System.out.println("5. Comparar Votos.");
            System.out.println("6. Remover Candidato.");
            System.out.println("0. Sair do programa.");

            opcoes = input.nextInt();
            input.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Nome do Candidato: ");
                    String nome = input.nextLine();
                    System.out.println("Digite os votos recebidos: ");
                    int votosRecebidos = input.nextInt();

                    Votacao novoCandidato = new Votacao(nome, votosRecebidos);
                    cadastro.adicionarCandidato(novoCandidato);

                case 2:
                    cadastro.exibirResultado();
                    break;

                case 3:
                    System.out.println("Nome do Candidato: ");
                    String nomeCandidato = input.nextLine();
                    System.out.println("Quantidade de votos: ");
                    int quantidadeVotos = input.nextInt();
                    cadastro.adicionarVoto(quantidadeVotos, nomeCandidato);
                    break;

                case 4:
                    System.out.println("Nome do Candidato: ");
                    String nomeCandidatoZerar = input.nextLine();
                    cadastro.zerarVotos(nomeCandidatoZerar);
                    break;

                case 5:
                    System.out.println("Nome do Candidato: ");
                    String nomeCandidatoComparar = input.nextLine();
                    cadastro.compararVotos(nomeCandidatoComparar);
                    break;

                case 6:
                    System.out.println("Nome do Candidato: ");
                    String nomeCandidatoRemover = input.nextLine();
                    cadastro.removerCandidato(nomeCandidatoRemover);
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