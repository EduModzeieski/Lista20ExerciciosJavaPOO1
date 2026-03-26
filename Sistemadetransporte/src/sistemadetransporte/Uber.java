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
public class Uber extends Transporte {

    public Uber(int capacidade, String empresa, double tarifaBase) {
        super(capacidade, empresa, tarifaBase);
    }

    @Override
    public double calcularTarifa() {
        return getTarifaBase() * 1.5;
    }
}