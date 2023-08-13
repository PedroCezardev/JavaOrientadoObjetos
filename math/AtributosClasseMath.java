// Algoritmo usado para exemplificar o uso da Classe Math em Java.

package com.mycompany.atributos.classe.math;

import java.util.Scanner;

public class AtributosClasseMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um nùmero para realizar os seguintes cálculos:");
        double z = scanner.nextDouble();
        
        int x = 3;
        int y = 4;
                
        System.out.println("Pi vale: " + Math.PI);
        System.out.println("O valor absoluto de x é: " + Math.abs(x));
        System.out.println("O maior valor entre x e y é: " + Math.max(x,y));
        System.out.println("O menor valor entre x e y é: " + Math.min(x,y));
        System.out.println("A raiz quadrada de z é: " + Math.sqrt(z));
        System.out.println("z arrendondado para cima é: " + Math.ceil(z));
        System.out.println("Número aleatório gerado: " + Math.random());
        System.out.println("A hipotenusa de x e y é: " + Math.hypot(x,y));
        System.out.println("O seno de 90° é: " + Math.sin(Math.PI/2));
        
    }
}
