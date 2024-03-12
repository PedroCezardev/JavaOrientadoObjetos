package com.Aluno;

public class Main {

    public static void main(String[] args) {
        CadastroContact cadastro = new CadastroContact();
        // Criando e inserindo os contatos diretamente no cadastro
        cadastro.inserirTelefone(new Contact("Pedro", 855666567, "pedro@unicap.br"));
        cadastro.inserirTelefone(new Contact("Veigh", 888877554, "veigh@unicap.com"));
        cadastro.inserirTelefone(new Contact("Jhonb", 982326439, "jhonb@unicap.loko"));

        // Validando os emails dos contatos no cadastro
        boolean emailValido = cadastro.validarEmail();
        System.out.println("Email valido: " + emailValido + "\n");

        // Mostrando informações de um contato específico
        cadastro.listarTelefone();

        // alterar email
        cadastro.alterarEmail("Pedro", "pedroLOKO@gmail.br");

        System.out.println("Email alterado: ");
        cadastro.listarTelefone();

        // alterar telefone
        cadastro.alterarTelefone("Veigh", 79873449);

        System.out.println("Numero alterado: ");
        cadastro.listarTelefone();

    }
}
