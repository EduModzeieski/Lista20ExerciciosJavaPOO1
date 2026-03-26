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
public class Hamburguer extends ItemCardapio {

    public Hamburguer(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Grelhando o hambúrguer: " + getNome());
    }

    @Override
    public double calcularPreco() {
        // Exemplo: taxa de preparo
        return getPreco() + 3.0;
    }
}