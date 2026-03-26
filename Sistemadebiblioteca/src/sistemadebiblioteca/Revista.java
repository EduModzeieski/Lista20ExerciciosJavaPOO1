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
public class Revista extends ItemBiblioteca {

    public Revista(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Revista emprestada por 7 dias: " + getTitulo());
        } else {
            System.out.println("Revista indisponível.");
        }
    }
}