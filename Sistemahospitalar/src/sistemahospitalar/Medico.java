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
public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void realizarAtendimento() {
        System.out.println(getNome() + " está atendendo um paciente.");
    }
}