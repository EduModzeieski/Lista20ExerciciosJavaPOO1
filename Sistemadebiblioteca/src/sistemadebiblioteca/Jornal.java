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
public class Jornal extends ItemBiblioteca {

    public Jornal(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void emprestar() {
        System.out.println("Jornais não podem ser emprestados: " + getTitulo());
    }
}