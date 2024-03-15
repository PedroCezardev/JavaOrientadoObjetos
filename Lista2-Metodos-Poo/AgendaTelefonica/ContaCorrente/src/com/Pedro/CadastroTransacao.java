package com.Pedro;
import java.util.ArrayList;

public class CadastroTransacao {
    private ArrayList<ContaCorrente> lista;

    CadastroTransacao(){
        lista = new ArrayList<ContaCorrente>();
    }

    public void depositar(String nomeTitular, double valor){
        for (ContaCorrente contaCorrente : lista) {
            if (contaCorrente.getNomeTitular().equals(nomeTitular)) {
                double novoSaldo = contaCorrente.getSaldo() + valor;
                contaCorrente.setSaldo(novoSaldo);
                System.out.println("Deposito de " + valor + " realizado na conta de " + nomeTitular);
                return;
            }
        }
        System.out.println("Conta de " + nomeTitular + " nao encontrada.");
    }

    public void sacarConta(String nomeTitular, double valor){
        for (ContaCorrente contaCorrente : lista) {
            if (contaCorrente.getNomeTitular().equals(nomeTitular)) {
                double saldoAtual = contaCorrente.getSaldo();
                if (valor <= saldoAtual) {
                    double novoSaldo = saldoAtual - valor;
                    contaCorrente.setSaldo(novoSaldo);
                    System.out.println("Saque de " + valor + " realizado na conta de " + nomeTitular);
                } else {
                    System.out.println("Saldo insuficiente na conta de " + nomeTitular);
                }
                return;
            }
        }
        System.out.println("Conta de " + nomeTitular + " nao encontrada.");
    }

    public void transferir(String nomeTitularOrigem, String nomeTitularDestino, double valor) {
        boolean contaOrigemEncontrada = false;
        boolean contaDestinoEncontrada = false;

        for (ContaCorrente conta : lista) {
            if (conta.getNomeTitular().equals(nomeTitularOrigem)) {
                contaOrigemEncontrada = true;
                if (conta.getSaldo() >= valor) {
                    for (ContaCorrente outraConta : lista) {
                        if (outraConta.getNomeTitular().equals(nomeTitularDestino)) {
                            contaDestinoEncontrada = true;
                            double novoSaldoOrigem = conta.getSaldo() - valor;
                            double novoSaldoDestino = outraConta.getSaldo() + valor;
                            conta.setSaldo(novoSaldoOrigem);
                            outraConta.setSaldo(novoSaldoDestino);
                            System.out.println("Transferencia de " + valor + " realizada da conta de " + nomeTitularOrigem + " para a conta de " + nomeTitularDestino);
                            break;
                        }
                    }
                    if (!contaDestinoEncontrada) {
                        System.out.println("Conta de destino nao encontrada.");
                    }
                } else {
                    System.out.println("Saldo insuficiente na conta de " + nomeTitularOrigem);
                }
                break;
            }
        }

    }

    public void removerConta(String nomeTitular){
        for (int i = 0; i < lista.size(); i ++){
            ContaCorrente conta = lista.get(i);
            if (conta.getNomeTitular().equals(nomeTitular)){
                lista.remove(i);
                System.out.println("Conta de'" + nomeTitular + "' removida.");
                return;
            }
        }
        System.out.println("Conta de '" + nomeTitular + "' não encontrada.");
    }

    public void exibirConta(){
        for (ContaCorrente conta : lista){
            conta.exibirInfo();
        }
    }

    public void adicionarConta(ContaCorrente conta){
            lista.add(conta);
    }

}
