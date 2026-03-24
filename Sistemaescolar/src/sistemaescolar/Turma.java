/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolar;

/**
 *
 * @author eduar
 */
public class Turma {
    private String nomeTurma;
    private Aluno aluno;
    private Professor professor;

    public Turma(String nomeTurma, Aluno aluno, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.aluno = aluno;
        this.professor = professor;
    }

    public void mostrarDados() {
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Professor: " + professor.getNome());
    }

    // Getters e Setters
    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}