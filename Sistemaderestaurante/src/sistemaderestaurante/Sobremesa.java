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
public class Sobremesa extends ItemCardapio {

    public Sobremesa(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Montando a sobremesa: " + getNome());
    }

    @Override
    public double calcularPreco() {
        // Exemplo: taxa de apresentação
        return getPreco() + 2.0;
    }
}