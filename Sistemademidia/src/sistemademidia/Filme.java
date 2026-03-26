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
public class Filme extends Midia {

    public Filme(String titulo, double duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Exibindo filme: " + getTitulo() + " dirigido por " + getAutor());
    }
}