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
public class Podcast extends Midia {

    public Podcast(String titulo, double duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo podcast: " + getTitulo() + " apresentado por " + getAutor());
    }
}