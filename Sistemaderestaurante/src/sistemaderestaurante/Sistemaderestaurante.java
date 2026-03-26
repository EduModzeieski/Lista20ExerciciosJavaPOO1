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
public class Sistemaderestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Calabresa", 30.0, "Pizza com calabresa e queijo");
        Hamburguer hamb = new Hamburguer("X-Burguer", 20.0, "Hambúrguer com queijo");
        Bebida bebida = new Bebida("Refrigerante", 8.0, "Bebida gelada");
        Sobremesa sobremesa = new Sobremesa("Sorvete", 12.0, "Sorvete de chocolate");

        pizza.preparar();
        System.out.println("Preço: R$ " + pizza.calcularPreco());

        System.out.println();

        hamb.preparar();
        System.out.println("Preço: R$ " + hamb.calcularPreco());

        System.out.println();

        bebida.preparar();
        System.out.println("Preço: R$ " + bebida.calcularPreco());

        System.out.println();

        sobremesa.preparar();
        System.out.println("Preço: R$ " + sobremesa.calcularPreco());
    }
}