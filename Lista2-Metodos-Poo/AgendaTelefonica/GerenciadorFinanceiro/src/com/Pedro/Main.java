package com.Pedro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CadastroTrasacao cadastro = new CadastroTrasacao();

        int opcoes;

        do {

            System.out.println("Menu de opcoes: ");
            System.out.println("1. Fazer Transacoes.");
            System.out.println("2. Exibir Transacoes.");
            System.out.println("3. Alterar Descricao da Transacao.");
            System.out.println("4. Calcular Saldo.");
            System.out.println("5. Remover Transacao.");
            System.out.println("0. Sair do programa.");

            opcoes = input.nextInt();
            input.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Descricao da Transacao: ");
                    String descricao = input.nextLine();
                    System.out.println("Tipo da Transacao: ");
                    String tipo = input.nextLine();
                    System.out.println("Saldo Atual da conta: ");
                    double saldoAtual = input.nextDouble();
                    System.out.println("Valor da Transacao: ");
                    double valor = input.nextDouble();


                    Transacao novaTransacao = new Transacao(descricao, valor, tipo, saldoAtual);
                    cadastro.adicionarTrasacao(novaTransacao);
                    break;

                case 2:
                    cadastro.exibirTransacao();
                    break;

                case 3:
                    System.out.println("Descricao da Transacao ");
                    String descricaoAtividade = input.nextLine();
                    System.out.println("Nova Descricao: ");
                    String novaDescricao = input.nextLine();
                    cadastro.alterarDescricao(descricaoAtividade, novaDescricao);
                    break;

                case 4:
                    System.out.println("Descricao da Transacao: ");
                    String descricaoTransacaoSaldo = input.nextLine();
                    cadastro.calcularSaldo(descricaoTransacaoSaldo);
                    break;

                case 5:
                    System.out.println("Descricao da Transacao: ");
                    String descricaoAtividadeRemover = input.nextLine();
                    cadastro.removerTransacao(descricaoAtividadeRemover);
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