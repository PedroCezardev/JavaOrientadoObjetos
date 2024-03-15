package com.Pedro;

public class Transacao {
    private String descricao;
    private double valor;
    private String tipo;
    private double saldoAtual;

    Transacao(String descricao, double valor, String tipo, double saldoAtual){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.saldoAtual = saldoAtual;
    }

    void exibirInfo(){
        System.out.println("Descricao da transacao: " + descricao);
        System.out.println("Valor da transacao: " + valor);
        System.out.println("Tipo da transacao: " + tipo + "\n");
    }

    // Getters
    public String getDescricao() {
        return this.descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getSaldoAtual() {
        return this.saldoAtual;
    }

    // Setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
