/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemademidia;

/**
 *
 * @author eduar
 */
public class Midia {
    private String titulo;
    private double duracao;
    private String autor;

    public Midia(String titulo, double duracao, String autor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.autor = autor;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo mídia...");
    }
}