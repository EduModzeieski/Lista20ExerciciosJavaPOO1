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
public class Transporte {
    private int capacidade;
    private String empresa;
    private double tarifaBase;

    public Transporte(int capacidade, String empresa, double tarifaBase) {
        this.capacidade = capacidade;
        this.empresa = empresa;
        this.tarifaBase = tarifaBase;
    }

    // Getters e Setters
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double calcularTarifa() {
        return tarifaBase;
    }
}