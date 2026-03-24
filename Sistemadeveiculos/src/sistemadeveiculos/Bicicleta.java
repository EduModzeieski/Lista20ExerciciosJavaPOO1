/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeveiculos;

/**
 *
 * @author eduar
 */
public class Bicicleta extends Veiculo {

    public Bicicleta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println(getModelo() + " está sendo pedalada.");
    }
}