package com.Aluno;

public class Pagamento {
    private String metodo;
    private double valor;

    Pagamento(String metodo, double valor){
        this.metodo = metodo;
        this.valor = valor;
    }

    // Exibir informações
    void exibirInfo() {
        System.out.println("Método de pagamento: " + metodo);
        System.out.println("Valor da compra: " + valor);
    }

    // Getters
    public String getMetodo() {
        return this.metodo;
    }

    public double getValor() {
        return this.valor;
    }

    // Setters
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Escrever os métodos:  processarPagamento(): void

}
