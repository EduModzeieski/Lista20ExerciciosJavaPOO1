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
public class Paladino extends Personagem {

    public Paladino(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com poder sagrado!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " se protegeu com luz divina!");
    }
}