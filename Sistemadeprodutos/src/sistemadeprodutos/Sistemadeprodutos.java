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
public class Sistemadeprodutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1 = new Livro("Java Básico", 50, 2);
        Produto p2 = new Eletronico("Celular", 1000, 1);
        Produto p3 = new Roupa("Camiseta", 80, 3);
        Produto p4 = new Alimento("Maçã", 5, 10);

        Produto[] produtos = {p1, p2, p3, p4};

        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome());
            System.out.println("Preço final: R$ " + p.calcularPrecoFinal());
            System.out.println("----------------------");
        }
    }
}