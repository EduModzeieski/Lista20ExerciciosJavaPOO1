/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadebiblioteca;

/**
 *
 * @author eduar
 */
public class ItemBiblioteca {
    private String titulo;
    private String codigo;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = true;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println(titulo + " foi emprestado.");
        } else {
            System.out.println(titulo + " não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println(titulo + " foi devolvido.");
    }
}