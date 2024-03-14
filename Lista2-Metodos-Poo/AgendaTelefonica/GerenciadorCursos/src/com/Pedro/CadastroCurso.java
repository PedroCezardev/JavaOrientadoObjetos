package com.Pedro;
import java.util.ArrayList;

public class CadastroCurso {
    private ArrayList<Curso> lista;

    CadastroCurso(){
        lista = new ArrayList<Curso>();
    }

    // método para cancelar inscrição
    public boolean CancelarInscricao(String nomeCurso, int alunosCancelados){
        for (Curso curso : lista){
            if(curso.getNome().equals(nomeCurso)){
                int alunosMatriculados = curso.getNumeroAlunos();
                if(alunosMatriculados >= alunosCancelados) {
                    curso.setNumeroAlunos(curso.getNumeroAlunos() - alunosCancelados);
                    curso.setNumeroMatriculados(curso.getNumeroMatriculados() - alunosCancelados);
                    System.out.println(alunosCancelados + " alunos foram cancelados do curso '" + nomeCurso + "'. \n");
                    return true; // alunos cancelados
                } else {
                    System.out.println("Erro: Não há alunos suficientes inscritos no curso '" + nomeCurso + "' para cancelar.\n");
                    return false; // Não há alunos suficientes para cancelar a inscrição
                }
            }
        }
        System.out.println("Curso '" + nomeCurso + "' não encontrado.\n");
        return false; // curso não encontrado
    }

    // método para increver o aluno
    public boolean inscreverAluno(String nomeCurso, int aluno){
        for (Curso curso : lista){
            if(curso.getNome().equals(nomeCurso)){
                int capacidadeRestante = curso.getNumeroAlunos() - curso.getNumeroMatriculados();
                if(capacidadeRestante >= aluno) {
                    curso.setNumeroMatriculados(curso.getNumeroMatriculados() + aluno);
                    System.out.println(aluno + " alunos matriculados no curso '" + nomeCurso + "' com sucesso! \n");
                    return true; // aluno matriculado
                } else {
                    System.out.println("Capacidade da Turma excedida, Matricule um numero menor de alunos. \n");
                    return false; // capacidade excedida
                }
            }
        }
        return false; // aluno não encontrado
    }

    // método para atualizar carga horaria
    public void atualizarCargaHoraria(String nomeCurso, String novaCargaHoraria){
        for (Curso curso : lista){
            curso.getNome().equals(nomeCurso);
            curso.setCargaHoraria(novaCargaHoraria);
            System.out.println("Carga Horaria do curso '" + nomeCurso + "' atualizada para: " + novaCargaHoraria);
            return;
        }
    }

    // método para adicionar curso
    public void adicionarCurso(Curso curso){
        lista.add(curso);
    }

    // método para remover curso
    public void removerCurso(String nomeCurso){
        for(Curso curso : lista){
            if (curso.getNome().equals(nomeCurso)){
                lista.remove(curso);
                System.out.println("Curso: '" + nomeCurso + "' removido. \n");
                return;
            }
        }
    }

    // método para exibir curso
    public void exibirCurso(){
        for (Curso curso : lista){
            curso.ExibirInfo();
        }
    }
}
