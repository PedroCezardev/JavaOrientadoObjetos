package com.Pedro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CadastroCurso cadastro = new CadastroCurso();

        int opcoes;

        do {

            System.out.println("Menu de opcoes: ");
            System.out.println("1. Adicionar Curso.");
            System.out.println("2. Exibir Cursos.");
            System.out.println("3. Atualizar Carga Horaria.");
            System.out.println("4. Matricular Alunos.");
            System.out.println("5. Cancelar Matricula.");
            System.out.println("6. Remover Curso.");
            System.out.println("0. Sair do programa.");

            opcoes = input.nextInt();
            input.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Nome do Curso: ");
                    String nome = input.nextLine();
                    System.out.println("Categoria do Curso: ");
                    String categoria = input.nextLine();
                    System.out.println("Carga Horaria: ");
                    String cargaHoraria = input.nextLine();
                    System.out.println("Numero Total de Alunos: ");
                    int numeroAlunos = input.nextInt();
                    System.out.println("Alunos Matriculados:");
                    int numeroMatriculados = input.nextInt();


                    Curso novoCurso = new Curso(nome, categoria, cargaHoraria, numeroAlunos, numeroMatriculados);
                    cadastro.adicionarCurso(novoCurso);

                case 2:
                    cadastro.exibirCurso();
                    break;

                case 3:
                    System.out.println("Nome do Curso: ");
                    String nomeCursoAtualizar = input.nextLine();
                    System.out.println("Nova Carga Horario: ");
                    String novaCargaHoraria = input.nextLine();
                    cadastro.atualizarCargaHoraria(nomeCursoAtualizar, novaCargaHoraria);
                    break;

                case 4:
                    System.out.println("Nome do Curso: ");
                    String nomeCurso = input.nextLine();
                    System.out.println("Numero de Alunos: ");
                    int aluno = input.nextInt();
                    cadastro.inscreverAluno(nomeCurso, aluno);
                    break;

                case 5:
                    System.out.println("Nome do Curso: ");
                    String nomeCursoCancelar = input.nextLine();
                    System.out.println("Numero de alunos para cancelar incricao: ");
                    int numeroAlunosCancelar = input.nextInt();
                    cadastro.CancelarInscricao(nomeCursoCancelar, numeroAlunosCancelar);
                    break;


                case 6:
                    System.out.println("Nome do Filme: ");
                    String nomeCursoRemover = input.nextLine();
                    cadastro.removerCurso(nomeCursoRemover);
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