package com.Pedro;

public class ReservaVoo {
    private String nomeReserva;
    private String numeroVoo;
    private String nomePassageiro;
    private String classe;
    private boolean confirmar;

    // construtor
    ReservaVoo(String nomeReserva, String numeroVoo, String nomePassageiro, String classe, boolean confirmar){
        this.nomeReserva = nomeReserva;
        this.numeroVoo = numeroVoo;
        this.nomePassageiro = nomePassageiro;
        this.classe = classe;
        this.confirmar = confirmar;
    }

    void exibirInfo(){
        System.out.println("Nome da Reserva: " + nomeReserva);
        System.out.println("Confirmada: " + confirmar);
        System.out.println("Numero do Voo: " + numeroVoo);
        System.out.println("Nome Passageiro: " + nomePassageiro);
        System.out.println("Classe do Voo: " + classe + "\n");;
    }

    // getters
    public String getNomeReserva() {
        return this.nomeReserva;
    }

    public String getNumeroVoo() {
        return this.numeroVoo;
    }

    public String getNomePassageiro() {
        return this.nomePassageiro;
    }

    public String getClasse() {
        return this.classe;
    }

    public boolean isConfirmar() {
        return this.confirmar;
    }

    // setters
    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setConfirmar(boolean confirmar) {
        this.confirmar = confirmar;
    }
}
