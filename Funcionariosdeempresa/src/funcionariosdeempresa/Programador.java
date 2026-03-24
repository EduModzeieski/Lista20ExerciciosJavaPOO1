/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionariosdeempresa;

/**
 *
 * @author eduar
 */
public class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, salario, "Programador");
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está programando.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.25;
    }
}