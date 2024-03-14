package com.Pedro;
public class SessaoCinema {

    String Filme;
    String horario;
    int capacidadeTotal;
    int ingressoVendidos;

    public SessaoCinema(String Filme, String horario, int capacidadeTotal, int IngressoVendidos){
        this.Filme = Filme;
        this.horario = horario;
        this.ingressoVendidos = IngressoVendidos;
        this.capacidadeTotal = capacidadeTotal;
    }

    void exibirInfo(){
        System.out.println("Nome: " + Filme);
        System.out.println("Horario: " + horario);
        System.out.println("Capacidade total: " + capacidadeTotal);
        System.out.println("Total de Ingressos: " + ingressoVendidos + "\n");
    }

    // declarações de métodos get para retornar os valores para o main
    public String getFilme() {
        return this.Filme;
    }

    public String getHorario() {
        return this.horario;
    }

    public int getIngressoVendidos() {
        return this.ingressoVendidos;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    // declarações de métodos set para determinar e trocar os valores
    public void setFilme(String filme) {
        this.Filme = filme;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setIngressoVendidos(int ingressoVendidos) {
        this.ingressoVendidos = ingressoVendidos;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
}