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
public class Pizza extends ItemCardapio {

    public Pizza(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Assando a pizza: " + getNome());
    }

    @Override
    public double calcularPreco() {
        // Exemplo: taxa de forno
        return getPreco() + 5.0;
    }
}