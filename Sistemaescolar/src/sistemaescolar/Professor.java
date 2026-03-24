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
public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está dando aula de " + disciplina);
    }

    @Override
    public void apresentar() {
        System.out.println(getNome() + " é professor de " + disciplina);
    }

    // Getters e Setters
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}