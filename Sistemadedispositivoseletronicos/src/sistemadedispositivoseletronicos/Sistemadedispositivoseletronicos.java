/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadedispositivoseletronicos;

/**
 *
 * @author eduar
 */
public class Sistemadedispositivoseletronicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador pc = new Computador("Dell", "Inspiron");
        Smartphone cel = new Smartphone("Samsung", "Galaxy S");
        Tablet tab = new Tablet("Apple", "iPad");
        Televisao tv = new Televisao("LG", "SmartTV");

        pc.ligar();
        pc.executarFuncao();
        pc.desligar();

        System.out.println();

        cel.ligar();
        cel.executarFuncao();
        cel.desligar();

        System.out.println();

        tab.ligar();
        tab.executarFuncao();
        tab.desligar();

        System.out.println();

        tv.ligar();
        tv.executarFuncao();
        tv.desligar();
    }
}