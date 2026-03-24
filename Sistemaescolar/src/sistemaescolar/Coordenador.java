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
public class Coordenador extends Pessoa {
    private String setor;

    public Coordenador(String nome, int idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está coordenando o setor " + setor);
    }

    @Override
    public void apresentar() {
        System.out.println(getNome() + " é coordenador do setor " + setor);
    }

    // Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}