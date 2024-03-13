package com.Aluno;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        CadastroProduto cadastro = new CadastroProduto();

        int opcao;

        do{
            System.out.println("Menu de opcoes: ");
            System.out.println("1. Adicionar Produto.");
            System.out.println("2. Exibir Produto.");
            System.out.println("3. Atualizar preco do produto.");
            System.out.println("4. Remover produto.");
            System.out.println("0. Sair do programa.");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = input.nextLine();
                    System.out.print("Quantidade do Produto: ");
                    int quantidade = input.nextInt();
                    System.out.print("Preco do Produto: ");
                    double precoUnitario = input.nextDouble();

                    ProdutoEstoque novoProduto = new ProdutoEstoque(nome, quantidade, precoUnitario);
                    cadastro.adicionarEstoque(novoProduto);
                    break;

                case 2:
                    cadastro.exibirEstoque();
                    break;

                case 3:
                    System.out.println("Nome do produto: ");
                    String nomeProduto = input.nextLine();
                    System.out.println("Novo preco unitario: ");
                    double novoPreco = input.nextDouble();
                    cadastro.atualizarPreco(nomeProduto, novoPreco);
                    break;

                case 4:
                    System.out.println("Nome do Produto: ");
                    String nomeProdutoRemover = input.nextLine();
                    cadastro.removerEstoque(nomeProdutoRemover);
                    break;

                case 0:
                    System.out.println("Programa Finalizado. ;)");

                default:
                    System.out.println("Opcao invalida. Escolha uma das opcoes acima");
            }

        } while (opcao != 0);

    }
}
