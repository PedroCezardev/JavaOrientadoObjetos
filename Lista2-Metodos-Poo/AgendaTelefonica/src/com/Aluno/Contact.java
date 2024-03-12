package com.Aluno;

public class Contact {
    private String nome;
    private int telefone;
    private String email;

    Contact(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibirInfo(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email + "\n");
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
