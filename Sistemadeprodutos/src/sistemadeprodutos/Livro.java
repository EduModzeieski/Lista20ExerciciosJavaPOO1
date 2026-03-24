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
public class Livro extends Produto {

    public Livro(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    // Sem imposto (exemplo)
    @Override
    public double calcularPrecoFinal() {
        return getPreco() * getQuantidade();
    }
}