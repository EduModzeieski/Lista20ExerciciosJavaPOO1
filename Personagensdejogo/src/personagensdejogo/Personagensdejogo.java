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
public class Personagensdejogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Aragorn", 100, 10);
        Mago m = new Mago("Gandalf", 80, 12);
        Arqueiro a = new Arqueiro("Legolas", 90, 11);
        Paladino p = new Paladino("Uther", 110, 13);

        g.atacar();
        g.defender();

        m.atacar();
        m.defender();

        a.atacar();
        a.defender();

        p.atacar();
        p.defender();
    }
}