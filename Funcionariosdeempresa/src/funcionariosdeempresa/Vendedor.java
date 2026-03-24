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
public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario) {
        super(nome, salario, "Vendedor");
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está vendendo produtos.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.2;
    }
}