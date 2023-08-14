/* Código de exemplo para Classe do tipo StringBuilder:
Existem muitos Métodos que podemos aplicar com essa Classe, segue três deles como exemplo:

    Método length: Retorna o número de caracteres que estão armazenados no objeto;
    Método capacity: Mostra o número de caracteres que podem ser armazenados no objeto sem a necessidade de alocar mais memória;
    Método setLenth: Serve para aumentar ou diminuir o comprimento do Objeto.
        Segue o código:
*/
package com.mycompany.classe.stringbuilder;


public class ClasseStringBuilder {

    public static void main(String[] args) {
        // Como Criar e instanciar um Objeto da Classe StringBuilder
        StringBuilder string1 = new StringBuilder ("Estudando Java");
        
        // Mostrar a string1:
        System.out.printf("string1 = %s%n", string1.toString());
        //capacity:
        System.out.printf("Capacidade = %d%n", string1.capacity());
        // lenght:
        System.out.printf("Comprimento = %d%n", string1.length());
        // setlength:
        string1.setLength(11);
        System.out.printf("Novo Comprimento: %d%n", string1.length());
        System.out.printf("Capacidade = %d%n", string1.capacity());
        System.out.printf("string1 = %s%n", string1.toString());
        // Podemos ver que mesmo com o comprimento de caracteres do Objeto "string1" alterado, a capacidade do Objeto não é alterada.
        
        
    }
}
