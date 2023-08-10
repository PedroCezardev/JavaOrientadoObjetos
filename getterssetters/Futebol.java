package com.mycompany.getterssetters;


public class Futebol {
    private String nomeTime;
    
    // Método setter -> "set" = Método que permite alterar esse tipo de atríbuto
    public void setTime(String meuTime) { 
        nomeTime = meuTime;
        // O nome que for passado como parâmetro para esse método vai ser atribuído ao nosso Atríbuto "nomeTime".
    }
    
    // Método getter -> "get" = vai retornar o valor em forma de String
    public String getTime() { 
        return nomeTime;
        // O método retorna diretamente o valor que está armazenado no Atríbuto "nomeTime"
    }
    
    // Método "mostraTime" usa o método "getTime" para escrever uma mensagem na tela.
    public void mostraTime() {
        System.out.printf("Seu time do coracao e %s\n", getTime());
    }
}
