package com.Aluno;

public class Cupons {
    private String codigo;
    private double desconto;

    // Exibir informações
    void exibirInfo() {
        System.out.println("Código do Cupon: " + codigo);
        System.out.println("Valor de Desconto: " + desconto);
    }

    // Getters
    public String getCodigo() {
        return this.codigo;
    }

    public double getDesconto() {
        return this.desconto;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    // Escrever métodos:  + gerarCupom(): void
    //                    + aplicarDesconto(): void
}