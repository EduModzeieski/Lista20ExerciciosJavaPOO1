/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagensdejogo;

/**
 *
 * @author eduar
 */
public class Arqueiro extends Personagem {

    public Arqueiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " disparou uma flecha!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " desviou rapidamente!");
    }
}