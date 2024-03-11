package com.Aluno;

public class Dados {
    private String cpf;
    private String rg;
    private String dataNascimento;

    // construtor
    Dados(String cpf, String rg, String dataNascimento){
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // Exibir informações
    void exibirInfo() {
        System.out.println("Cpf: " + cpf);
        System.out.println("Rg: " + rg);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    // Getters
    public String getCpf() {
        return this.cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    // Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // escrever método para atualizar os dados
    public void atualizarDados() {

    }
}