// Algoritmo de exemplo para Declarar e Atribuir de Valores nos Arrays em java

package com.mycompany.declaracao.atribuicao.arrays;

public class DeclaracaoAtribuicaoArrays {

    public static void main(String[] args) {
        double[] valores = new double[6];
        
        // Preencher o array:
        valores[0] = 6.0;
        valores[1] = 7.5;
        valores[2] = 8.2;
        valores[3] = 2.3;
        valores[4] = 1.5;
        valores[5] = 4.9; 
        
        // Acessando seu quinto elemento (número de posição 4)
        System.out.println("Elemento 5 do array: " + valores[4]);
        
        // Alterando os valores de duas posições no array:
        valores[0] = 2.3;
        valores[4] = 7.1;
        
        // Acessando os elementos alterados: 
        System.out.println("Posição 0 alterada para: " + valores[0]);
        System.out.println("Posição 4 alterada para: " + valores[4]);
        
        // Mostrar todos os elementos do array: 
        for (double elemento: valores) {
            System.out.println(elemento);
             // A variável declarada tem que ser do mesmo tipo dos dados declarados no Array.
        }
        
        // Somar os elementos
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
            // "length" significa o comprimento do array, o número de posições qie o Array tem
            // Se quiser saber o numero de posições do Array é só consutar a propriedade Length
        }
        System.out.println("O total é: " + total);
    } 
}
