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
public class Quadrado extends Forma {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    // Getter e Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}