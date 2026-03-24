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
public class Cavalo extends Animal {

    public Cavalo(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Ihinrrr!");
    }    
}
