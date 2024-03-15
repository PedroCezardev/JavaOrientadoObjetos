package com.Pedro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CadastrarVoo cadastro = new CadastrarVoo();

        int opcoes;

        do {

            System.out.println("Menu de opcoes: ");
            System.out.println("1. Adicionar Reserva.");
            System.out.println("2. Exibir Reserva.");
            System.out.println("3. Alterar classe da Reserva.");
            System.out.println("4. Confirmar Reserva.");
            System.out.println("5. Cancelar Reserva.");
            System.out.println("6. Remover Reserva.");
            System.out.println("0. Sair do programa.");

            opcoes = input.nextInt();
            input.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Adicione o nome da Reserva: ");
                    String nomeReserva = input.nextLine();
                    System.out.println("Numero do Voo: ");
                    String numeroVoo = input.nextLine();
                    System.out.println("Nome do Passageiro: ");
                    String nomePassageiro = input.nextLine();
                    System.out.println("Classe do Voo: ");
                    String classeVoo = input.nextLine();
                    boolean confirmar = false;

                    ReservaVoo novaReserva = new ReservaVoo(nomeReserva, numeroVoo, nomePassageiro, classeVoo, confirmar);
                    cadastro.adicionarReserva(novaReserva);
                    break;

                case 2:
                    cadastro.exibirReserva();
                    break;

                case 3:
                    System.out.println("Nome da Reserva que dejesa Alterar a Classe: ");
                    String nomeReservaAtualizar = input.nextLine();
                    System.out.println("Nova Nome da Classe: ");
                    String novaClasseAtualizar = input.nextLine();
                    cadastro.alterarClasse(nomeReservaAtualizar, novaClasseAtualizar);
                    break;

                case 4:
                    System.out.println("Nome da Reserva que deseja Confirmar: ");
                    String nomeReservaConfirmar = input.nextLine();
                    System.out.println("Confirme digitando 'sim'");
                    String Confirmar = input.nextLine();
                    cadastro.confirmarReserva(nomeReservaConfirmar, Confirmar);
                    break;

                case 5:
                    System.out.println("Nome da Reserva que deseja Cancelar: ");
                    String nomeReservaCancelar = input.nextLine();
                    System.out.println("Confirme o cancelamento digitando 'nao'");
                    String recusar = input.nextLine();
                    cadastro.cancelarReserva(nomeReservaCancelar, recusar);
                    break;

                case 6:
                    System.out.println("Nome da Reserva que deseja Remover: ");
                    String nomeReservaRemover = input.nextLine();
                    cadastro.removerReserva(nomeReservaRemover);
                    break;

                case 0:
                    System.out.println("Codigo Encerrado. ;)");
                    break;

                default:
                    System.out.println("Opcao Invalida. Por favor, escolha uma das opcoes acima.");

            }

        } while (opcoes != 0);

    }
}