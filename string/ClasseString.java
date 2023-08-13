

package com.mycompany.classe.string;


public class ClasseString {

    public static void main(String[] args) {
        char[] arrayCarac = {'E','s','t','u','d','a','n','d','o',' ','J','a','v','a'};
        String txt = new String("Pedro Dev");
        String txt4 = "Pedro Dev";
        
        // Três formas de Construtores da Classe String
        String tex1 = new String();
        String tex2 = new String(txt);
        String tex3 = new String(arrayCarac);
        
        // Mostrar os dados armazenados nas Strings:
        System.out.printf("Tex1 = %s%ntex2 = %s%ntex3 = %s%n", tex1, tex2, tex3);
        
        // Comprimento da String:
        System.out.printf("%nComprimento da String txt: %d caracteres", txt.length());
        // Método "length" retorna o comprimento de uma String, ou seja, retorna quantos caracteres formam essa String.
        
        // Criar um array de caracteres a partir de uma String:
        char[] arrayCar =  new char[5]; 
        
        txt4.getChars(0,5, arrayCar,0);
        System.out.printf("%nO Array de caracteres criado é: ");
        for (char caractere : arrayCar) {
            System.out.print(caractere);
        // "getChars" - ObterCaractere - permite criar um Array de caracteres a partir de uma String, pega uma String completa e vai pegar os caracteres individuais para formar um Array.
        // "0" - número da posição inicial, "5" - número da posição final, "arrayCar" - Nome do array que receberá os caracteres, "0" -  Número de destino a partir de onde os caracteres serão inseridos.
        }
        
        // Mostrar um caracteres com charAt:
        System.out.printf("%nCaractere de índice 0 em tex3: %c%n ", tex3.charAt(0));
        // Podemos pegar caracteres índividuais usando o Método "charAt" - caractere "em" ou "na posição".
        
        // Mostrar os caracteres de tex3 em reverso (pegar frase e inverte-la) com charAt:]
        System.out.printf("%nString tex3 de trás pra frente: ");
        for (int cont = tex3.length() - 1; cont >= 0; cont--) {
            System.out.printf("%c", tex3.charAt(cont));
        }
        
    }
}
