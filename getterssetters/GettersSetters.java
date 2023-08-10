package com.mycompany.getterssetters;

import java.util.Scanner;

public class GettersSetters {

    public static void main(String[] args) {
        String time;
        
        Futebol torcida = new Futebol();
        // Criando objeto
        Scanner texto = new Scanner(System.in);
        // Ler o que o usuário vai digitar
        
        System.out.println("Para qual time você torce? ");
        time = texto.nextLine();
        
        torcida.setTime(time);
        torcida.mostraTime();
    }
}
