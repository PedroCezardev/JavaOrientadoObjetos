package com.Aluno;

public class Departamento {
    private int id;
    private String nome;
    private String localizacao;
    private String responsavel;

    Departamento(int id, String nome, String localizacao, String responsavel) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.responsavel = responsavel;
    }

    // Exibir informações
    void exibirInfo() {
        System.out.println("Id da loja: " + id);
        System.out.println("Nome da loja: " + nome);
        System.out.println("Localização da loja: " + localizacao);
        System.out.println("Responsável da loja: " + responsavel);
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    // Escrever os métodos: + receberPedido(): void
    //  + listarEntregadoresDisponiveis(): void
}