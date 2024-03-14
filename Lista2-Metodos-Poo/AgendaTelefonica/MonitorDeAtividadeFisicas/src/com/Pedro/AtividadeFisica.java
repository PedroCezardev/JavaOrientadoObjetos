package com.Pedro;

public class AtividadeFisica {
    private String tipoDeAtividade;
    private String duracao;
    private int caloriasQueimadas;

    AtividadeFisica(String tipoDeAtividade, String duracao, int caloriasQueimadas){
        this.tipoDeAtividade = tipoDeAtividade;
        this.duracao = duracao;
        this.caloriasQueimadas = caloriasQueimadas;
    }

    void exibirInfo(){
        System.out.println("Tipo de Atividade: " + tipoDeAtividade);
        System.out.println("Tempo de duracao: " + duracao);
        System.out.println("Calorias queimadas: " + caloriasQueimadas + "\n");
    }

    // getters
    public String getTipoDeAtividade() {
        return this.tipoDeAtividade;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public int getCaloriasQueimadas() {
        return this.caloriasQueimadas;
    }

    // Setters
    public void setTipoDeAtividade(String tipoDeAtividade) {
        this.tipoDeAtividade = tipoDeAtividade;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setCaloriasQueimadas(int caloriasQueimadas) {
        this.caloriasQueimadas = caloriasQueimadas;
    }
}
