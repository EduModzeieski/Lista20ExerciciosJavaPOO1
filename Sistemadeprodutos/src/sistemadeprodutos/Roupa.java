/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeprodutos;

/**
 *
 * @author eduar
 */
public class Roupa extends Produto {

    public Roupa(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    // Desconto de 10%
    @Override
    public double calcularPrecoFinal() {
        double total = getPreco() * getQuantidade();
        return total * 0.9;
    }
}