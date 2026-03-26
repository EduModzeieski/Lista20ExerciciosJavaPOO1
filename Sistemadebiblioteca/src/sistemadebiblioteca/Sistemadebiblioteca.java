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
public class Sistemadebiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Livro livro = new Livro("Java Básico", "L001");
        Revista revista = new Revista("Tech News", "R001");
        Jornal jornal = new Jornal("Jornal Diário", "J001");
        DVD dvd = new DVD("Filme Ação", "D001");

        livro.emprestar();
        livro.devolver();

        System.out.println();

        revista.emprestar();

        System.out.println();

        jornal.emprestar();

        System.out.println();

        dvd.emprestar();
        dvd.devolver();
    }
}