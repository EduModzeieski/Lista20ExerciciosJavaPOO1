/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadetransporte;

/**
 *
 * @author eduar
 */
public class Sistemadetransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Taxi taxi = new Taxi(4, "CooperTaxi", 10);
        Uber uber = new Uber(4, "Uber", 12);
        Onibus onibus = new Onibus(50, "Transurb", 5);
        Metro metro = new Metro(200, "MetroSP", 6);

        System.out.println("Taxi: R$ " + taxi.calcularTarifa());
        System.out.println("Uber: R$ " + uber.calcularTarifa());
        System.out.println("Ônibus: R$ " + onibus.calcularTarifa());
        System.out.println("Metrô: R$ " + metro.calcularTarifa());
    }
}