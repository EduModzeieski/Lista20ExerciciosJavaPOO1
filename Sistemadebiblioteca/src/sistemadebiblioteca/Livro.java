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
public class Livro extends ItemBiblioteca {

    public Livro(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("Livro emprestado por 14 dias: " + getTitulo());
        } else {
            System.out.println("Livro indisponível.");
        }
    }
}