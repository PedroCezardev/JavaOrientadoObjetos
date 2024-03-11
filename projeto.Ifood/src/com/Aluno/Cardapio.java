package com.Aluno;

public class Cardapio {
    private int id;
    private String nome;
    private String descricao;
    private double preco;

    Cardapio(int id, String nome, String descricao, double preco){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Exibir informações
    void exibirInfo() {
        System.out.println("Id do produto: " + id);
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Descrição do Produto: " + descricao);
        System.out.println("Preço do Produto: " + preco);
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}