/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderestaurante;

/**
 *
 * @author eduar
 */
public class Bebida extends ItemCardapio {

    public Bebida(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Servindo a bebida: " + getNome());
    }

    @Override
    public double calcularPreco() {
        // Sem taxa extra
        return getPreco();
    }
}