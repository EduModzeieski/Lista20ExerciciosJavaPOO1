/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeprofissoes;

/**
 *
 * @author eduar
 */
public class Engenheiro extends Profissao {

    public Engenheiro(String nome, String area, double salario) {
        super(nome, area, salario);
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está desenvolvendo um projeto.");
    }
}