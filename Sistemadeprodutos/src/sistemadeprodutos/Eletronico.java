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
public class Eletronico extends Produto {

    public Eletronico(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    // Aplica 20% de imposto
    @Override
    public double calcularPrecoFinal() {
        double total = getPreco() * getQuantidade();
        return total * 1.2;
    }
}