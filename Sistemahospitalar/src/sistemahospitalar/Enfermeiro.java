/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahospitalar;

/**
 *
 * @author eduar
 */
public class Enfermeiro extends Pessoa {
    private String setor;

    public Enfermeiro(String nome, int idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void realizarAtendimento() {
        System.out.println(getNome() + " está auxiliando no atendimento.");
    }
}