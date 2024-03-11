package com.Aluno;

public class Categoria {
    private String nome;
    private String descricao;

    Categoria(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    // Exibir informações
    void exibirInfo() {
        System.out.println("Nome da Categoria: " + nome);
        System.out.println("Descrição da Categoria: " + descricao);
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Escrever os métodos: listarProdutos(): void
}