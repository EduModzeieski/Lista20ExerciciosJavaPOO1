/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaformasgeometricas;

import java.util.ArrayList;

public class Sistemaformasgeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Quadrado("Quadrado", 4));
        formas.add(new Retangulo("Retângulo", 5, 3));
        formas.add(new Circulo("Círculo", 2.5));
        formas.add(new Triangulo("Triângulo", 6, 2));

        for (Forma f : formas) {
            System.out.println("Forma: " + f.getNome());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("----------------------");
        }
    }
}