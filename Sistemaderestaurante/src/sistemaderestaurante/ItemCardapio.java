/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderestaurante;

/**
 *
 * @author eduar
 */
public class ItemCardapio {
    private String nome;
    private double preco;
    private String descricao;

    public ItemCardapio(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void preparar() {
        System.out.println("Preparando item do cardápio...");
    }

    public double calcularPreco() {
        return preco;
    }
}