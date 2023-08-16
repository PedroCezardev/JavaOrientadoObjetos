// Classe Main principal do programa, onde executaremos todo o código.

package com.mycompany.tipoenum;

import java.util.Scanner;

public class TipoEnum {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        String planeta;
        
        System.out.println("Para qual planeta quer viajar?");
        planeta = entrada.next().toUpperCase();
        entrada.close();
        // 'toUpperCase ()' serve para convertermos o imput de dados para caixa alta. 
        
        ClasseTesteEnum pl = new ClasseTesteEnum(planeta);
        pl.viajarPlaneta();
        
        // Quando criamos uma Enumeração, só podemos usar os valores defindos na Enúmeração.
        // Isso é tipo de proteção que podemos colocar na nossa Enumeração que impede que um valor inválido seja usado dentro daquela variável.
    }
}
