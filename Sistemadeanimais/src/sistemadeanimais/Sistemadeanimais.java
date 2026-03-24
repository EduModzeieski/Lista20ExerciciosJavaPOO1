/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeanimais;

/**
 *
 * @author eduar
 */
public class Sistemadeanimais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex", 3, 20.5);
        Animal a2 = new Gato("Mimi", 2, 5.0);
        Animal a3 = new Vaca("Mimosa", 5, 300.0);
        Animal a4 = new Cavalo("Pé de Pano", 4, 250.0);

        // Testando polimorfismo
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();
    }
    
}
