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
public class Paciente extends Pessoa {
    private String doenca;

    public Paciente(String nome, int idade, String doenca) {
        super(nome, idade);
        this.doenca = doenca;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Doença: " + doenca);
    }
}