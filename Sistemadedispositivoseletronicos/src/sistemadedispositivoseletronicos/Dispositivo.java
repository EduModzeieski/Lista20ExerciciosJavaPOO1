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
public class Dispositivo {
    private String marca;
    private String modelo;
    private boolean ligado;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        ligado = true;
        System.out.println(modelo + " foi ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(modelo + " foi desligado.");
    }

    public void executarFuncao() {
        System.out.println(modelo + " executando função básica.");
    }
}