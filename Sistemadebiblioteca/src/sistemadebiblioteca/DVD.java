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
public class DVD extends ItemBiblioteca {

    public DVD(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void emprestar() {
        if (isDisponivel()) {
            setDisponivel(false);
            System.out.println("DVD emprestado por 3 dias: " + getTitulo());
        } else {
            System.out.println("DVD indisponível.");
        }
    }
}