package com.Aluno;

import java.util.ArrayList;
import java.util.List;

public class CadastroContact {
    private List<Contact> lista;
    private ArrayList<Contact> Lista;

    // construtor
    CadastroContact(){
        Lista = new ArrayList<Contact>();
    }

    public void inserirTelefone(Contact contact){
        Lista.add(contact);
    }

    public void removeTelefone(Contact contact){
        Lista.remove(contact);
    }

    public void listarTelefone(){
        for (int i = 0; i < Lista.size(); i++){
            Lista.get(i).exibirInfo();
        }
    }

    public void alterarTelefone(String nome, int novoContato) {
        for (Contact contato : Lista) {
            if (contato.getNome().equals(nome)) {
                contato.setTelefone(novoContato);
                return; // Se encontrarmos o contato, não há necessidade de continuar procurando
            }
        }
        // Se chegarmos aqui, significa que o contato com o nome especificado não foi encontrado
        System.out.println("Contato não encontrado.");
    }

    public void alterarEmail(String nome, String novoEmail) {
        for (Contact contato : Lista) {
            if (contato.getNome().equals(nome)) {
                contato.setEmail(novoEmail);
                return; // Se encontrarmos o contato, não há necessidade de continuar procurando
            }
        }
        // Se chegarmos aqui, significa que o contato com o nome especificado não foi encontrado
        System.out.println("Contato não encontrado.");
    }

    public boolean validarEmail() {
        for (Contact contato : Lista) {
            String email = contato.getEmail();
            if (!email.contains("@")) {
                return false;
            }
        }
        return true;
    }

}
