/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

/**
 *
 * @author eduar
 */
public class ContaSalario extends ContaBancaria {

    public ContaSalario(String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 1000) {
            System.out.println("Saque excede o limite permitido.");
        } else if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}