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
public class Sistemadeveiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Toyota", "Corolla", 2022);
        Veiculo v2 = new Moto("Honda", "CB500", 2021);
        Veiculo v3 = new Bicicleta("Caloi", "Elite", 2020);
        Veiculo v4 = new Onibus("Mercedes", "Urbano", 2019);

        // Polimorfismo
        v1.mover();
        v2.mover();
        v3.mover();
        v4.mover();
    }
}
