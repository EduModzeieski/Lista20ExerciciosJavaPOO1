/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeimoveis;

/**
 *
 * @author eduar
 */
public class Sistemadeimoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Casa casa = new Casa("Rua A", 300000, 120);
        Apartamento apt = new Apartamento("Av B", 250000, 80);
        Terreno terreno = new Terreno("Rua C", 150000, 200);
        SalaComercial sala = new SalaComercial("Centro", 400000, 100);

        System.out.println("Casa imposto: R$ " + casa.calcularImposto());
        System.out.println("Apartamento imposto: R$ " + apt.calcularImposto());
        System.out.println("Terreno imposto: R$ " + terreno.calcularImposto());
        System.out.println("Sala Comercial imposto: R$ " + sala.calcularImposto());
    }
}