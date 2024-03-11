package com.Aluno;

public class Item {
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    Item(String descricao, int quantidade, double precoUnitario){
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Exibir informações
    void exibirInfo() {
        System.out.println("Descrição do Item: " + descricao);
        System.out.println("Quantidade do Item: " + quantidade);
        System.out.println("Preço Unitário do Item: " + precoUnitario);
    }

    // Getters
    public String getDescricao() {
        return this.descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    // Setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

}
