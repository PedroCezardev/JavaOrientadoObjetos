package com.Aluno;

public class Entregador {
    private int id;
    private String nome;
    private String veiculo;
    private boolean disponivel;

    Entregador(int id, String nome, String veiculo, boolean disponivel){
        this.id = id;
        this.nome = nome;
        this.veiculo = veiculo;
        this.disponivel = disponivel;
    }

    // Exibir informações
    void exibirInfo() {
        System.out.println("Id do entregador: " + id);
        System.out.println("Nome do entregador: " + nome);
        System.out.println("Veiículo do entregador: " + veiculo);
        System.out.println("Disponíbilidade do entregador: " + disponivel);
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getVeiculo() {
        return this.veiculo;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Escrever métodos:  + entregarPedido(): void
}