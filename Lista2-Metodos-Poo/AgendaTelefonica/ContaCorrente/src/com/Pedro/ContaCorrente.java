package com.Pedro;

public class ContaCorrente {
    private String nomeTitular;
    private String numeroConta;
    private double saldo;


    ContaCorrente( String nomeTitular, String numeroConta, double saldo){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    void exibirInfo(){
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo + "\n");
    }

    // Getters
    public String getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    // Setters
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
