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
public class Tablet extends Dispositivo {

    public Tablet(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getModelo() + " está sendo usado para leitura ou desenho.");
    }
}