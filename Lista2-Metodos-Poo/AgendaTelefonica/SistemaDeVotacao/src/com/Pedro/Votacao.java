package com.Pedro;

public class Votacao {
    private String candidato;
    private int votosRecebidos;

    // construtor
    Votacao(String candidato, int votosRecebidos){
        this.candidato = candidato;
        this.votosRecebidos = votosRecebidos;
    }

    void exibirInfo(){
        System.out.println("Nome do Candidato: " + candidato);
        System.out.println("Quantidade de votos: " + votosRecebidos + "\n");
    }

    // getters
    public String getCandidato() {
        return this.candidato;
    }

    public int getVotosRecebidos() {
        return this.votosRecebidos;
    }

    // Setters
    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public void setVotosRecebidos(int votosRecebidos) {
        this.votosRecebidos = votosRecebidos;
    }
}
