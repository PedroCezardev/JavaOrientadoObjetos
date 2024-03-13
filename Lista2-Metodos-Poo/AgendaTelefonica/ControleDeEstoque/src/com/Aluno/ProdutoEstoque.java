package com.Aluno;

public class ProdutoEstoque {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    // construtor
    ProdutoEstoque(String nome, int quantidade, double precoUnitario){
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // exibir as informações
    void exibirInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Quantidade do produto: " + quantidade);
        System.out.println("Preco Unitario do produto: " + precoUnitario + "\n");
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
