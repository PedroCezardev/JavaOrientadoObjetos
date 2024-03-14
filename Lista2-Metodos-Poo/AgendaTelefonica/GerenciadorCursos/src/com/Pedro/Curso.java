package com.Pedro;

public class Curso {
    private String nome;
    private String categoria;
    private String cargaHoraria;
    private int numeroAlunos;
    private int numeroMatriculados;

    // construtor
    Curso(String nome, String categoria, String cargaHoraria, int numeroAlunos, int numeroMatriculados){
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.numeroAlunos = numeroAlunos;
        this.numeroMatriculados = numeroMatriculados;
    }

    void ExibirInfo(){
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Categoria do Curso: " + categoria);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("Numero Total de Alunos: " + numeroAlunos);
        System.out.println("Numero de Alunos Matriculados: " + numeroMatriculados + "\n");
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public String getCargaHoraria() {
        return this.cargaHoraria;
    }

    public int getNumeroAlunos() {
        return this.numeroAlunos;
    }

    public int getNumeroMatriculados() {
        return this.numeroMatriculados;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public void setNumeroMatriculados(int numeroMatriculados) {
        this.numeroMatriculados = numeroMatriculados;
    }
}
