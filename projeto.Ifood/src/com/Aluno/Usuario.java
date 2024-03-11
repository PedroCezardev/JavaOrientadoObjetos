package com.Aluno;

public class Usuario {
    private String id;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;

    // construtor
    Usuario(String id, String nome, String endereco, int telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    void exibirInfo() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }

    // Getters
    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Escrever Métodos:
    // efetuarPagamento(): void
    // acessarDados(): void
    // aplicarCupons(): void
    // fazerPedido(): void

}
