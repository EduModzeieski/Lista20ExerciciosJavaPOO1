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
public class Sistemademidia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Musica musica = new Musica("Imagine", 3.5, "John Lennon");
        Filme filme = new Filme("Inception", 148, "Christopher Nolan");
        Podcast podcast = new Podcast("Flow Podcast", 120, "Igor 3K");
        Audiolivro audio = new Audiolivro("Dom Casmurro", 600, "Machado de Assis");

        musica.reproduzir();
        filme.reproduzir();
        podcast.reproduzir();
        audio.reproduzir();
    }
}