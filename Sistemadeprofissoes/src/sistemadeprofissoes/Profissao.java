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
public class Profissao {
    private String nome;
    private String area;
    private double salario;

    public Profissao(String nome, String area, double salario) {
        this.nome = nome;
        this.area = area;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void executarTrabalho() {
        System.out.println(nome + " está realizando suas atividades profissionais.");
    }
}