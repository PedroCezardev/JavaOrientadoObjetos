package com.Aluno;

public class Tarefa {
    private String nome;
    private String descricao;
    private boolean concluida;
    private String prioridade;

    Tarefa(String nome, String descricao, boolean concluida, String prioridade){
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = concluida;
        this.prioridade = prioridade;
    }

    void exibirInfo(){
        System.out.println("Nome da Tarefa: " + nome);
        System.out.println("Descricao da Tarefa: " + descricao);
        System.out.println("Conclusao da Tarefa: " + concluida);
        System.out.println("Prioridade da Tarefa: " + prioridade + "\n");
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean getConcluida() {
        return this.concluida;
    }

    public String getPrioridade() {
        return this.prioridade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
