/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaformasgeometricas;

/**
 *
 * @author eduar
 */
public class Forma {
    private String nome;

    // Construtor
    public Forma(String nome) {
        this.nome = nome;
    }

    // Método
    public double calcularArea() {
        return 0; // padrão
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}