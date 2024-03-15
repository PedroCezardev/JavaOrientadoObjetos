package com.Pedro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CadastroTransacao cadastro = new CadastroTransacao();

        int opcoes;

        do {

            System.out.println("Menu de opcoes: ");
            System.out.println("1. Inserir Conta.");
            System.out.println("2. Exibir Conta.");
            System.out.println("3. Depositar na Conta.");
            System.out.println("4. Sacar da Conta.");
            System.out.println("5. Transferir para outra Conta.");
            System.out.println("6. Remover Atividade.");
            System.out.println("0. Sair do programa.");

            opcoes = input.nextInt();
            input.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Nome do Titular da Conta: ");
                    String nomeTitular = input.nextLine();
                    System.out.println("Numero da Conta: ");
                    String numeroConta = input.nextLine();
                    System.out.println("Saldo da Conta: ");
                    double saldo = input.nextDouble();

                    ContaCorrente novaConta = new ContaCorrente(nomeTitular, numeroConta, saldo);
                    cadastro.adicionarConta(novaConta);
                    break;

                case 2:
                    cadastro.exibirConta();
                    break;

                case 3:
                    System.out.println("Nome do titular da Conta: ");
                    String nomeTitularDeposito = input.nextLine();
                    System.out.println("Digite Quanto voce deseja depositar na conta: ");
                    double depositar = input.nextDouble();
                    cadastro.depositar(nomeTitularDeposito, depositar);
                    break;

                case 4:
                    System.out.println("Nome do Titular da Conta: ");
                    String nomeTitularSacar = input.nextLine();
                    System.out.println("Digite Quanto voce deseja sacar: ");
                    double sacar = input.nextDouble();
                    cadastro.sacarConta(nomeTitularSacar, sacar);
                    break;

                case 5:
                    System.out.println("Nome do titular da Conta: ");
                    String nomeTitularTransferir = input.nextLine();
                    System.out.println("Nome titular Destino: ");
                    String nomeTitularDestino = input.nextLine();
                    System.out.println("Digite Quanto voce deseja Transferir: ");
                    double transferir = input.nextDouble();
                    cadastro.transferir(nomeTitularTransferir, nomeTitularDestino, transferir);
                    break;

                case 6:
                    System.out.println("Nome do Titular da Conta: ");
                    String nomeTitularRemover = input.nextLine();
                    cadastro.removerConta(nomeTitularRemover);
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