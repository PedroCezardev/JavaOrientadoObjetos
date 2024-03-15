package com.Pedro;
import java.util.ArrayList;

public class CadastrarVoo {
    private ArrayList<ReservaVoo> lista;

    CadastrarVoo(){
        lista = new ArrayList<ReservaVoo>();
    }

    // método para alterar a classe
    public void alterarClasse(String nomeReserva, String novaClasse){
        for (ReservaVoo reserva : lista){
            if (reserva.getNomeReserva().equals(nomeReserva)){
                reserva.setClasse(novaClasse);
                System.out.println("Sua classe foi atualizada para '" + novaClasse + "'\n");
            }
        }
        System.out.println("Reserva nao encontra. ");
    }

    public void cancelarReserva(String nomeReserva, String recursar){
        for (ReservaVoo reserva : lista){
            if (reserva.getNomeReserva().equals(nomeReserva)){
                if (recursar.equalsIgnoreCase("nao")){
                    // equalsIngoneCase para garantir que a comparação seja feita entre letras maiúsculas ou minúsculas.
                    reserva.setConfirmar(false);
                    System.out.println("Sua Reserva '" + nomeReserva + "' esta cancelada \n");
                    return;
                }
            }
        }
        System.out.println("Sua reserva nao foi encontrada. ");
    }

    public void confirmarReserva(String nomeReserva, String confirmar){
        for (ReservaVoo reserva : lista){
            if (reserva.getNomeReserva().equals(nomeReserva)){
                if (confirmar.equalsIgnoreCase("sim")){
                    reserva.setConfirmar(true);
                    System.out.println("Sua Reserva '" + nomeReserva + "' esta confirmada! ;)\n");
                    return;
                }
            }
        }
        System.out.println("Sua reserva nao foi encontrada. ");
    }

    public void removerReserva(String nomeReserva){
        for (int i = 0; i < lista.size(); i++){
            ReservaVoo reserva = lista.get(i);
            if (reserva.getNomeReserva().equals(nomeReserva)){
                lista.remove(i);
                System.out.println("Reserva '" + nomeReserva + "' removida. \n");
                return;
            }
        }
        System.out.println("Reserva '" + nomeReserva + "' nao encontrada. \n");
    }

    public void adicionarReserva(ReservaVoo reserva){
            lista.add(reserva);
    }

    public void exibirReserva(){
        for (ReservaVoo reserva : lista){
            reserva.exibirInfo();
        }
    }
}
