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
public class Personagem {
    private String nome;
    private int vida;
    private int nivel;

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque básico!");
    }

    public void defender() {
        System.out.println(nome + " está se defendendo!");
    }
}