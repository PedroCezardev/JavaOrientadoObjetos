package com.mycompany.metodos.parametros;


public class MandaMensagem {
    
    public void enviaMensagem() {
        System.out.print("\nBem-vindo ao estudo dialetico de Pedro! ");
    }
    public void mandaBoasVindas(String nome, int idade) {
        System.out.printf("Ola, %s, você tem %d anos de idade!", nome, idade);
    }
}
