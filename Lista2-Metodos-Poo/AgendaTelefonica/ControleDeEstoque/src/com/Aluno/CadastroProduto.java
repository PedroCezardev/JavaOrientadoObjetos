package com.Aluno;
import java.util.ArrayList;

public class CadastroProduto {
    private ArrayList<ProdutoEstoque> lista;

    CadastroProduto(){
        lista = new ArrayList<ProdutoEstoque>();
    }

    public void adicionarEstoque(ProdutoEstoque produto){
            lista.add(produto);
    }

    public void removerEstoque(String nomeProduto){
        for(ProdutoEstoque produto : lista){
            if (produto.getNome().equals(nomeProduto)){
                lista.remove(produto);
                System.out.println("Produto: '" + nomeProduto + "' removido. \n");
                return;
            }
        }
    }

    public void exibirEstoque(){
        for (ProdutoEstoque produto : lista){
            produto.exibirInfo();
        }
    }

    public void atualizarPreco(String nomeProduto, double novoPreco){
        for(ProdutoEstoque produto : lista){
            produto.getNome().equals(nomeProduto);
            produto.setPrecoUnitario(novoPreco);
            System.out.println("Preco do produto '" + nomeProduto + "' atualizado para '" + novoPreco + "'. \n");
            return;
        }
    }
}
